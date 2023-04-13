
public class CoderByte {
    public static void FirstFactorial(int num) {
        int sum = 1;
        for (int i = num; i > 0; i--) {
            sum = sum * i;
        }
    }

    public static void main(String[] args) {
        FirstFactorial(5);
    }
}

