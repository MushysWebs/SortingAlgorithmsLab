package exercise3;

import java.util.Random;
import java.util.Arrays;

public class Driver {

    public static final int SIZE = 100;
    public static final int UPPER_BOUND = 1000;

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please provide one of the following characters as an argument: b, i, s, or q.");
            return;
        }

        // Get the choice from the command line argument
        char choice = args[0].charAt(0);

        Integer[] nums = new Integer[SIZE];
        Random rand = new Random();

        for (int i = 0; i < SIZE; i++) {
            nums[i] = rand.nextInt(UPPER_BOUND);
        }

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(nums));

        switch (choice) {
            case 'b':
                BubbleSort.bubbleSort(nums);
                System.out.println("Try quick sort instead, input 'q' as an argument.");
                return;
            case 'i':
                InsertionSort.insertionSort(nums);
                System.out.println("Try quick sort instead, input 'q' as an argument.");
                return;
            case 's':
                SelectionSort.selectionSort(nums);
                System.out.println("Try quick sort instead, input 'q' as an argument.");
                return;
            case 'q':
                QuickSort.quickSort(nums, 0, nums.length - 1);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(nums));
    }
}
