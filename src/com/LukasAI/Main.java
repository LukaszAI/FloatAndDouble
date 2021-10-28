package com.LukasAI;

public class Main {

    public static void main(String[] args) {

    float myMinFloatValueee = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float minimum value =" + myMinFloatValueee);
        System.out.println("float maximum value =" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value =" + myMinDoubleValue);
        System.out.println("double maximum value =" + myMaxDoubleValue);

        int myIntValue = 5 / 4;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue =" + myIntValue);
        System.out.println("myFloatValue =" + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
