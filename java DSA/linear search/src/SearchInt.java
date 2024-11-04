public class SearchInt {
    public static void main(String[] args) {
        int[] num = {23, 42, 15, -1, -3, 99};
        int target = -3;
        System.out.println(linearSearch(num, target));
    }

    //search in the array : return the index if item found
    //or return -1 if item not found
    static int linearSearch(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }
            // check each element using for loop
            for (int i = 0; i < arr.length; i++){
                int element = arr[i];
                if (element == target){
                    return i;
                }
            }

        // if element not found in array then return -1
        return -1;
    }
}