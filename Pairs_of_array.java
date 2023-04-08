public class Pairs_of_array {

    public static void Pairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
    int numbers[] = {2, 3, 5, 8, 11, 14, 16, 10, 40};

    Pairs(numbers);
    }
}
