package org.apache.camel.component.maxmind;

import java.io.IOException;

import org.apache.camel.CamelException;
import org.apache.camel.Exchange;
import org.apache.camel.component.entity.GeoLocation;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.maxmind.geoip.Location;
import com.maxmind.geoip.LookupService;

/**
 * The Maxmind producer.
 */
public class MaxmindProducer extends DefaultProducer {
	private static final Logger LOG = LoggerFactory.getLogger(MaxmindProducer.class);
	private MaxmindEndpoint endpoint;

	public MaxmindProducer(MaxmindEndpoint endpoint) throws IOException {
		super(endpoint);
		this.endpoint = endpoint;
	}

	public void process(Exchange exchange) throws Exception {
		validateInputs(exchange);
		LookupService lookupService = endpoint.getLookupService();
		if(lookupService == null)
			throw new CamelException("Unable to get lookupService reference :" + lookupService);
		Location location = lookupService.getLocation(endpoint.getQuery());
		
		if(location != null){
			GeoLocation geoLocation = endpoint.getCamelContext().getTypeConverter().convertTo(GeoLocation.class, location);
			exchange.getIn().setBody(geoLocation, GeoLocation.class);
		}
	}

	private boolean validateInputs(Exchange exchange) {
		return true;
	}

}
