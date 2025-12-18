import java.util.Arrays;

public class DoubleArray {
    public int [] copyArray(int [] arr){
        int [] newArr = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
    static void main(String[] args) {
        DoubleArray newArray = new DoubleArray();
        int[] arr1 = {1,2,4};
        int[] arr2 = {2,7};
        int[] arr3 = {3,4,5,6,7};
        int[] arrsum = newArray.copyArray(arr1);
        int[] arrsum2 = newArray.copyArray(arr2);
        int[] arrsum3 = newArray.copyArray(arr3);
        System.out.println(Arrays.toString(arrsum));
        System.out.println(Arrays.toString(arrsum2));
        System.out.println(Arrays.toString(arrsum3));
    }
}
