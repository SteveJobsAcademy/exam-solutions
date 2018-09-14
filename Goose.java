import java.util.Arrays;

public class Goose {
    private int boxes = 90;
    private int[] positions;
    private int numberOfPlayer = 1;

    public Goose() {}

    public Goose(int boxes, int numberOfPlayer) {
        this.boxes = boxes;
        this.numberOfPlayer = numberOfPlayer;
        this.positions = new int[numberOfPlayer];
        for (int i=0; i < numberOfPlayer; i++){
            this.positions[i] = 1;
        }
        System.out.println(Arrays.toString(this.positions));
    }

    public int play() {
        int counter = 0;
        while(true) {
            counter++;
            for (int i=0; i< this.numberOfPlayer; i++) {
                int roll = dieRoll();
                this.positions[i] += roll;
                if (this.positions[i] == this.boxes) {
                    System.out.println(Arrays.toString(this.positions));
                    System.out.println("win player " + (i + 1));
                    return counter;
                } else if (this.positions[i] > this.boxes) {
                    int difference = this.positions[i] - this.boxes;
                    this.positions[i] = this.boxes - difference;
                }
            }
            System.out.println(Arrays.toString(this.positions));
        }
    }

    public int dieRoll () {
        Double random = Math.random();
        int number;
        if (random < 0.166) {
            number = 1;
        } else if (random < 0.32) {
            number = 2;
        } else if (random < 0.48) {
            number = 3;
        } else if (random < 0.64) {
            number = 4;
        } else if (random < 0.8) {
            number = 5;
        } else {
            number = 6;
        }
        return number;
    }
}
