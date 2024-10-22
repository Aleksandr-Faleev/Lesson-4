//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        val(3, 5);
    }

    public static int[] val(int len, int initialValue) {
        int cat[] = new int[len];

        for (int i = 0; i < cat.length; i++) {
            cat[i] = initialValue;
        }
            return cat;

    }
}
