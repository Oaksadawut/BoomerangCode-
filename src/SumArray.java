public class SumArray {
    public int sumTow(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==5){
                sum+=arr[i];
            }
        }
        return sum;
    }
     void main(String[] args) {
        SumArray sA = new SumArray();
        int[] arr1 = {1,5,5,3};
        int sum1 = sA.sumTow(arr1);
        System.out.println(sum1);
    }
}
