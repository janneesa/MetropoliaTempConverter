package org.example;
public class TempConverter {
	
	public static int convertFahr(int f) {
		int c=  (int)((f-32) * 5.0/9.0);
		return c;
	}

	//This method convert thr cel to fsh
	public static int convertCel(int c){
		return (int) ((c * 9.0 / 5.0) + 32);
	}

	public static int kelvintoCel(int kel){
		return (int) (kel-273.15);
	}

	public static  double	kelvinToFah(double kel) {
		return Math.round((kel-273.15)* (9/5) + 32);
	}

	public static void main(String [] args) {
// Test convertFahr method
		int fahrenheit = 212;
		int celsius = convertFahr(fahrenheit);
		System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

		// Test convertCel method
		int cel = 100;
		int fahr = convertCel(cel);
		System.out.println(cel + " Celsius is equal to " + fahr + " Fahrenheit.");

		// Test kelvintoCel method
		int kelvin = 273;
		int celsiusFromKelvin = kelvintoCel(kelvin);
		System.out.println(kelvin + " Kelvin is equal to " + celsiusFromKelvin + " Celsius.");


		double kel = 300.1;
		double far = kelvinToFah(kel);
		System.out.println(kel + " Kelvin is equal to  " + kelvinToFah(kel) + " Fahrenheit.");


	}
}
