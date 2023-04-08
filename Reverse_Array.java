public class Reverse_Array {

    public static void ReverseArray(int numbers[]) {
        int start = 0 , end = numbers.length-1;

        while(start < end){
            int temp = numbers[end];
            numbers[end]= numbers[start]; 
            numbers[start] = temp;
            
            start++; 
            end--;
        }
    }
    
    public static void main(String args[]) {
        int numbers[] = {2, 3, 5, 8, 11, 14, 16, 10, 40};

        ReverseArray(numbers);

        for( int i = 0; i< numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
}
