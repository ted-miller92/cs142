/*
 * Theodore Miller
 * Assignment 3
 * CSC 142 - Chris Denzler
 * This program calculates the distance between two point on a sphere
 * Uses a class constant to define the radius of planet Earth
 */

public class SphericalDistance {
    import java.util.*;	// includes Scanner

    public class SphericalDistance {
        // define class constant for radius of Earth in km
        public static final double EARTHRADIUS = 6732.795;

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            // prompt for input
            // first city, convert to radians right away
            System.out.print("City 1 Latitude: ");
            double lat1 = Math.toRadians(console.nextDouble());
            System.out.print("City 1 Longitude: ");
            double long1 = Math.toRadians(console.nextDouble());


            // second city, convert to radians right away
            System.out.print("City 2 Latitude: ");
            double lat2 = Math.toRadians(console.nextDouble());
            System.out.print("City 2 Longitude: ");
            double long2 = Math.toRadians(console.nextDouble());

            // testing input/output
            // System.out.println("City 1 latitude: " + lat1 +" radians, and longitude: " + long1 + " radians");
            // System.out.println("City 2 latitude: " + lat2 +" radians, and longitude: " + long2 + " radians");

            double distance = hav(lat1, lat2, long1, long2);

            System.out.println("The spherical distance between the two coordinates is: " + distance + " kilometers");
        }

        // Haversine formula method
        public static double hav(double lat1, double lat2, double long1, double long2) {

            // difference in latitude/longitude
            double deltaLat = lat2 - lat1;
            double deltaLong = long2 - long1;

            // using distance = 2piR * arcsin(squareroot(a))
            double a = Math.pow(Math.sin(deltaLat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(deltaLong / 2), 2);
            double b = 2 * Math.asin(Math.sqrt(a));
            System.out.println("b = " + b);
            System.out.println("a = " + a);
            return b * EARTHRADIUS;
        }
    }
}
