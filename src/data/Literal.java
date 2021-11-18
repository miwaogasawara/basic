package data;

public class Literal {
    public static void main(String[] args) {

//        整数リテラル
        int num1 = 10;
        int num2 = 012;
        int num3 = 0xa;
        int num4 = 0b1010;

        System.out.println(("num1:" + num1));//num1:10
        System.out.println(("num2:" + num2));//num2:10
        System.out.println(("num3:" + num3));//num3:10
        System.out.println(("num4:" + num4));//num4:10

//        型によるリテラル
        long num5 = 1L;
        float num6 = 3.14f;
        float num7 = 3f;
        double num8 = 3d;

        System.out.println(("num5:" + num5));//num5:1
        System.out.println(("num6:" + num6));//num6:3.14
        System.out.println(("num7:" + num7));//num7:3.0
        System.out.println(("num8:" + num8));//num8:3.0

//浮動小数点によるリテラル
        double num9 = 0.123e+2;//0.123の2乗
        double num10 = 0.123e-2;//0.123の-2乗

        System.out.println(("num9:" + num9));//num9:12.3
        System.out.println(("num10:" + num10));//num10: 0.00123

//        文字型リテラル
        char c1 = 'A';
        char c2 = '\u0041';
        char c3 = 65;

        System.out.println(("c1:" + c1));//c1:A
        System.out.println(("c2:" + c2));//c2:A
        System.out.println(("c3:" + c3));//c3:A

//        文字列型
            String str1 = "abc";
            String str2 ="あいうえお";
            String str3 = "\"猫\"";
            String str4 = "\"猫\"\n\"犬\"";// \n\改行
            String str5 = "\"\"";

        System.out.println(("str1:" + str1));//str1:abc
        System.out.println(("str2:" + str2));//str2:あいうえお
        System.out.println(("str3:" + str3));//str3:"猫"
        System.out.println(("str4:" + str4));//str4:"猫" 改行"犬"
        System.out.println(("str5:" + str5));//str5:""

     //型変換　
        // double型をString型に変換するには、「valuOfメソッド」
        double d2 = 123.45;
        String s = String.valueOf(d2);
        System.out.println("String型の値 : " + s);//String型の値 : 123.45

        //String型をdouble型に変換するには、「parseDoubleメソッド」
        String s1 = "123.45";
        double d = Double.parseDouble(s);
        System.out.println("double型の値 : " + d);//double型の値 : 123.45
    }

    }

