public class RotateArray {
    public int[] solution(int[] A, int K) {
        int j, last;
        for(int i = 0; i < K; i++) {
            last = A[A.length - 1];
            for(j = A.length-1; j > 0; j--){
                A[j] = A[j-1];
            }
            A[0] = last;
        }
        return A;
    }
}
