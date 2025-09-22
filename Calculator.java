package com.calculator;

import java.util.Scanner;
public class Calculator {
	
	      
	    public static double add(double a, double b) {
	        return a + b;
	    }
	    
	    public static double subtract(double a, double b) {
	        return a - b;
	    }
	    
	 
	    public static int multiply(int a, int b) {
	        return a * b;
	    }
	    
	    public static double multiply(double a, double b) {
	        return a * b;
	    }
	    
	    
	    public static double divide(double a, double b) {
	        if (b == 0) {
	            throw new ArithmeticException("Error: Division by zero is not allowed!");
	        }
	        return a / b;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String continueCalc;
	        
	        System.out.println("Welcome to the Java Console Calculator!");
	        System.out.println("Enter two numbers and an operator (+, -, *, /) for calculations.");
	        System.out.println("Type 'q' to quit at any time.\n");
	        
	        
	        while (true) {
	            try {
	                System.out.print("Enter first number: ");
	                double num1 = scanner.nextDouble();
	                
	                System.out.print("Enter operator (+, -, *, /): ");
	                String operator = scanner.next();
	                
	                System.out.print("Enter second number: ");
	                double num2 = scanner.nextDouble();
	                
	                double result = 0;
	                boolean Op = true;
	                
	                switch (operator) {
	                    case "+":
	                        result = add(num1, num2);
	                        break;
	                    case "-":
	                        result = subtract(num1, num2);
	                        break;
	                    case "*":
	                        result = multiply(num1, num2);
	                        break;
	                    case "/":
	                        result = divide(num1, num2);
	                        break;
	                    default:
	                        System.out.println("Invalid operator! Please use +, -, *, or /.");
	                        Op = false;
	                        break;
	                }
	                
	                if (Op) {
	                    System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result + "\n");
	                }
	                
	            } catch (ArithmeticException e) {
	                System.out.println(e.getMessage() + "\n");
	            } catch (java.util.InputMismatchException e) {
	                System.out.println("Invalid input! Please enter numeric values.\n");
	                scanner.next(); 
	            }
	            
	            
	            System.out.print("Do you want to perform another calculation? (y/n or q to quit): ");
	            continueCalc = scanner.next().toLowerCase();
	            if (continueCalc.equals("n") || continueCalc.equals("q")) {
	                System.out.println("Thanks for using the calculator! Goodbye.");
	                break;
	            }
	        }
	        
	        scanner.close();
	    }
	

}

