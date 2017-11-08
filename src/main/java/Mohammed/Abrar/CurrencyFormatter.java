package Mohammed.Abrar;

public class CurrencyFormatter {
        InputConsole inputConsole = new InputConsole();
        OutputConsole outputConsole = new OutputConsole();

        private  String currencySymbol;

        public CurrencyFormatter() {

        }

        public String getCurrencySymbol() {
            return currencySymbol;
        }

        public String printFormatedCurrencyType(int inputCurrencyTypeIndex) {

          // int inputCurrencyTypeIndex =outputConsole.getInputCurrencyType();


            switch (inputCurrencyTypeIndex) {
                case (1):
                    return "$";
                case (2):
                    return "€";
                case (3):
                    return "GBP";
                case (4):
                    return "INR";
                case (5):
                    return "AUD";
                case (6):
                    return "CAD";
                case (7):
                    return "S$";
                case (8):
                    return "CHF";
                case (9):
                    return " RM";
                case (10):
                    return"¥";
                case (11):
                    return "RMB,";

                default:

                    return " select currency type ";


            }





        }
    }




