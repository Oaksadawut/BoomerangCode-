import java.util.Arrays;

public class GenerateMathArray {
    public double[] gen(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }

    static void main(String[] args) {
        GenerateMathArray genMath = new GenerateMathArray();
        double[] arr = genMath.gen(4);
        System.out.println(Arrays.toString(arr));
    }
}
