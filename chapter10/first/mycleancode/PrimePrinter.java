package com.zboot.cleancode.chapter10.first.mycleancode;

import java.util.Arrays;

public class PrimePrinter {

    public static void main(String[] args) {
        //获取想要的素数数组
        //按照需要的格式输出数组
        int num_of_prime = 1000;
        PrimeGenerator generator = new PrimeGenerator();
        int[] primes = generator.generate(num_of_prime);
        System.out.println(primes.length);
        String str_primes = Arrays.toString(primes);
        System.out.println("String:" + str_primes);
    }
}
