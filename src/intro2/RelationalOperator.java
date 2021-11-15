package intro2;
//関係演算子
public class RelationalOperator {
    public static void main(String[] args) {
        int x = 10,y = 10,z = 20;

        System.out.println(x + " == " + y + ":" + (x == y));//10 == 10:true
        System.out.println(x + " == " + z + ":" + (x == z));//10 == 20:false
        System.out.println(x + " != " + y + ":" + (x != y));//10 != 10:false
        System.out.println(x + " != " + z + ":" + (x != z));//10 != 20:true
        System.out.println(x + " >= " + y + ":" + (x >= y));//10 >= 10:true
        System.out.println(x + " >= " + z + ":" + (x >= z));//10 >= 20:false
        System.out.println(x + " <= " + y + ":" + (x <= y));//10 <= 10:true
        System.out.println(x + " <= " + z + ":" + (x <= z));//10 <= 20:true
        System.out.println(x + " > " + y + ":" + (x > y));//10 > 10:false
        System.out.println(x + " > " + z + ":" + (x > z));//10 > 20:false
        System.out.println(x + " < " + y + ":" + (x < y));//10 < 10:false
        System.out.println(x + " < " + z + ":" + (x < z));//10 < 20:true
        System.out.println("A < a :" + ('A' < 'a'));//A < a :true
    }
}
