package intro2;

import java.util.Arrays;

public class SumSample3 {
    public static void main(String[] args) {

        int[] array = {20,30,10,50,40};
        int i = 0;
        int sum = 0;
        while( i < array.length) {
            sum += array[i];//合計に加算
            i++;


        }
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));

        //合計を表示
         System.out.println("配列の合計:" + sum);

    }
}

/*
練習：whileに変更する
//整数型配列の宣言
 //反復処理をしつつ合計を求める
 //合計を保存する変数の宣言
  //配列の内容を表示


 */