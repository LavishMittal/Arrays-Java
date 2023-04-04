public class Largest_of_numbers {
    public static int LargestNum(int marks[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if(Largest < marks[i]){
                Largest = marks[i];
            }
            if(Smallest > marks[i]){
                Smallest = marks[i];
            }
        }
        System.out.println("The Smallest Number is: " + Smallest);
        return Largest;
    }
    public static void main(String args[]){
        int marks[] = {2, 4 , 67, 89, 100, 877, 53};
        System.out.println("The Largest Number is: " + LargestNum(marks));
    }
}
