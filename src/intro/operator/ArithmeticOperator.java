package intro.operator;

public class ArithmeticOperator {
    public static void main(String[] args) {

//        算術演算子（二項演算子）

        int a = 5, b = 3;
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + "%" + b + "=" + (a % b));

        //算術演算子(単項演算子)
        //符号・インクリメント・デクリメント

        int e = 1, f = 2;
        System.out.println("算術演算子（単項)");
        System.out.println("-e: + -e");
        System.out.println("e: + e++");
        System.out.println("f: + ++f");
        System.out.println("e++ + ++f =" + (e++ + ++f));
        System.out.println("e: + e");
        System.out.println("f:" + f);

//ワイドニング

        int g;
        double h = 10;
        g = (int) h;


        //代入演算子
        int i, j;
        i = j = 10;
        System.out.println("i:" + i);
        System.out.println("j:" + j);


//複合代入演算子
        //例 x = x + 1;
        //x += 1;　と記述できる
        int x = 1;
        System.out.println(x+= 1);
//        X=X *10 は　X*＝10と同じ、前項でXは2になっているので、2*10＝20の結果になる
        System.out.println(x*= 10);
    }

}
