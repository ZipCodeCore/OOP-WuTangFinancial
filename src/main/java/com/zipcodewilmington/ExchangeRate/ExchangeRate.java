package com.zipcodewilmington.ExchangeRate;

public enum ExchangeRate {
        USD(1.00f),
        GBP(0.82f),
        EUR(0.94f),
        INR(68.32f),
        AUD(1.35f),
        CAD(1.32f),
        SGD(1.43f),
        CHF(1.01f),
        MYR(4.47f),
        JPY(115.84f),
        CNY(6.92f);

        public double rate;

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        ExchangeRate(double rate) {
            this.rate = rate;
        }

        public static double conversion(double beginningCurrencyAmount, ExchangeRate beginningCurrency, ExchangeRate endingCurrency) {
            double fromExchangeRate = beginningCurrency.getRate(); //USD
            double toExchangeRate = endingCurrency.getRate(); //Euro
            double conversionRate = toExchangeRate / fromExchangeRate; //Euro/USD
            double convertedCurrency = conversionRate * beginningCurrencyAmount;

            return convertedCurrency;

        }

        }
