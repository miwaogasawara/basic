package intro2;
//intとInteger
//参照先　https://www.fenet.jp/java/column/java_beginner/6602/#Integer-2
public class IntegerSample {
    //Integer型：int型と同じように–2147483648～2147483647の範囲にある整数値を保持する変数型
    //          「クラス型」と呼ばれる部類の変数型「メソッド」と呼ばれる便利な関数を持っています.
    //           int型をメソッドとして使用できるラッパークラス
    //           Integer型の変数を比較するときは、equalsメソッドやcompareToメソッドを使う
    public static void main(String[] args) {
        //Stringから int型に変換：int 変数名 = Integer.parseInt(文字列);
        String str = "10";//String型
        int i = Integer.parseInt(str);//int型に変換
        System.out.println(i);//10

        //Integer型変数を使う場合は、クラスを扱う場合と同様に記述。：Integer number（変数名） = 整数；
        Integer number = 15;

        //Integerからint型に変換
        int i1 = number.intValue();
        System.out.println(i1);//15

        //intからInteger型に変換
        Integer number1 = i1; //オートボクシングで変換される　Integer　number ＝　new Integer(i1)と同じ

        // IntegerからStringに変換
        Integer i2= Integer.valueOf(10);
        String str1 = "abc";
        String str2 = str1.concat(i2.toString());//concatメソッドの記述:元になる文字列.concat(結合したい文字列.変換したい型);
        System.out.println(str2); // abc10
    }
    }




