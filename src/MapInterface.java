
import org.w3c.dom.ls.LSOutput;

import java.util.*;

class MortgageRate{
    Integer maturityPeriod;
    double interestRate;
    Date lastUpdate;

    public MortgageRate(int i, double rate, Date date) {
        this.maturityPeriod=i;
        this.interestRate=rate;
        this.lastUpdate=date;
    }

}
public class MapInterface {
    public static void main(String[] args) {

        Map<Integer, MortgageRate> mortgageRateList = new HashMap<>();
        mortgageRateList.put(60, new MortgageRate(60, 3.01, new Date()));
        mortgageRateList.put(120, new MortgageRate(120, 3.41, new Date()));
        mortgageRateList.put(180, new MortgageRate(180, 4.21, new Date()));
        mortgageRateList.put(360, new MortgageRate(360, 4.51, new Date()));

        for (Map.Entry<Integer, MortgageRate> entry : mortgageRateList.entrySet()) {
            Integer months = entry.getKey();
            MortgageRate rate = entry.getValue();
            Double interestRate = rate.interestRate;
            Date date = rate.lastUpdate;
            System.out.println("Months: " + months + ", Rate: " + interestRate + ", Date: " + date);
        }

    }

}
