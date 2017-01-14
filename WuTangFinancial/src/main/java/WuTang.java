/**
 * Created by eugenevendensky on 1/13/17.
 */
public class WuTang {

    public class CurrencyExchanger {
        private Double dollar;
        private Double euro;
        private Double britishPound;
        private Double indianRupee;
        private Double australianDollar;
        private Double canadianDollar;
        private Double singaporeDollar;
        private Double swissFranc;
        private Double malaysianRingit;
        private Double japaneseYen;
        private Double yuanRenminbi;


        public CurrencyExchanger(){
            this.dollar = 1.00;
            this.euro = .94;
            this.britishPound =.82;
            this.indianRupee = 68.32;
            this.australianDollar = 1.35;
            this.canadianDollar = 1.32;
            this.singaporeDollar = 1.43;
            this.swissFranc =  1.01;
            this.malaysianRingit = 4.47;
            this.japaneseYen = 115.84;
            this.yuanRenminbi = 6.92;
        }

        public Double euroToDollar(){
            return dollar/euro;
        }
        public Double euroToBritishPound(){
            return (dollar/euro) * britishPound;
        }

        public Double britishPoundToIndianRupee(){
            return (dollar/britishPound) * indianRupee;
        }
        public Double rupeeToCanadianDollar(){
            return (dollar/indianRupee) * indianRupee;
        }
        public Double canadianDollarToSingaporeDollar(){
            return (dollar/canadianDollar) * singaporeDollar;
        }
        public Double singaporeDollarToSwissFranc(){
            return (dollar/britishPound) * indianRupee;
        }
        public Double swissFrancToMalaysianRinggit(){
            return (dollar/swissFranc)* malaysianRingit;
        }
        public Double japaneseYenToChineseYuanRenminbi(){
            return (dollar/japaneseYen) * yuanRenminbi;
        }
        public Double malaysianRingitToJapaneseYen(){
            return (dollar/malaysianRingit) * japaneseYen;
        }
    }
}
