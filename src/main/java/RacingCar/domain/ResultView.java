package RacingCar.domain;

import java.util.ArrayList;
import java.util.List;

public class ResultView {

    private String[] names;
    public ResultView(String[] names) {
        this.names = names;
    }
    public void showDistance(List<Position> positions) {
        for (int i=0;i<positions.size();i++) {
            int position = positions.get(i).getPosition();
            System.out.print(names[i] + " : ");
            writeDistance(position);
            System.out.println();
        }
        System.out.println();
    }
    private static void writeDistance(int position) {
        for (int j = 0; j< position; j++) {
            System.out.print("-");
        }
    }

    public void showWinners(List<Car> winners) {
        String[] names = new String[winners.size()];
        for (int i=0; i<winners.size();i++) {
            names[i] = winners.get(i).getName();
        }
        System.out.print(String.join(", ",names));
        System.out.println("가 최종우승했습니다.");
    }
}
