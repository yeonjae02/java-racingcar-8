package racingcar.domain;

public class Car {
    private String name;

    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(int randomValue) {
        if (isRandomValueMoreThan4(randomValue))
            position++;

    }

    private boolean isRandomValueMoreThan4(int randomValue ) {
        return randomValue >= 4;
    }
}
