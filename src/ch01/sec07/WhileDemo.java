package ch01.sec07;

import java.util.Random;

/**
 * Created by 이성희 on 2017-02-20.
 */
public class WhileDemo {
    public static void main(String[] args) {

        Random generator = new Random();

        int sum = 0;
        int target = 90;
        int count = 0;

        while(sum < target) {
            int next = generator.nextInt(10);
            sum = sum + next;
            count++;
        }

        System.out.println(sum);
    }
}
