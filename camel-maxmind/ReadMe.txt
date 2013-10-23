Camel Component Maxmind
=======================

This project is a template of a Camel component.

To build this project use

    mvn install

Include this in the camel context 
DEPENDENCY
============
<dependency>
	<groupId>com.maxmind.geoip</groupId>
	<artifactId>geoip-api</artifactId>
	<version>1.2.11</version>
</dependency>

<dependency>
	<groupId>org.apache.camel.component</groupId>
	<artifactId>camel-maxmind</artifactId>
	<version>${camel.version}</version>
	<type>bundle</type>
</dependency>
		
CAMEL CONTEXT
=============
<bean id="lookupService" class="com.maxmind.geoip.LookupService">
		<argument  value="src/main/resources/maxmind/GeoLiteCity.dat"/>
</bean>

ROUTE
=====
<route>
	<from uri="timer:foo?delay=500&amp;repeatCount=2"/>
	<to uri="maxmind://lookupService?query=213.52.50.8" />
	<log message="${body}" />
</route>		

    http://camel.apache.org/writing-components.html
    
