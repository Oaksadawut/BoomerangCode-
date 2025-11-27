import java.util.Scanner;

public class Powercomputer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int five =1;
        int three =1;
        for(int i = 1; i <= a; i++){
            five = five * 5;
       }
        for(int j = 1; j <= b; j++){
            three = three * 3;
        }
        System.out.println(five+three);
    }
}
