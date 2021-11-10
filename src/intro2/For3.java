package intro2;

public class For3 {
    public static void main(String[] args) {
        ext :
        for (int i = 1; i < 10; i++) {//最初のForが優先になります
            for (int j = 1; j < 10; j++) {
                if (i * j > 50) { break ext; }
                System.out.print((i * j) + "/");
            }
            System.out.println();
        }
    }
}
/*
    結果
1/2/3/4/5/6/7/8/9/...i=1 9で終了
2/4/6/8/10/12/14/16/18/...i=2 9で終了
3/6/9/12/15/18/21/24/27/...i=3,9で終了
4/8/12/16/20/24/28/32/36/...i=4,9で終了
5/10/15/20/25/30/35/40/45/...i=5,9で終了
6/12/18/24/30/36/42/48/...i=6,,8で終了

 */
