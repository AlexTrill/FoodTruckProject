package com.skilldistillery.foodtruck;


public class FoodTruck {

	// fields-------------------


	private String foodTruckName = "";
	private String menuType = "";
	private int rating = 0;
	private static int  nextId =1;
	private int  id;

	// constructors------------

	public FoodTruck() {

	}

	public FoodTruck(String foodTruckName, String menuType, int rating) {
		this.foodTruckName = foodTruckName;
		this.menuType = menuType;
		this.rating = rating;
		this.id = nextId;
		nextId++;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	public String toString() {
		String data = "Food truck name: " + foodTruckName + " Menu Type: " + menuType + " Rating: " + rating
				+ " Truck ID: " + id;
		return data;

	}

	public void truckInfo() {
		String data = this.toString();
		System.out.println(data);

	}


	public void displayAllTrucks(FoodTruck[] foodTrucks) {
		
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] != null) {
				System.out.println(foodTrucks[i].toString());
				

				
			}
		}
			}
	public void displayAverageRating(FoodTruck[] foodTrucks) {
		int number = 0;
		double sum=0;
		
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] == null) {
		continue;
			}
			sum += foodTrucks[i].getRating();
			number++;
		}
		
		double average = sum / number;
		System.out.println(average);
		
		
		}
	
	public void highestRated(FoodTruck[] foodTrucks) {
		FoodTruck highest = foodTrucks[0];
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] != null) {
				if (foodTrucks[i].rating > highest.rating) {
					highest = foodTrucks[i];
					
				}
			}

		}
		
		System.out.println("Highest rated: " + highest.toString());

	}
		
	
}





