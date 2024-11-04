public class SearchChar {

    public static void main(String[] args) {
        String s = "Hello";
        char target = 'H';
        System.out.println(searchChar(s, target));
    }

    //search in the array : return the index if item found
    //or return -1 if item not found
    static int searchChar(String s, char target){
        char[] arr = s.toCharArray();
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
