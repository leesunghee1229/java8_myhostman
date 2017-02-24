package ch01.sec07;

import java.util.Random;

/**
 * Created by 이성희 on 2017-02-20.
 */
public class ForDemo {
    public static void main(String[] args) {

        Random generator = new Random();
        int count = 20;
        int sum = 0;

        for(int i = 1; i<=count; i++) {
            int next = generator.nextInt(10);
            sum = sum + next;
        }

        System.out.println("After " + count + " iterations, there was a values of " + sum);

    }
}
