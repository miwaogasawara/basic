package intro2;
//条件演算子（三項演算子）
public class ConditionalOperator {
    public static void main(String[] args) {
        int num = 1;
        String gender = num==1 ? "男":"女";//if命令と代入
        System.out.println(gender);//男
    }
}
/*
解説
String gender = num==1 ? "男":"女";
　num　が1であれば男、そうでなければ女をgenderに返す

 */
