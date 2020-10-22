package com.moshcoder;

public class primeNumber66 {
    public static void main(String[] args) {
        int i;
        int num = 0;
        int maxCheck = 100; // maxCheck limit till which you want to find prime numbers
        boolean isPrime = true;

        //Empty String
        String primeNumbersFound = "";

        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }

    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }
/*How to display prime numbers between 1 to 100 using Java Code
Program Logic:
The main method contains a loop to check prime numbers one by one.
The main method calls the method CheckPrime to determine whether a number is prime
We need to divide an input number, say 17 from values 2 to 17 and check the remainder. If the remainder is 0 number is not prime.
No number is divisible by more than half of itself. So, we need to loop through just numberToCheck/2. If the input is 17, half is 8.5, and the loop will iterate through values 2 to 8
If numberToCheck is entirely divisible by another number, we return false, and loop is broken.
If numberToCheckis prime, we return true.
In the main method, check isPrime is TRUE and add to primeNumbersFound String
Lastly, print the results

 */
}
