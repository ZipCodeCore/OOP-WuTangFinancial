import java.util.HashMap;
import java.util.Map;

/**
 * Created by stephenpegram on 5/22/17.
 */
public class Converter {

    private static final Map<String, Money<Integer>> chart;

    static {
        chart = new HashMap<>();
        chart.put("US Dollar", new Money<>(1, 0));
        chart.put("Euro", new Money<>(0, 94));
        chart.put("British Pound", new Money<>(0, 82));
        chart.put("Indian Rupee", new Money<>(68, 32));
        chart.put("Australian Dollar", new Money<>(1, 35));
        chart.put("Canadian Dollar", new Money<>(1, 32));
        chart.put("Singapore Dollar", new Money<>(1, 43));
        chart.put("Swiss Franc", new Money<>(1, 01));
        chart.put("Malaysian Ringgit", new Money<>(4, 47));
        chart.put("Japanese Yen", new Money<>(115, 84));
        chart.put("Chinese Yuan Renminbi", new Money<>(6, 92));
    }

    //Step 1 validates given amount of money to be converted (not needed since there is no user input)
    public <T> int checkNumber (T amount){
        String sAmount = amount.toString();
        try {
            double num = Double.parseDouble(sAmount);
            int expandedNum = checkDecimal(num);
            return expandedNum;
        }catch(NumberFormatException e){
            System.out.println("That number is no good. Try a different one");
            return 0;
        }
    }

    //Step 1 helper, validates that only 2 decimal place can be entered for given amount.
    public int checkDecimal(double number){
        number *= 100;
        if (number%1 == 0 && number > 0){return (int) number;}
        else {throw new NumberFormatException();}
    }

    //Step 2, takes cents expanded int from checkNum and returns a US cents rated int, to give to 'toDesiredRate()'
    public Money<Integer> toUsRate(String initialCurrency, int centsAmountFromCheckNum){
        int divisor = toCents(initialCurrency);
        return toUsDollar(centsAmountFromCheckNum, divisor);
    }

    //Helper to Step 2, returns a $Dollar.Cents amount
    public Money<Integer> toUsDollar(int centsAmountFromCheckNum, int divisor){
        return new Money<>(centsAmountFromCheckNum / divisor,calculateChange(centsAmountFromCheckNum, divisor));
    }

    //Helper to helper of Step 2, finds proper left over change of a given amount
    public int calculateChange(int centsAmountFromCheckNum, int divisor){
        int leftOver = centsAmountFromCheckNum % divisor;
        double change = (double) leftOver/divisor;
        if(change > 1){change -= 1;}
        return (int) (change * 100);
    }


    //Step 3, takes desired currency and $Dollar.Cents amount and calls method to convert amount to reflect the desired rate
    public Money<Integer> toDesiredRate(String desiredCurrency, Money<Integer> UsBaseAmount){
        return toDesiredDollars(desiredCurrency, UsBaseAmount);
    }

    //Helper to Step 3, does that actual converting
    public Money<Integer> toDesiredDollars(String desiredCurrency, Money<Integer> amount){
        int UsCents = amount.getDollars()*100 + amount.getCents();
        int totalCents = UsCents * (toCents(desiredCurrency));
        return new Money<>(totalCents / 10000, roundCentsInteger(totalCents % 10000));
    }

    //Converts some $Dollar.Cents amount to cents
    public int toCents(String currency){
        return chart.get(currency).getDollars()*100 + chart.get(currency).getCents();
    }

    //All-encompassing call
    public <T> Money<Integer> convert(String initialCurrency, String resultingCurrency, T amount) {
        Money<Integer> cash = toUsRate(initialCurrency, checkNumber(amount));
        cash = toDesiredRate(resultingCurrency, cash);
        return cash;
    }

    //returns the cents to two places. used in the last line of the last method of 'convert()'
    public int roundCentsInteger(int number) {
        int result = 0;
        if (number > 0) {
            if (findRoundingThreshholdNum(number, lengthOfInt(number)) < 5) {
                result = chopToDesiredDigits(number, lengthOfInt(number), 2);
            } else {
                number = chopToDesiredDigits((number), lengthOfInt(number), 3) + 10;
                 result = chopToDesiredDigits(number, lengthOfInt(number), 2);
            }
        }
        return result;
    }

    //returns the length of an integer. used in 'roundCentsInteger()'
    public int lengthOfInt (int number){
        return String.valueOf(number).length();
    }

    //returns the thousandths place of a number. used in 'roundCentsInteger()'
    public int findRoundingThreshholdNum (int number, int length){
        return (chopToDesiredDigits(number, length, 3)) % 10;
    }

    //returns an integer reduced to the desired number of spaces. used in 'roundCentsInteger()'
    public int chopToDesiredDigits(int number,int numberLength, int desiredNumOfDigits){
        int chopper = (int) Math.pow(10, numberLength - desiredNumOfDigits);
        return (number / chopper);
    }
}
