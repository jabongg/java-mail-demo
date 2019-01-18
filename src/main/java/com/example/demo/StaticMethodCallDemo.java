package com.example.demo;

public class StaticMethodCallDemo {


	private static final double EARTH_RADIUS = 5;

	public static int calculateDistance(GeoPoint locationL1, GeoPoint locationL2) {

		double latDistance = Math.toRadians(locationL1.getLatitude() - locationL2.getLatitude());
		double lngDistance = Math.toRadians(locationL1.getLongitude() - locationL2.getLongitude());

		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
				+ Math.cos(Math.toRadians(locationL1.getLatitude()))
						* Math.cos(Math.toRadians(locationL2.getLatitude())) * Math.sin(lngDistance / 2)
						* Math.sin(lngDistance / 2);

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		return (int) (Math.round(EARTH_RADIUS * c));
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}

}
