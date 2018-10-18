package com.mealtracker;

import java.util.ArrayList;

class Meal {
    //Array of food instances that make up the meal
    private final ArrayList<Food> mFoods = new ArrayList<>();
    //name of meal
    private final String mName;
    //constructs meal
    Meal (String name) {
        this.mName = name;
    }
    //the isComplete boolean is defined as false at first because the food needs to be eaten
    //This function creates a boolean isComplete for every category
    boolean isComplete() {
        boolean protein = false;
        boolean fat = false;
        boolean carbohydrates = false;
        boolean fruit = false;
        boolean vegetables = false;
        boolean pastry = false;
        boolean beer = false;
        //This for loop changes the boolean to true 
        //Switch case because meals don't need to have every category
        //Goes through meal (foods array) and finds category of every food instance in the array and switches the isComplete boolean value to true  
        for (Food food : this.mFoods) {
            switch (food.getCategory()) {
                case Protein:
                    protein = true;
                        break;
                case Carbohydrates: 
                    carbohydrates = true;
                    break;
                case Fat:
                    fat = true;
                    break;
                case Fruit:
                    fruit = true;
                    break;
                case Vegetable:
                    vegetables = true;
                    break;
                case Pastry: 
                    pastry = true;
                    break;
                case Beer:
                beer = true;
            }
        }

        return fat && protein && carbohydrates && vegetables && fruit && pastry && beer;
    }
    //calories consumed starts as zero because user has not completed the meal
    //When meal is submitted then the program moves through the food instances the meal is comprised of and adds the calorie values together to create a sum
    double getCalories() {
        double calories = 0;

        for (Food food : this.mFoods) {
            calories += food.getCalories();
        }

        return calories;
    }
    //same functionality as getCalories for the rest of the "double" functions
    double getFat() {
        double fat = 0;

        for (Food food : this.mFoods) {
            fat += food.getFat();
        }

        return fat;
    }

    
    double getCarbohydrates() {
        double carbohydrates = 0;

        for (Food food : this.mFoods) {
            carbohydrates += food.getCarbohydrates();
        }

        return carbohydrates;
    }

    double getProtein() {
        double protein = 0;

        for (Food food : this.mFoods) {
            protein += food.getProtein();
        }

        return protein;
    }
    //returns the name of the meal
    String getName() {
        return this.mName;
    }
    //void because there is no return value
    //prints names of foods in the meal
    void viewFoods() {
        for (Food food : this.mFoods) {
            System.out.println(food.getName());
        }
    }

}
