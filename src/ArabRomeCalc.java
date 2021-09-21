import java.util.Scanner;

public class ArabRomeCalc {


    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Calk3 z = new Calk3();
        z.logic(x.next(), x.next().charAt(0), x.next());
    }
}