package exercise2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Driver {

    public static final int SIZE = 100;
    public static final int UPPER_BOUND = 10;

    public static void main(String[] args) {

        Integer[] nums = new Integer[SIZE];
        Random rand = new Random();
        int randnum = rand.nextInt(UPPER_BOUND);
        nums[0] = randnum;

        for (int i = 1; i < SIZE; i++) {
            randnum = rand.nextInt(UPPER_BOUND);
            nums[i] = nums[i - 1] + randnum;
        }

        // Display the sorted array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(nums));

        // Prompt the user for an integer target
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target index: ");
        int target = scanner.nextInt();
        scanner.close();

        // Perform binary search
        int result = BinarySearch.binarySearch(nums, target);

        // Display the result
        if (result == -1) {
            System.out.println("Target not in array.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
