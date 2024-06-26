package com.coderscampus.readingUserInput;

import java.util.Scanner;

public class Unit3Exercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number between 50-300:");
        Integer inputNumber = getInputNumber(scanner);
        checkNumber(inputNumber);
        scanner.close();
    }

    public static Integer getInputNumber(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            try {
                Integer convertedInput = Integer.parseInt(input);
                if (convertedInput >= 50 && convertedInput <= 300) {
                    return convertedInput;
                } else {
                    System.out.println("No!");
                }
            } catch (NumberFormatException e) {
                System.out.println("No!");
            }
        }
    }

    public static void checkNumber(Integer number) {
        System.out.println("Yes!");
    }
}
