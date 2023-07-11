import java.util.*;
public class Main10 {
    public static int func(int a, int b){
        if (b == 0)
            return a;
        else
            return func (b, a % b);
    }
    public static int kratn(int a, int b) {
        return (a * b) / func (a, b) ;
    }
    public static void main(String[] args) {
        int a,b,rezult;
        Scanner in = new Scanner(System.in);
        System.out.println("32");
        while (!in.hasNextInt()) {
            System.out.println("Введите данные используя целые числа. Повторите ввод!");
            in.next();}
        a = in.nextInt();
        System.out.println("48");
        while (!in.hasNextInt()) {
            System.out.println("Введите данные используя целые числа. Повторите ввод!");
            in.next();
        }
        b = in.nextInt();
        rezult=kratn(a,b);
        System.out.print("Наименьший общий делитель: " + rezult);
    }
}
