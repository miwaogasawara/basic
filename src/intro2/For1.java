package intro2;

public class For1 {
    public static void main(String[] args) {
//      for命令のサンプル　1
       int sum = 0;
       for (int i =1; i <= 100; i++) {
           sum += i;
           System.out.println(i + "回目:" + sum);
       }
    }
}


/*
教科書　P40~,
PDF8 参照

i=1~100まで代入し加算するを繰り返す。結果は1回目～１００回目まで出力。
変化する物は２個設定することもできるが、例外的。


 */
