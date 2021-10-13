package ex;

public class MaxSample {
    public static void main(String[] args) {
        int[]array = {20,30,10,50,40};
        int max  = array[0];
        int min = array[0];
        for (int num :array) {
        if(num > max) {
            max = num;
        }
            if (num < min){
                min = num;
            }
        }
        System.out.println("MAX" +max);
        System.out.println("MINI" +min);

        }
    }

/*
for文の中にif文を組み合わせた書き方

int[]array = {20,30,10,50,40};　配列の宣言
        int max  = array[0]; 仮の最大値
        int min = array[0];仮の最小値
        for (int num :array) {　・・・num:arrayを先頭から最後まで順に入力します
        if(num > max) {　　　　　・・・先頭20と次の30を比較して、終了したら大きい値と次の値を比較する
            max = num;　最大値の更新（比較した結果大きな値をMAXとする）
        }
        for (int num1 : array){
            if (num1 < min){
                min = num1;　最小値の更新（比較した結果小さな値をMINとする）
            }
        }
        System.out.println("MAX" +max);最大値の出力
        System.out.println("MINI" +min);最小値の出力

   　　　結果
   　　　　MAX50
　　　　　　MINI10
 */
