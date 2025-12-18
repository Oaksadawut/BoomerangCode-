import java.util.Arrays;
public class CheckArray {
    public boolean isEqual(int [] arr1, int [] arr2) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                sum += arr1[i];

            }if (arr2[i] > 0){
                sum2 += arr2[i];

            }if (sum == sum2) {
                return true;
            }
        }
        return false;
    }
    static void main(String[] args) {
        CheckArray checkArray = new CheckArray();
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,2,1};
        boolean Eq = checkArray.isEqual(arr1,arr2);
        System.out.println(Eq);
    }
}