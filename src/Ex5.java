import  java.util.Scanner;
public class Ex5 {

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        annualsaving();

    }
    public static void annualsaving() {
        System.out.print("Enter a monthly saving amount:");
        double saving = input.nextDouble();
        double a = 0;

        for(int i = 1; i < 13; i++){
            a = (saving + a) * (1 + 0.00417);
            System.out.printf("After" + i + "month, the saving balance is: %.3f\n", a);
        }
    }
}
