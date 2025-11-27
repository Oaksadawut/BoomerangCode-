import java.util.Scanner;

public class Sumnumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            num = i * i;
            sum = sum + num;

        }System.out.println(sum);
    }
}
