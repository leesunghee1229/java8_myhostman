package ch01.sec08;

import java.util.Arrays;

/**
 * Created by 이성희 on 2017-02-20.
 */
public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] square = {
                { 16, 3, 2, 13 },
                { 3, 10, 11, 8 },
                { 9, 6, 7, 12 },
                { 4, 15, 14, 1}
        };

        // Swap two rows
        int[] temp = square[0];
        square[0] = square[1];
        square[1] = temp;
        System.out.println(Arrays.deepToString(square));

        // todo
    }
}
