//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int[] array ={1,1,0,0,1,0,1,0,1,0};
        for (int r =0;r< array.length;r++) {
            if (array[r] == 1) array[r] = 0;
         else array[r]=1;
            System.out.println(array[r]);
            }
        }
        }