public class Repeated_number_array {
    
    public static boolean repeat_num(int num[]) {
    
        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    

    public static void main(String args[]) {
        int num[] = {1, 3, 4, 5, 6, 1};
        System.out.println(repeat_num(num));
    }
    
}
