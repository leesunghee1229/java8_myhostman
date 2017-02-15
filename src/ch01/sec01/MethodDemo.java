package ch01.sec01;

import java.util.Random;

/**
 * Created by 이성희 on 2017-02-15.
 */
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("hello".length());

        System.out.println(new Random().nextInt(10));

        Random rnd = new Random();

        System.out.println(rnd.nextInt());

        System.out.println("11");
    }
}
