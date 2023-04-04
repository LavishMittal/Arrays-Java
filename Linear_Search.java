import java.util.*;

public class Linear_Search{
    public static int linearsearch(int numbers[], int key){
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2, 3, 5, 8, 11, 14, 16, 10, 40};
        int key = 140;

        int index = linearsearch(numbers, key);
      
            if (index == -1){
                System.out.println("Not Found");
            }else{
                System.out.println("Key is at index: " + index);
            }

    }
}