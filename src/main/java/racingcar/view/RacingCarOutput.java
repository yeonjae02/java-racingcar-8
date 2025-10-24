package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

public class RacingCarOutput {
    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            printPosition(car.getPosition());
        }
    }

    private static void printPosition(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
