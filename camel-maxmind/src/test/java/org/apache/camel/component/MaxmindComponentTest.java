package org.apache.camel.component;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class MaxmindComponentTest extends CamelTestSupport {

    @Test
    public void testMaxmind() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMinimumMessageCount(1);       
        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                from("timer:foo?delay=10&repeatCount=2")
                  .to("maxmind://foo?domain=bmw.com")
                  .log("Result : ${body}" )
                  .to("mock:result");
            }
        };
    }
}
