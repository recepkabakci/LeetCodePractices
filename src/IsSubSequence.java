import java.lang.Math;
public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        char S[]=s.toCharArray();
        char T[]=t.toCharArray();

        if(s.length()<1)
            return true;

        while(i<t.length()){
            if(T[i]==S[j]){
                j++;
            }
            i++;

            if(j==s.length())
                return true;
        }

        return false;
    }
}