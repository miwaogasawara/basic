package intro2;

import java.util.Arrays;

public class LinearSearchSample {

    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {10,-10,20,100,0};

        //探索したい値を設定
        int searchValue = 100;

        //未発見であることを判定する変数を設定,未発見が”はい”
        boolean unDiscovered = true;

        //配列を表示・・{10,-10,20,100,0}
        System.out.println(Arrays.toString(array));

        //反復処理をしつつ探索
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                System.out.println("探索値:" + searchValue);
                System.out.println("配列の要素:" + i + "に存在します");
                unDiscovered = false;//未発見ではないことの設定
                break;//探索値を発見したので反復を中断
            }
        }

        //未発見の場合の表示・・・探索した結果全く該当数値がない場合の出力を表示
        if (unDiscovered) System.out.println("探索値:" + searchValue + "は見つかりませんでした");
    }
}


/*
https://www.codereading.com/algo_and_ds/algo/linear_search.html
リニアサーチの解説参照

 */