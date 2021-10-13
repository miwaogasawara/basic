package intro2;

import java.util.Arrays;

public class AveSample3 {
    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {20,30,10,50,40};
        int i = 0;
        //反復処理をしつつ合計を求める
        while ( i < array.length) {
            int sum = 0;
            double ave = 0;
            sum += array[i];//合計に加算
            i++;
            System.out.println(Arrays.toString(array));
            System.out.println("平均:" + ave);
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)


        //平均を求める


        //平均の表示

    }
}
/*
//合計を保存する変数の宣言
 //平均を保存する変数の宣言
 */
