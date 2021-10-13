package intro2;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.println("パスワードを入力してください");
        String str = in.nextLine();

        while (! "abc".equals(str)){
            System.out.println("パスワードが違います");
            str = in.nextLine();

        }
        System.out.println("OK");
    }
}
/*
 Scanner in = new Scanner((System.in))
 キーボード用の入力をします、の宣言
 String str = in.nextLine();
 文字列で入力した結果を返すと宣言
  while (! "abc".equals(str))
  ”abc""str"は一致していないは
  equals（一致）　文字型で参照する場合に使用します
  System.out.println("パスワードが違います");
  パスワードが違いますを出力




 */
