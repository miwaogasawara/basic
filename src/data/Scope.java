package data;

public class Scope {
    public static void main(String[] args) {
        int x = 10;
        {
            int y = 100;
            {
                int z = 1000;
                System.out.println(x);//10
                System.out.println(y);//100
                System.out.println(z);//1000
            }
            System.out.println(x);//10
            System.out.println(y);//100
            //System.out.println(z);//コンパイルエラー
        }
        System.out.println(x);//10
       // System.out.println(y);//コンパイルエラー
        //System.out.println(z);//コンパイルエラー
    }
}
