package org.apache.camel.component.maxmind;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;
import org.apache.camel.util.CamelContextHelper;

import com.maxmind.geoip.LookupService;

/**
 * Represents the component that manages {@link MaxmindEndpoint}.
 */
public class MaxmindComponent extends DefaultComponent {
	
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
    	LookupService lookupService = CamelContextHelper.mandatoryLookup(getCamelContext(), remaining, LookupService.class);
        Endpoint endpoint = new MaxmindEndpoint(uri, this);
        parameters.put("lookupService", lookupService);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
