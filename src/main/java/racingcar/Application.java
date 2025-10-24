package racingcar;

import racingcar.controller.RacingGameController;

public class Application {

    public static void main(String[] args) {
        RacingGameController controller = new RacingGameController();

        try {
            controller.run();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}