package ex;

import java.util.Scanner;

public class CalcBmi {


    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }

    public static void main(String[] args) {
//身長を定義
        double hight = inputDouble("身長を入力して下さい（単位　ｍ）");
//体重を定義
       double weight = inputDouble("体重を入力して下さい（単位　ｋｇ）");


//       BMIを定義、身長と体重から計算、MATH.ROUNDで四捨五入
       double bmi = weight / ( hight *hight);
        bmi = Math.round(bmi * 10.0) / 10.0;
//        標準体重を定義し計算、MATH.ROUNDで四捨五入、一度定義した物は、定義名のみでOK
       double kweight  = ( hight * hight)*22;
       kweight = Math.round(kweight * 10.0) / 10.0;


//結果出力　言語出力はダブルクォーテーションを忘れずに
       System.out.println("身長:" + hight + " m");
        System.out.println("体重:" + weight + " kg");
        System.out.println("BMI:" + bmi);
        System.out.println("適性体重:" + kweight + " kg");
//       肥満度判定
        if (bmi < 18.5){
            System.out.println("肥満度：低体重");}
            else  if (bmi < 25){
                System.out.println("肥満度：普通体重");}
            else  if (bmi < 30){
                System.out.println("肥満度：肥満度（１度）");}
            else  if (bmi < 35){
                System.out.println("肥満度：肥満度（2度）");}
            else  if (bmi < 40){
                System.out.println("肥満度：肥満度（3度）");}
            else if (bmi >= 40){
                System.out.println("肥満度：肥満度（4度）");}

            }
        }


//練習問題　1
//BMI ＝ 体重kg ÷ (身長m)２
//適正体重 ＝ (身長m)２ ×  ２２
/*
１．「ex」パッケージを作成して、その中に「CalcBmi」クラスを作成しなさい。
２．身長と体重を変数に設定しなさい。
３．表示する情報は「身長、体重、BMI、適性体重」とします。

※結果の表示桁が非常に多くなります。
 */
/*
練習問題　肥満度判定
前回の結果に加えてIf構文を用いて肥満度を判定する
１８.5未満・・・・・・・低体重
18.5以上２５未満・・　普通体重
２５以上３０未満・・・肥満（１度）
３０以上３５未満・・・肥満（２度）
３０以上４０未満・・・肥満（3度）
４０以上・・・・・・・肥満（４度）

キーボードから身長と体重が入力できるように修正
↓
結果
身長を入力して下さい（単位　ｍ）
1.55
体重を入力して下さい（単位　ｋｇ）
40
身長:1.55 m
体重:40.0 kg
BMI:16.6
適性体重:52.9 kg
肥満度：低体重
 */
