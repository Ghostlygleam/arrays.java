package by.vika.arraytask;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};

        System.out.println("1. Number of even numbers in the array " + countEvenNumbers(arr));
        System.out.println("2. Number of odd numbers in the array " + countOddNumbers(arr));
        System.out.println("3. Number of prime numbers in the array " + countPrimeNumbers(arr));
        System.out.println("4. Sum of all numbers in the array " + sumOfArray(arr));
        System.out.println("5. Difference between the sum of numbers " + differenceBetweenEvenOddIndexSum(arr));
        System.out.println("6. Number of zeros in the array " + countZeroes(arr));
    }

    // Method to count the number of even numbers in the array
    public static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Method to count the number of odd numbers in the array
    public static int countOddNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Method to count the number of prime numbers in the array
    public static int countPrimeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to calculate the sum of all numbers in the array
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the difference between the sum of numbers at even indices and the sum of numbers at odd indices
    public static int differenceBetweenEvenOddIndexSum(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        return evenSum - oddSum;
    }

    // Method to count the number of zeros in the array
    public static int countZeroes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }
}



