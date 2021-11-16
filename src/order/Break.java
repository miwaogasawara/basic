package order;
//breakサンプル
public class Break {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5};
        //負の数値を発見したら中断する
        for (int value:array) {
            if (value<0) break;//負の数なら中断
            System.out.println(value);//1 2
        }
    }
}
/*
参照先
Let'sプログラミング　https://www.javadrive.jp/start/for/index9.html
 */
