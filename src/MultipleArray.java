import java.util.Arrays;

public class MultipleArray {
    public int[] mul(int[] arr, int n) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i]*n;
        }
        return res;
    }
    static void main(String[] args) {
        MultipleArray aM = new MultipleArray();
        int[] arr = {1,1,1};
        int n = arr.length;
        int[] sunRes = aM.mul(arr, n);
        System.out.println(Arrays.toString(sunRes));
    }
}
