import java.util.Scanner;

public class ArrayCC {
    public static void updated_arr(int marks[],int nonchangeable){
        nonchangeable+=5;
        for(int i=0; i<=marks.length-1; i++){
            marks[i]+=1;
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        int marks[] = {12, 13, 14};
        int nonchangeable = 5;
        // Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<=marks.length-1; i++ ){
            System.out.println(marks[i]);
        }
        updated_arr(marks, nonchangeable);
        System.out.println(nonchangeable);
        
        // sc.close();
    }
}
