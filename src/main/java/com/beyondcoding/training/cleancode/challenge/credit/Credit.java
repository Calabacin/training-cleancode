package com.beyondcoding.training.cleancode.challenge.credit;

public class Credit {

    private ChecksumCalculator checksum = new ChecksumCalculator();

    private CreditCardDeterminer determiner = new CreditCardDeterminer();

    public CreditCardType check(String creditCardNumber) {
        int checksum = calculateChecksum(creditCardNumber);
        if (isInvalid(checksum)) {
            return CreditCardType.INVALID;
        }
        return determineCreditCardType(creditCardNumber);
    }

    private int calculateChecksum(String creditCardNumber) {
        return checksum.calculate(creditCardNumber);
    }

    private boolean isInvalid(int checksum) {
        return checksum % 10 != 0;
    }

    private CreditCardType determineCreditCardType(String creditCardNumber) {
        return determiner.determine(creditCardNumber);
    }

}
