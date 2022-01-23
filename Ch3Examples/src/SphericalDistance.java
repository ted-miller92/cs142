/* 
 * Theodore Miller
 * Assignment 3
 * This program calculates the distance between two point on a sphere (like Earth) 
*/

import java.util.*;	// includes Scanner

public class SphericalDistance {
	// define class constant for radius of Earth
	public static final double EARTHRADIUS = 6732.795;	// km
	
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	// prompt for input
	// first city
	System.out.print("City 1 Latitude: ");
	double city1Lat = console.nextDouble();
	System.out.print("City 1 Longitude: ");
	double city1Long = console.nextDouble();
	
	
	// second city
	System.out.print("City 2 Latitude: ");
	double city2Lat = console.nextDouble();
	System.out.print("City 2 Longitude: ");
	double city2Long = console.nextDouble();
	
	
	System.out.println("City 1 latitude: " + city1Lat +" and longitude: " + city1Long);
	System.out.println("City 2 latitude: " + city2Lat +" and longitude: " + city2Long);
	}
}