package intro2;

public class DoubleLoop {
    public static void main(String[] args) {
       //２次元配列
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
     System.out.println(array[0][2]);
     System.out.println(array[2][0]);

//すべての要素を出力する
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(array[i][j]);

            }

        }

    }
}
/*
int[][] array =
２重配列にしますよの宣言
 System.out.println(array[0][2]);0行２段・・3
 　　　[0]が１行目になります同じく［0]が１段目なので間違えなく！
 System.out.println(array[2][0]);２行・０段・・7

 */
