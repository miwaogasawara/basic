package intro2;

public class For2 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}

/*

配列宣言
int[] array = {20,30,10,50,40};
簡略した構文でこちらが一般的、入力数値は変更することができません。
array.length：要素すべてを意味します,先頭から全部。
System.out.println(array[i])：変化したiをすべて出力

 */