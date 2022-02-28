package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		FoodTruck[] foodTrucks = new FoodTruck[4];

		System.out.println("Hello! thanks for reviewing the food trucks, please enter up to 5 trucks to review");
		System.out.println("");
		for (int i = 0; i < foodTrucks.length; i++) {

			System.out.println("What is the name of the food truck you are reviewing? (enter quit to continue:) ");
			String foodTruckName = kb.nextLine();

			if (foodTruckName.equalsIgnoreCase("quit")) {
				break;
			}
			else {
				
			}
			
			
			
			
			
			System.out.println("What is the cusinine of this this food truck: ");
			String foodType = kb.nextLine();

			System.out.println("How would you rate this truck on a scale of 1-5: ");
			int truckRating = kb.nextInt();
			kb.nextLine();
			foodTrucks[i] = new FoodTruck(foodTruckName, foodType, truckRating);
		}
		

		boolean loop = true;
		int choice = 0;

		while (loop) {
			System.out.println("------------------------------------------");
			System.out.println("    #  MILE HIGH CITY STREET FOOD  #      ");
			System.out.println("");
			System.out.println("       Options:                           ");
			System.out.println("");
			System.out.println(" 1. List all trucks");
			System.out.println(" 2.See the average rating of the trucks");
			System.out.println(" 3. Display the highest rated truck");
			System.out.println(" 4. quit");
			System.out.println("");
			System.out.println("------------------------------------------");
			choice = kb.nextInt();

			if (choice >= 0 || choice <= 5) {

			}
			switch (choice) {
			case 1:

				System.out.println("The trucks: ");
				foodTrucks[0].displayAllTrucks(foodTrucks);

				break;
			case 2:
				System.out.println("Here are the average ratings of the food trucks: ");
				foodTrucks[0].displayAverageRating(foodTrucks);
				break;
			case 3:
				System.out.println("The highest rated food truck is...: ");
				foodTrucks[0].highestRated(foodTrucks);

				break;
			case 4:
				System.out.println("Thank you for rating the trucks!");
				loop = false;
				return;
			default:
				System.out.println(("Invalid selection, please try again"));
				break;
			}
		}
	}
}
		



