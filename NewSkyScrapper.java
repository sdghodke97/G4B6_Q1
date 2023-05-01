package com.gl.g4b6assignment2;


import java.util.*;

public class NewSkyScrapper {
		
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of floors in the building: ");
        int n = sc.nextInt();
        int[] floors = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the floor size given on day " + (i + 1) + ":");
            floors[i] = sc.nextInt();
        }
        sc.close();
        Stack<Integer> stack = new Stack<Integer>();
        int currentFloor = n - 1;
        for (int i = 0; i < n; i++) {
            if (floors[i] == currentFloor + 1) {
                System.out.println("Day: " + (i + 1));
                System.out.println(floors[i]+" ");
                currentFloor--;
                while (!stack.empty() && stack.peek() == currentFloor + 1) {
                    System.out.println(stack.pop());
                    currentFloor--;
                }
            } else {
                stack.push(floors[i]);
            }
        }
        while (!stack.empty()) {
            System.out.println();
            stack.pop();
        }
    }

}
