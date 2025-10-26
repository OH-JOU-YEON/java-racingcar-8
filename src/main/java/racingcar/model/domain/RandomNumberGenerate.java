package racingcar.model.domain;

import java.security.SecureRandom;

public class RandomNumberGenerate {
    public static int generateRandomNumZeroToTen() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(11);
    }
}
