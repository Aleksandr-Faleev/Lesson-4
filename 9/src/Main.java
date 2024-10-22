import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(2017);
        int year = scanner.nextInt();
        if((year % 4==0 && year % 100 !=0) ||(year%400==0) ){
            System.out.print(year+"год високосный");
        }else {
            System.out.print(year+"год не високосный");
        }

    }
}