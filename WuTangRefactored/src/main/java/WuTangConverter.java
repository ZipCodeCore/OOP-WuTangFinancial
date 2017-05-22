class WuTangConverter{

    Double usDollar = 1.00;
    double euro = 0.94;
    double britishPound	= 0.82;
    double indianRupee = 68.32;
    double australianDollar = 1.35;
    double canadianDollar =	1.32;
    double singaporeDollar	= 1.43;
    double swissFranc = 1.01;
    double malaysianRinggit =	4.47;
    double japaneseYen	= 115.84;
    double chineseYuanRenminbi =	6.92;

    public double converter(String from, String to, double howMuch){

        double to1 = 0;
        double from1 = 0;


        switch(to) {
            case "Us Dollar" :
                to1 = this.usDollar;
                break;
            case "Euro" :
                to1 = this.euro;
                break;
            case "British Pound" :
                to1 = this.britishPound;
                break;
            case "Indian Rupee" :
                to1 = this.indianRupee;
                break;
            case "Australian Dollar" :
                to1 = this.australianDollar;
                break;
            case "Canadian Dollar" :
                to1 = this.canadianDollar;
                break;
            case "Singapore Dollar" :
                to1 = this.singaporeDollar;
                break;
            case "Swiss Franc" :
                to1 = this.swissFranc;
                break;
            case "Malaysian Ringgit" :
                to1 = this.malaysianRinggit;
                break;
            case "Japanese Yen" :
                to1 = this.japaneseYen;
                break;
            case "Chinese Yuan Renminbi" :
                to1 = this.chineseYuanRenminbi;
                break;
        }

        switch(from) {

            case "Us Dollar" :
                from1 = this.usDollar;
                break;
            case "Euro" :
                from1 = this.euro;
                break;
            case "British Pound" :
                from1 = this.britishPound;
                break;
            case "Indian Rupee" :
                from1 = this.indianRupee;
                break;
            case "Australian Dollar" :
                from1 = this.australianDollar;
                break;
            case "Canadian Dollar" :
                from1 = this.canadianDollar;
                break;
            case "Singapore Dollar" :
                from1 = this.singaporeDollar;
                break;
            case "Swiss Franc" :
                from1 = this.swissFranc;
                break;
            case "Malaysian Ringgit" :
                from1 = this.malaysianRinggit;
                break;
            case "Japanese Yen" :
                from1 = this.japaneseYen;
                break;
            case "Chinese Yuan Renminbi" :
                from1 = this.chineseYuanRenminbi;
                break;
        }
        double converted = ((to1/1.00) / (from1/1.00)) * howMuch;


        return converted;
    }
}