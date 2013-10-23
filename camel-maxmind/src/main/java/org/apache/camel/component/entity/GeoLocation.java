package org.apache.camel.component.entity;

import com.maxmind.geoip.Location;

public class GeoLocation extends Location {
	public String countryCode;
	public String countryName;
	public String region;
	public String city;
	public String postalCode;
	public float latitude;
	public float longitude;
	public int dmaCode;
	public int areaCode;
	public int metroCode;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public int getDmaCode() {
		return dmaCode;
	}
	public void setDmaCode(int dmaCode) {
		this.dmaCode = dmaCode;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public int getMetroCode() {
		return metroCode;
	}
	public void setMetroCode(int metroCode) {
		this.metroCode = metroCode;
	}
	@Override
	public String toString() {
		return "GeoLocation [countryCode=" + countryCode + ", countryName="
				+ countryName + ", region=" + region + ", city=" + city
				+ ", postalCode=" + postalCode + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", dmaCode=" + dmaCode
				+ ", areaCode=" + areaCode + ", metroCode=" + metroCode + "]";
	}
}
