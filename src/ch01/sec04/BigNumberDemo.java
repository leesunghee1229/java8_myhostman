package ch01.sec04;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by 이성희 on 2017-02-15.
 */
public class BigNumberDemo {
    public static void main(String[] args) {

        BigInteger n = BigInteger.valueOf(876543210123456789L);
        BigInteger k = new BigInteger("9876543210123456789");

        // todo 참고표현 multiply(n.add(k)
        BigInteger r = BigInteger.valueOf(5).multiply(n.add(k)); // r = 5 * (n + k)
        System.out.println(r);
        System.out.println(2.0 - 1.1);

        // todo BigDecimal 사용법
        /**
         BigDecimal add(BigDecimal augend) //덧셈 + 연산
         BigDecimal subtract(BigDecimal subtrahend) //뺄셈 - 연산
         BigDecimal multiply(BigDecimal multiplicand) //곱셈 * 연산
         BigDecimal divide(BigDecimal divisor) //나눗셈 / 연산
         BigDecimal remainder(BigDecimal divisor) //나머지 % 연산
         */

        BigDecimal d = BigDecimal.valueOf(2, 0).subtract(BigDecimal.valueOf(11, 1));
        System.out.println(d);

        System.out.println(2-1);

    }
}
