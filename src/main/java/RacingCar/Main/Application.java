package RacingCar.Main;

import RacingCar.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] names = scanner.next().split(",");
        ResultView resultView = new ResultView(names);
        Cars cars = new Cars(makeCar(names));
        System.out.println("시도할 회수는 몇회인가요?");
        int gameNumber = scanner.nextInt();

        System.out.println("\n실행결과");
        for (int i=0; i<gameNumber; i++) {
            List<Position> positions = cars.move(makeRandomNumbers(cars.size()));
            resultView.showDistance(positions);
        }
        List<Car> Winners = cars.findWinners();
        resultView.showWinners(Winners);


    }

    private static List<Integer> makeRandomNumbers(int size) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i=0; i<size; i++) {
            randomNumbers.add(1+(int)(Math.random()*9));
        }
        return randomNumbers;
    }

    private static List<Car> makeCar(String[] names) {
        List<Car> cars = new ArrayList<>();
        for (String name: names) {
            cars.add(new Car(name));
        }
        return cars;
    }

}
