package racingcar.model.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void carPrintTest() {
        //given name, count

        //when car move

        Car car = Car.createCar("오주연");

        car.carMove();

        Assertions.assertThat(car.toString()).contains("오주연 : ");

        //then 자동차를 출력했을 때 이름과 횟수가 나와야 한다.
    }
}
