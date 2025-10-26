package racingcar.model.domain;

import camp.nextstep.edu.missionutils.Randoms;



public class RandomNumberGenerate {
    public static int generateRandomNumZeroToTen() {
       return Randoms.pickNumberInRange(0, 9);

    }
}
