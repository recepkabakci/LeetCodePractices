public class UnpairedElement {
    public int solution(int[] A) {
        int unpairedNUmber=0;
        for(int i=0;i<A.length;i++){
            int count=0;
            int num=A[i];
            for(int j=0;j<A.length;j++){
                if(num==A[j]){
                    count++;
                }
            }
            if(count<2){
                unpairedNUmber=num;
            }
        }
        return unpairedNUmber;
    }

}
