package god.d02string;

/**
 * Created by 이성희 on 2017-03-02.
 */
public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
//        sample.constructors();

//        sample.internCheck();

        String aa = String.format("ddd {0}","aa");

        System.out.println(aa);

    }

    public void constructors() {

        try {
            String a = "한글";
            byte[]  array1 = a.getBytes();
            for(byte data : array1) {
                System.out.print(data + "");
            }
            System.out.println("==");

            String a1 = new String(array1);
            System.out.println(a1);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void internCheck() {
        String text1 = "Java Basic";
        String text2 = "Java Basic";
        String text3 = new String("Java Basic");
        text3 = text3.intern();
        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text1.equals(text3));
    }

}
