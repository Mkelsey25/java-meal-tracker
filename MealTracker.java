package com.mealtracker;

import java.util.ArrayList;

class MealTracker {
    //creates an array of meals
    private final ArrayList<Meal> mMeals = new ArrayList<>();
    //This attribute will be in the user class and is defined by mUser
    private final User mUser;
    //constructs the meal tracker
    MealTracker(User user) {
        this.mUser = user;
     }
    
    void addMeal(Meal meal) {
        this.mMeals.add(meal);
    }

    boolean isOnTrack() {
        return this.getAdherence() >= this.mUser.getTargetAdherence();
    }

    double getAdherence() {
        int count = 0;

        for (Meal meal : this.mMeals) {
            if (meal.isComplete()) {
                count += 1;
            }
        }

        return count / this.mMeals.size() * 100;
    }

    int getMealCount() {
        return this.mMeals.size();
    }

    void viewMeals() {
        for (Meal meal : this.mMeals) {
            System.out.println(meal.getName());
        }
    }
}
