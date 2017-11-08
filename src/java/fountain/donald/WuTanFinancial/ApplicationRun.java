package fountain.donald.WuTanFinancial;

public class ApplicationRun {

    public void runApplication() {
        System.out.println("Hello welcome to the currency converter.");

        double amountToConvert = Console.getUserInputDouble("How much money would you like to convert?");

        System.out.println("\n\nYou have many different options for conversions.\n" +
                "Listed below are your options of Countries in which we support.\n" +
                "=============================\n" +
                "       1) US Dollar\n" +
                "=============================\n" +
                "         2) Euro\n" +
                "=============================\n" +
                "    3) British Pound\n" +
                "=============================\n" +
                "     4) Indian Rupee\n" +
                "=============================\n" +
                "   5) Australian Dollar\n" +
                "=============================\n" +
                "    6) Canadian Dollar\n" +
                "=============================\n" +
                "   7) Singapore Dollar\n" +
                "=============================\n" +
                "      8) Swiss Franc\n" +
                "=============================\n" +
                "   9) Malaysian Ringgit\n" +
                "=============================\n" +
                "     10) Japanese Yen\n" +
                "=============================\n" +
                "  11) Chinese Yuan Renminbi\n" +
                "=============================\n");

        int convertFrom;
        double currencyRateFrom;

        do {

            try {
                convertFrom = Console.getUserInputInteger("Please choose a currency type from above to CONVERT FROM.\n" +
                        "Please enter the corresponding number to your choice.");
                currencyRateFrom = CurrencyConverter.getCurrencyRates(convertFrom);
                break;

            } catch(NullPointerException npe) {
                continue;
            }

        } while(true);


            int convertTo;
            double currencyRateTo;

        do {

            try {
                convertTo = Console.getUserInputInteger("\n\nPlease choose a currency type from above to CONVERT INTO.\n" +
                        "Please enter the corresponding number to your choice.");
                currencyRateTo = CurrencyConverter.getCurrencyRates(convertTo);
                break;

            } catch(NullPointerException npe) {
                continue;
            }

        } while(true);

            double convertedAmount = CurrencyConverter.convertMoney(currencyRateFrom, currencyRateTo, amountToConvert);

            System.out.println("\n\n\nYou converted " + CurrencyFormatter.formatCurrency(amountToConvert, convertFrom) + " from "
                    + CurrencyConverter.getCurrencyRatesName(convertFrom) + " at a currency rate of " +
                    CurrencyConverter.getCurrencyRates(convertFrom) + " to " +
                    CurrencyConverter.getCurrencyRatesName(convertTo) +
                    " at a currency rate of " + CurrencyConverter.getCurrencyRates(convertTo) + ".");

            System.out.println("Your new amount is: " + CurrencyFormatter.formatCurrency(convertedAmount, convertTo) +
            "\n----------------------------------------------------------------------------------------------" +
                    "\n\n\n\n\n\n\n");
        }
    }

