import java.util.Arrays;

public class GenereateArray {
    public int[] gen(int n ,int i){
        int [] arr = new int [n];
        for(int j = 0; j < n;j++){
            arr[j] = i;
        }
        return arr;
    }

     static void main(String[] args) {
        GenereateArray gen1 = new GenereateArray();
        int[] arr = gen1.gen(3,5);
        System.out.println(Arrays.toString(arr));
    }
}
