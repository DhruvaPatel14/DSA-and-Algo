public class MinimumNum {

    public static void main(String[] arg){
        int[] arr = {9, 9, 9, 44, 200, 59, 75, 102, 64};
        System.out.println(minNum(arr));
    }

    // assume arr is not empty
    public static int minNum(int[] arr){
        int num = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < num){
                num = arr[i];
            }
        }
        return num;
    }
}
