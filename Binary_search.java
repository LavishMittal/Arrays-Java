public class Binary_search {

    public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 3, 5, 8, 10, 11, 14, 16, 40};
        int key = 14;

        System.out.println("The Index of the Key is: " +BinarySearch(numbers, key));
    }
}
