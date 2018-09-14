public class EvenOdd {

    public String play(String myChoice, int myNumber) {
        int computerNumber;
        Double random = Math.random();
        if (random < 0.166) {
            computerNumber = 0;
        } else if (random < 0.32) {
            computerNumber = 1;
        } else if (random < 0.48) {
            computerNumber = 2;
        } else if (random < 0.64) {
            computerNumber = 3;
        } else if (random < 0.8) {
            computerNumber = 4;
        } else {
            computerNumber = 5;
        }
        int sum = myNumber + computerNumber;
        if ((sum%2 == 0 && myChoice == "even")
                || (sum%2 != 0 && myChoice == "odd")) {
            return "You win";
        } else {
            return "you lose";
        }
    }

    public String playWithDivision(String myChoice, int myNumber) {
        int computerNumber;
        Double random = Math.random();
        if (random < 0.2) {
            computerNumber = 1;
        } else if (random < 0.4) {
            computerNumber = 2;
        } else if (random < 0.6) {
            computerNumber = 3;
        } else if (random < 0.8) {
            computerNumber = 4;
        } else {
            computerNumber = 5;
        }
        int sum = (int) myNumber / computerNumber;
        if ((sum%2 == 0 && myChoice == "even")
                || (sum%2 != 0 && myChoice == "odd")) {
            return "You win";
        } else {
            return "you lose";
        }
    }
}
