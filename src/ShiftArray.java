import java.util.Arrays;

public class ShiftArray {
    public int[] shiftRight(int[] arr) {
        int newarr[] = new int [arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i+1] = arr[i];
        }
        return newarr;
    }
     void main(String[] args) {
        ShiftArray shiftArray = new ShiftArray();
        int[] arr1 = {1,2,3,4,5,6};
        int[] arrsum1 = shiftArray.shiftRight(arr1);
        System.out.println(Arrays.toString(arrsum1));
    }
}