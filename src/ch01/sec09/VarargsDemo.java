package ch01.sec09;

/**
 * Created by 이성희 on 2017-02-24.
 */
public class VarargsDemo {

    /**
     * 평균과 최대값을 구해라
     *
     * @param args
     */
    public static void main(String[] args) {
        double[] scores = { 3,4,5,9,7.3};
        System.out.println(average(scores));
        System.out.println(max(scores));
        System.out.println(max2(2,scores));
    }

    public static double average(double... values) {
        double sum = 0;
        for(double v : values) {
            sum += v;
        }
        return values.length > 0 ? sum/values.length:0;
    }

    public static double max2(double first, double... rest) {
        double result = first;
        for(double v : rest) {
            result = Math.max(v,result);
        }
        return result;
    }

    public static double max(double... values) {
        double max = 0;
        for(double v : values) {
            if(v > max) {
                max = v;
            }
        }
        return max;
    }
}
