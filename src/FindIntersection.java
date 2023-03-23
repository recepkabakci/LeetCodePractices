import java.util.ArrayList;

public class FindIntersection {
    public static String FindIntersection(String[] strArr) {
        String [] strArr1=strArr[0].split(", ");
        String [] strArr2=strArr[1].split(", ");
        String s="";
        for(int i=0;i<strArr1.length;i++) {
            for (int j = 0; j < strArr2.length; j++) {
                if (strArr1[i].equals(strArr2[j])) {
                    s = s + strArr1[i] + ",";
                }
            }
        }
        if(s.length()>1)
            return s.substring(0, s.length()-1);
        else
            return"false";
    }
}
