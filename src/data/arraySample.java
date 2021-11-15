package data;

import java.util.Arrays;

public class arraySample {
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        int[] array2 = array1;
        int[] array3 = Arrays.copyOf(array1,3);//array1の要素を３個コピーする
                                       //すべてコピーする場合は、Arrays.copyOf(array1, array1.length)と記載

        System.out.println("array1:" + Arrays.toString(array1));//array1:[10, 20, 30]
        System.out.println("array2:" + Arrays.toString(array2));//array2:[10, 20, 30]
        System.out.println("array3:" + Arrays.toString(array3));//array3:[10, 20, 30]

        array1[1] = 40;
        System.out.println("array1:" + Arrays.toString(array1));//array1:[10, 40, 30] ..インデックス1が40に上書き
        System.out.println("array2:" + Arrays.toString(array2));//array2:[10, 40, 30] ..インデックス1が40に上書き
        System.out.println("array3:" + Arrays.toString(array3));//array3:[10, 20, 30]..元のインデックスを保持（上書きされない）

    }
}
