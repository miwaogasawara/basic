package order;

import java.time.LocalDateTime;
import java.util.Random;

//分岐命令 if その１
public class If1 {
    public static void main(String[] args) {
        //①奇遇判定
        Random random = new Random(LocalDateTime.now().getSecond());
        int num = random.nextInt(100);
        if (num % 2 == 0) {
            //偶数
            System.out.println(num + "は偶数です");
        } else {
            //奇数
            System.out.println(num + "は奇数です");
        }

        //②Randomクラスを使ってじゃんけんプログラムを作成
        String[] hands = {"グー", "チョキ", "パー"};
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            String hand = hands[r.nextInt(3)];
            System.out.println(hand);
        }
    }
}

/*
①結果：62は偶数です（乱数なので実施のたびに結果は変わります）
②結果:　グー
        チョキ
        グー
        パー
        グー（5回分の結果を表示；0～4）



例1：0以上、100未満の乱数を得ます
Random random = new Random();
int randomValue = random.nextInt(100);


 */


