package edu.hawaii.ics613;

/**
 * Prints the largest prime factor of 600851475143.
 *
 * Created by Branden Ogata on 2/1/2015.
 */

public class ProjectEulerThree {
  public static void main(String[] args) {
    long largestPrimeFactor = 0;
    long number = 600851475143l;

    for (long i = 1; i < Math.sqrt(number); i++) {
      if ((number % i == 0) && isPrime(i)) {
        largestPrimeFactor = i;
      }
    }

    System.out.format("Largest Prime Factor of %d: %d%n", number, largestPrimeFactor);
  }

  /**
   * Indicates whether a number is prime.
   *
   * @param number The long equal to the number to check for primeness.
   * @return A boolean that is true if the given number is prime,
   *                           false otherwise.
   */

  public static boolean isPrime(long number) {
    for (int i = 2; i < Math.sqrt(number); i++) {
      // If any number less than the parameter evenly divides the parameter,
      // then the number cannot be prime
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }
}
