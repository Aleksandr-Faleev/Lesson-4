import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int e=5;
     int[][]aryay=new int[e][e];
     for(int i=0;i<e;i++) {
         aryay[i][i] = 1;
         aryay[i][e - i - 1] = 1;
     }
     for (int i=0;i<e;i++){
         System.out.println(Arrays.toString(aryay[i]));
        }
    }
}