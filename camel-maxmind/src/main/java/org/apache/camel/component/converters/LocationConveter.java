package org.apache.camel.component.converters;

import org.apache.camel.Converter;
import org.apache.camel.component.entity.GeoLocation;

import com.maxmind.geoip.Location;

@Converter
public class LocationConveter {
	@Converter
	public GeoLocation convert(Location location){
		GeoLocation geoLocation = new GeoLocation();
		geoLocation.setAreaCode(location.area_code);
		geoLocation.setCity(location.city);
		geoLocation.setCountryCode(location.countryCode);
		geoLocation.setCountryName(location.countryName);
		geoLocation.setDmaCode(location.dma_code);
		geoLocation.setLatitude(location.latitude);
		geoLocation.setLongitude(location.longitude);
		geoLocation.setMetroCode(location.metro_code);
		geoLocation.setPostalCode(location.postalCode);
		geoLocation.setRegion(location.region);
		return geoLocation;
	}
}
