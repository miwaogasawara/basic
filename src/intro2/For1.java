package intro2;

public class For1 {
    public static void main(String[] args) {
//      for命令のサンプル　1
       int sum = 0;
       for (int i =1; i <= 100; i++) {
           sum += i;
           System.out.println(i + "回目:" + sum);
       }
    }
}
