package intro2;

public class While1 {
    public static void main(String[] args) {
        //１～１０までを加算
        int sum = 0;//合計を初期化
        int i = 1;//繰り返しの変数を初期化
        while (i<=10) {
            sum += i;//合計を計算する
            System.out.println(i + "回目: " + sum);
            i++;//iを増やす
        }
    }
}
/*
結果
１回目：1
2回目: 3
3回目: 6
4回目: 10
5回目: 15
6回目: 21
7回目: 28
8回目: 36
9回目: 45
10回目: 55

※while文で無限ループを行う
while 文で無限ループを行いたい場合には、条件式に boolean 型の true を記述
何らかの条件を満たしたときに break 文などを使って繰り返し処理を抜ける必要があ
ります
int num = 1;

while (true){
  System.out.println("num = " + num);
  num *= 2;

  if (num > 10){
    break;
  }
}
 */
