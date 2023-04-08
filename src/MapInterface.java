
import java.util.*;

class MortgageRate{
    Integer maturityPeriod;
    double interestRate;
    Date lastUpdate;

    public MortgageRate(int i, double v, Date date) {
    }

}
public class MapInterface {
    public static void main(String[] args) {
         Map<Integer, MortgageRate> mortgageRateList=new HashMap<>();

            mortgageRateList.put(60,new MortgageRate(60,3.21, new Date()));
            mortgageRateList.put(120,new MortgageRate(120,3.21,new Date()));
            mortgageRateList.put(180,new MortgageRate(180,3.21,new Date()));
            mortgageRateList.put(360,new MortgageRate(360,3.21,new Date()));
       MortgageRate getC1 = (MortgageRate) mortgageRateList.get(60);
        MortgageRate getC2 = (MortgageRate) mortgageRateList.get(120);
        System.out.println(getC1.toString());
        }
    }

