package fountain.donald.WuTanFinancial;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

   static NumberFormat unitedStates = NumberFormat.getCurrencyInstance(Locale.US);
   static NumberFormat european = NumberFormat.getCurrencyInstance(new Locale("en", "MT"));
   static NumberFormat australian = NumberFormat.getCurrencyInstance(new Locale("en", "AU"));
   static NumberFormat british = NumberFormat.getCurrencyInstance(new Locale("en", "GB"));
   static NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
   static NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINESE);
   static NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
   static NumberFormat candaian = NumberFormat.getCurrencyInstance(Locale.CANADA);
   static NumberFormat singapore = NumberFormat.getCurrencyInstance(new Locale("en", "SG"));
   static NumberFormat malaysian = NumberFormat.getCurrencyInstance(new Locale("ms", "MY"));
   static NumberFormat japanese = NumberFormat.getCurrencyInstance(Locale.JAPANESE);

   static public String formatCurrency(double money, int num){
       switch (num) {
           case 1:
               return unitedStates.format(money);
           case 2:
               return european.format(money);
           case 3:
               return british.format(money);
           case 4:
               return india.format(money);
           case 5:
               return australian.format(money);
           case 6:
               return candaian.format(money);
           case 7:
               return singapore.format(money);
           case 8:
               return france.format(money);
           case 9:
               return malaysian.format(money);
           case 10:
               return japanese.format(money);
           case 11:
               return china.format(money);
       }
        return null;
   }
}
