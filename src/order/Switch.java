package order;
//switch命令 その１
public class Switch {
    public static void main(String[] args) {
        char ch = 'A';

        switch (ch) {
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            case 'C':
                System.out.println('C');
                break;
            default:
                System.out.println("Other");
                break;
        }
    }
}
