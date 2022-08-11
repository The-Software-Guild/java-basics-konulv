public class SummativeSums{
    public static void main(String[] args){
        int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arr2 = { 999, -60, -77, 14, 160, 301 };
        int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
            140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.println("#1 array sum: " + sumArr(arr1));
        System.out.println("#2 array sum: " + sumArr(arr2));
        System.out.println("#3 array sum: " + sumArr(arr3));
    }

    public static int sumArr(int[] arr){
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}