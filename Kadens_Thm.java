public class Kadens_Thm {
    public static void Kadens(int[] numbers) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int neg_count = 0;
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                neg_count++;
            }
        }
        if (neg_count == numbers.length ) {
            for (int j = 0; j < numbers.length; j++) {
                if (Largest < numbers[j]) {
                    Largest = numbers[j];
                }
            }
            System.out.println("maximum Sum is: " + Largest);
        }
        else{
        for (int i = 0; i < numbers.length; i++) {

        cs += numbers[i];
        if(cs<0){
        cs = 0;
        }
        ms = Math.max(ms, cs);
        }
        System.out.println("maximum Sum is: " + ms);
    }
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadens(numbers);
    }
}
