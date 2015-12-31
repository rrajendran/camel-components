Camel Component Maxmind [![Build Status](https://travis-ci.org/rrajendran/camel-components.svg)](https://travis-ci.org/rrajendran/camel-components)
=======================

The maxmind: component provides a bridge for Camel components to talk to maxmind geoip.
 
DEPENDENCY
============
Maven users will need to add the following dependency to their pom.xml for this component:

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
		
Bean Defintion
=============
<bean id="lookupService" class="com.maxmind.geoip.LookupService">
		<argument  value="src/main/resources/maxmind/GeoLiteCity.dat"/>
</bean>

URI format
=====
maxmind://lookupService?query=213.52.50.8


Options
=======
query - query represents ipaddress or domain name. Returns org.apache.camel.component.entity.GeoLocation.class object.
