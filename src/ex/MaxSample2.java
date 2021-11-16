package ex;

import java.util.Arrays;

//配列の最大値 拡張for版
public class MaxSample2 {
    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {20,30,10,50,40};

        //最大値を保存する変数の宣言と初期化
        int max = array[0];//仮の最大値として配列の最初の要素を代入

        //判定処理をしつつ最大値を探す
        for (int value:array) {
            //変数maxの値より比較した配列の要素が大きければ最大値を更新
            if (max < value) max = value;
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));//[20, 30, 10, 50, 40]

        //最大値を表示
        System.out.println("配列の最大値:" + max);//配列の最大値:50
    }
}
