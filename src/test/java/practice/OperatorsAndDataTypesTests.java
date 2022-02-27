package practice;

public class OperatorsAndDataTypesTests {

    // целочисленный тип
    byte aByte = 10; // 8 bit -128..127
    short aShort = 50; // 16 bit -32768..32767
    int anInt = 100; // 32 bit - 2^31...(2^31) - 1
    long aLong = 100L; // 64 bit - 2^63...(2^63) - 1

    // с плавающей точкой
    float aFloat = 0.0F; // 32 bit
    // самый используемый (если просто хранить, но не использовать арифметику)
    double aDouble = 0.0D; // 64 bit

    char aChar = 't'; // один символ
    boolean aBoolean = false; // логический типа

    String hello = "Hello World!";

    public static void main(String[] args) {

        int
                a = 10,
                b = 20,
                c = 25,
                d = 25;
        boolean
                t = true,
                f = false;
        byte
                bt = 127;
        long
                l = 30_000_000_000L;
        float
                n=1.75F;
        double
                db=5.75;
        char
                fn='a',
                ln='b';
        String
                hello = "Hello World!";

        System.out.println("a+b =" + (a + b));
        System.out.println("a-b =" + (a - b));
        System.out.println("a*b =" + (a * b));
        System.out.println("db/n =" + (db / n));
        System.out.println("db%n =" + (db % n));
        System.out.println("a++ =" + (a++));
        System.out.println("b-- =" + (b--));
        System.out.println("d++ =" + (d++));
        System.out.println("++d =" + (++d));
        System.out.println("d++ =" + (d++));
        System.out.println("--d =" + (--d));
        System.out.println("int + long =" + (c + l));
        System.out.println("a==b =" + (a == b));
        System.out.println("a !=b =" + (a != b));
        System.out.println("a > b =" + (a > b));
        System.out.println("a >= b =" + (a >= b));
        System.out.println("a < b =" + (a < b));
        System.out.println("a <= b =" + (a <= b));
        System.out.println("b <= a" + (b <= a));
        System.out.println("b >= a" + (b >= a));
        System.out.println("t $$ f=" + (t && f));
        System.out.println("t || f=" + (t || f));
        System.out.println("!(t $$ f)=" + !(t && f));
        System.out.println("Переполнение типа byte " + (bt + 1) + " " + (bt - 300));
        System.out.println(fn+ln);
        System.out.println(hello);
    }
}
