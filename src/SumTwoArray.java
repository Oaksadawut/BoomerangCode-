import java.util.Arrays;

public class SumTwoArray {
    public int equalCount(int arr1[], int arr2[]) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        return count;
    }
    static void main(String[] args) {
        SumTwoArray sum = new SumTwoArray();
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 2, 1, 1};
        int arr11[] = {1,1,1,1};
        int arr22[] ={0,0,0,0};
        int result1 = sum.equalCount(arr1,arr2);
        int result2 = sum.equalCount(arr11,arr22);
        System.out.println(result1);
        System.out.println(result2);
    }
}