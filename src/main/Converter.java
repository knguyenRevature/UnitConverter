package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (menuSelection != 4) {
			System.out.println("--- Main Menu ---");
			System.out.println("Please select an option:");
			System.out.println("1. Volume Conversions");
			System.out.println("2. Length Conversions");
			System.out.println("3. Temperature Converstions");
			System.out.println("4. Close");
			
			menuSelection = Integer.parseInt(scanner.nextLine());
			
			switch(menuSelection) {
				case 1:
					volumeConversionMenu(scanner);
					break;
				case 2:
					lengthConversionMenu(scanner);
					break;
				case 3:
					temperatureConversionMenu(scanner);
					break;
				case 4:
					System.out.println("\nClosing application.\n");
					break;
				default:
					System.out.println("\nInvalid selection.\n");
					break;
			}
		}
		scanner.close();
	}
	
	public static void volumeConversionMenu(Scanner scanner) {
		int subMenuSelection = 0;
		
		while (subMenuSelection != 3) {
			System.out.println("\n--- Volume Conversions ---");
			System.out.println("Please select an option:");
			System.out.println("1. US Cup to Liter");
			System.out.println("2. US Teaspoon to US Cup");
			System.out.println("3. Return to Main Menu");
			
			subMenuSelection = Integer.parseInt(scanner.nextLine());
			
			switch (subMenuSelection) {
				case 1:
					volumeConversion(subMenuSelection, scanner);
					break;
				case 2:
					volumeConversion(subMenuSelection, scanner);
					break;
				case 3:
					System.out.println("\nReturning to Main Menu.\n");
					break;
				default:
					System.out.println("\nInvalid selection.\n");
					break;
			}
		}
	}
	
	public static void volumeConversion(int selection, Scanner scanner) {
		System.out.println("\nEnter value:");
		double value = Double.parseDouble(scanner.nextLine());
		
		if (selection == 1) { //US Cup to Liter
			double result = value * 0.236588;
			if (value < 1) {
				System.out.println(value + " US Cup = " + result + " Liter");
			} else if (value > 1 && result < 1){
				System.out.println(value + " US Cups = " + result + " Liter");
			} else {
				System.out.println(value + " US Cups = " + result + " Liters");
			}
		} else if (selection == 2) { //US Teaspoon to US Cup
			double result = value * 0.0208333;
			if (value < 1) {
				System.out.println(value + " US Teaspoon = " + result + " US Cup");
			} else if (value > 1 && result < 1){
				System.out.println(value + " US Teaspoons = " + result + " US Cup");
			} else {
				System.out.println(value + " US Teaspoons = " + result + " US Cups");
			}
		}
	}
	
	public static void lengthConversionMenu(Scanner scanner) {
		int subMenuSelection = 0;
		
		while (subMenuSelection != 4) {
			System.out.println("\n--- Length Conversions ---");
			System.out.println("Please select an option:");
			System.out.println("1. Foot to Meter");
			System.out.println("2. Mile to Kilometer");
			System.out.println("3. Inch to Centimeter");
			System.out.println("4. Return to Main Menu");
			
			subMenuSelection = Integer.parseInt(scanner.nextLine());
			
			switch (subMenuSelection) {
				case 1:
					lengthConversion(subMenuSelection, scanner);
					break;
				case 2:
					lengthConversion(subMenuSelection, scanner);
					break;
				case 3:
					lengthConversion(subMenuSelection, scanner);
					break;
				case 4:
					System.out.println("\nReturning to Main Menu.\n");
					break;
				default:
					System.out.println("\nInvalid selection.\n");
					break;
			}
		}
	}
	
	public static void lengthConversion(int selection, Scanner scanner) {
		System.out.println("\nEnter value:");
		double value = Double.parseDouble(scanner.nextLine());
		
		if (selection == 1) { //Foot to Meter
			double result = value * 0.3048;
			if (value < 1) {
				System.out.println(value + " Foot = " + result + " Meter");
			} else if (value > 1 && result < 1){
				System.out.println(value + " Feet = " + result + " Meter");
			} else {
				System.out.println(value + " Feet = " + result + " Meters");
			}
		} else if (selection == 2) { //Mile to Kilometer
			double result = value * 1.60934;
			if (value < 1 && result < 1) {
				System.out.println(value + " Mile = " + result + " Kilometer");
			} else if (value < 1 && result > 1){
				System.out.println(value + " Mile = " + result + " Kilometers");
			} else {
				System.out.println(value + " Miles = " + result + " Kilometers");
			}
		} else if (selection == 3) { //Inch to Centimeter
			double result = value * 2.54;
			if (value < 1 && result < 1) {
				System.out.println(value + " Inch = " + result + " Centimeter");
			} else if (value < 1 && result > 1){
				System.out.println(value + " Inch = " + result + " Centimeters");
			} else {
				System.out.println(value + " Inches = " + result + " Centimeters");
			}
		}
	}
	
	public static void temperatureConversionMenu(Scanner scanner) {
		int subMenuSelection = 0;
		
		while (subMenuSelection != 3) {
			System.out.println("\n--- Temperature Conversions ---");
			System.out.println("Please select an option:");
			System.out.println("1. Fahrenheit to Celsius");
			System.out.println("2. Fahrenheit to Kelvin");
			System.out.println("3. Return to Main Menu");
			
			subMenuSelection = Integer.parseInt(scanner.nextLine());
			
			switch (subMenuSelection) {
				case 1:
					temperatureConversion(subMenuSelection, scanner);
					break;
				case 2:
					temperatureConversion(subMenuSelection, scanner);
					break;
				case 3:
					System.out.println("\nReturning to Main Menu.\n");
					break;
				default:
					System.out.println("\nInvalid selection.\n");
					break;
			}
		}
	}
	
	public static void temperatureConversion(int selection, Scanner scanner) {
		System.out.println("\nEnter value:");
		double value = Double.parseDouble(scanner.nextLine());
		
		if (selection == 1) { //Fahrenheit to Celsius
			double result = (value - 32) * 5 / 9;
			System.out.println(value + " Fahrenheit = " + result + " Celsius");
		} else if (selection == 2) { //Fahrenheit to Kelvin
			double result = ((value - 32) * 5 / 9) + 273.15;
			System.out.println(value + " Fahrenheit = " + result + " Kelvin");
		}
	}
}
