//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arry= new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i =0;i<arry.length;i++){
            if (arry[i]<6){
                arry[i]*=2;
            }
            System.out.print(arry[i]+" ");
        }
    }
}