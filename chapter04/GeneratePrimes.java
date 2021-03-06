package com.zboot.cleancode.chapter04;

import java.util.Arrays;

public class GeneratePrimes {

    public static int[] generatePrimes(int maxValue) {
        if (maxValue >= 2) {
            int s = maxValue + 1;
            boolean[] f = new boolean[s];

            int i = 0;
            for (i = 0; i < s; i++) {
                f[i] = true;
                f[0] = f[1] = false;
            }
            int j = 0;
            for (i = 2; i < Math.sqrt(s) + 1; i++) {
                if (f[i]) {
                    for (j = 2 * i; j < s; j += i) {
                        f[j] = false;
                    }
                }
            }
            int count = 0;
            for (i = 0; i < s; i++) {
                if (f[i]) {
                    count++;
                }
            }
            int[] primes = new int[count];

            for (i = 0, j = 0; i < s; i++) {
                if (f[i]) {
                    primes[j++] = i;
                }
            }
            return primes;
        } else {
            return new int[0];
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generatePrimes(2)));
    }
}
