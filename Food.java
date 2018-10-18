//The files are combined into a package to be used by the program
package com.mealtracker;
//We import ArrayList from the Java library
import java.util.ArrayList;
//Create the food class
class Food {
//Create fields which are similar to attributes 
//Must define public v. private
//Fields are typically private so a use can't change setup
    private final String mName;
    private final Category mCategory;
    
    private final double mCalories;
    private final double mCarbohydrates;
    private final double mFat;
    private final double mProtein;

    private final ArrayList<Category> mCategories = new ArrayList<>();
    //This function is similar to a constructor 
    //It assigns the field values to create the food instance
    Food(String name, double carbs, double fat, double protein, Category category) {
        this.mName = name;
        this.mCategory = category;
        this.mCarbohydrates = carbs;
        this.mFat = fat;
        this.mProtein = protein;
        //Calories isn not defined upon entry, so it must be calculated in a function below
        this.mCalories = calculateCalories(carbs, fat, protein);
    }
    //Private static was used because this value is not given, but must be calculated. It is associated with the class not the instance
    private static double calculateCalories(double carbs, double fat, double protein) {
        return 9 * fat + 4 * carbs + 4 * protein;
    }
    //the get... functions return the values of the food instance
    double getCalories() {
        return this.mCalories;
    }

    double getCarbohydrates() {
        return this.mCarbohydrates;
    }

    Category getCategory() {
        return this.mCategory;
    }

    double getFat() {
        return this.mFat;
    }

    double getProtein() {
        return this.mProtein;
    }

    String getName() {
        return this.mName;
    }
    //void is used here because it has no return value
    //It is pushing to an array, not creating a new value
    void addCategory(Category category) {
        this.mCategories.add(category);
    }
}
