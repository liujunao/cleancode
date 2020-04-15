package com.zboot.cleancode.chapter10.first.mycleancode;

public class PrimeGenerator {

    private int[] primes;

    public int[] generate(int num_of_prime) {
        primes = new int[num_of_prime];
        set2AsFirstPrime();
        checkOddNumbersForSubsequentPrimes();
        return primes;
    }

    private void set2AsFirstPrime() {
        primes[0] = 2;
    }

    private void checkOddNumbersForSubsequentPrimes() {
        int primeIndex = 1;
        for (int oddNum = 3; primeIndex < primes.length; oddNum += 2) {
            if (isPrime(oddNum)) {
                primes[primeIndex] = oddNum;
                primeIndex++;
            }
        }
    }

    private boolean isPrime(int oddNum) {
        return true;
    }

}
