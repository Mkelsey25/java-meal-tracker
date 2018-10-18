package com.mealtracker;
//creates user class and defines fields
class User {

    public final String mFirstName;
    public final String mLastName;
    public final String mEmail;
    public final double mTargetAdherence;
    //Constructs a user instance
    User(String firstName, String lastName, String email, double target) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mEmail = email;
        //targetAdherence is adherence to the meal plan
        this.mTargetAdherence = target;
    }
    //These functions return the values for the fields
    String getFirstName() {
        return this.mFirstName;
    }

    String getLastName() {
        return this.mLastName;
    }

    String getEmail() {
        return this.mEmail;
    }

    double getTargetAdherence() {
        return this.mTargetAdherence;
    }

}
