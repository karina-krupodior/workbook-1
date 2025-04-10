package com.pluralsight;

public class MathApp {


    public static void main(String[] args) {
// Question 1:
// declare variables here
        double bobSalary = 50000;
        double garySalary = 200000.99;

// then code solution
        double highestSalary = Math.max(bobSalary, garySalary);
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
        System.out.printIn("Highest salary is: " + highestSalary);
// REPEAT FOR NEXT EXERCISE

//   Question 2:  Find and display the smallest of two variables named carPrice and
//        truckPrice. Set the variables to any value you want
        double carPrice = 25000.500;
        double truckPrice = 75000.300;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest vehicle price is" + lowestPrice);

        // Question 3: Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius "+radius +" is "+areaOfCircle);


        // Question 4: Find and display the square root a variable after it is set to 5.0
        double number = 8.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of "+number +" is "+squareRoot);

        // Question 5: Find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between points is "+distance);

        // Question 6: Find and display the absolute (positive) value of a variable after it is set to -3.8
        double value = -3.8;
        double absoluteValue = Math.abs(value);
        System.out.println("The absolute value is:" + absoluteValue);

// 7: Find and display a random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("A random number: "+ randomNumber);

    }


}




    }