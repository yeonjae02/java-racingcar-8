package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class RacingCarGame {
    private List<Car> cars;

    public RacingCarGame(List<Car> cars) {
        this.cars = cars;
    }

    public void playRound() {
        for (Car car : cars) {
            move(car);
        }
    }

    private int pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    private void move(Car car) {
        int number = pickNumber();
        car.move(number);
    }

    public List<Car> getCars() {
        return cars;
    }
}
