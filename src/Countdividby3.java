import java.util.Scanner;

public class Countdividby3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i%3==0){
                System.out.println(i);
                sum = sum + 1;
            }
        }System.out.println(sum);
    }
}
