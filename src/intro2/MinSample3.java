package intro2;

import java.util.Arrays;

public class MinSample3 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int i = 0;
        //最小値を保存する変数の宣言と初期化
        int min = array[0];//仮の最小値として配列の最初の要素を代入

        //判定処理をしつつ最小値を探す
        while (i < array.length) {
            //変数minの値より比較した配列の要素が小さければ最小値を更新
            if (min > array[i]) min = array[i];
            i++;
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));

        //最小値を表示
        System.out.println("配列の最小値:" + min);

    }

}
