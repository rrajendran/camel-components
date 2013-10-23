package org.apache.camel.component.maxmind;

import org.apache.camel.CamelException;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;

import com.maxmind.geoip.LookupService;

/**
 * Represents a Maxmind endpoint.
 */
public class MaxmindEndpoint extends DefaultEndpoint {
	private String query;
	private LookupService lookupService;
	
    public MaxmindEndpoint() {
    }

    public MaxmindEndpoint(String uri, MaxmindComponent component) {
        super(uri, component);
    }

    @SuppressWarnings("deprecation")
	public MaxmindEndpoint(String endpointUri) {
        super(endpointUri);
    }

    public Producer createProducer() throws Exception {
        return new MaxmindProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
    	throw new CamelException("No consumer endpoint supported for maxmind");
    }

    public boolean isSingleton() {
        return true;
    }

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public LookupService getLookupService() {
		return lookupService;
	}

	public void setLookupService(LookupService lookupService) {
		this.lookupService = lookupService;
	}
}
