import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        prime Obj = new prime();
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter any Number: ");
        n = input.nextInt();
        Obj.CheckPrime(n);
    }
}