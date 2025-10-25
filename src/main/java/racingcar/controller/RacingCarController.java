package racingcar.controller;

import racingcar.model.domain.InputParser;
import racingcar.view.InputView;

public class RacingCarController {

    //전체적인 흐름 제어. 메인에 프로그램 노출

    public void RacingCar() {

        InputView inputView = new InputView();

        String input = inputView.getCarName();

        InputParser carNames = InputParser.getParsedInput(input);

        boolean namesFormatRightOrNot = carNames.nameCheck();


        if(!namesFormatRightOrNot) {
            throw  new IllegalArgumentException("이름 입력이 잘못됐습니다.");
        }

        int racingCount = inputView.getRacingCount();

    }






}
