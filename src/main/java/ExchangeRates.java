public enum ExchangeRates {

        USD("USD", 1.00),
        EURO("EURO", 0.94),
        POUND("British Pound", 0.83),
        RUPEE("Indian Rupee", 68.32),
        AUSTRALIANDOLLAR("Australian Dollar", 1.35),
        CANADIANDOLLAR("Canadian Dollar", 1.32),
        SINGAPOREDOLLAR("Singapore Dollar", 1.43),
        FRANC("Swiss Franc", 1.01),
        RINGGIT("Ringgit", 4.47),
        YEN("Japanese Yen", 115.84),
        YUANREMINBI("Yuan Reminbi", 6.92);

        private double rate;
        private String name;

        private ExchangeRates (String name, double rate) {
            this.name = name;
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }
}