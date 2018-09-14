import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class Risiko {

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

    public void play() {
        /*int[] myNumber = new int[3];
        int[] computerNumber = new int[3];
        for(int i=0; i < 3; i++) {
            myNumber[i] = this.dieRoll();
            computerNumber[i] = this.dieRoll();
        }
        Arrays.sort(myNumber);
        Arrays.sort(computerNumber);

        System.out.println(Arrays.toString(myNumber));
        System.out.println(Arrays.toString(computerNumber));
        for (int j=0; j < 3; j++) {
            if (myNumber[j] > computerNumber[j]){
                System.out.println("win attack");
            } else {
                System.out.println("win defense");
            }
        }*/
        this.play(3,3);
    }

    public void play(int rollAttack, int rollDefense) {

        int[] myNumber = new int[rollAttack];
        int[] computerNumber = new int[rollDefense];

        for(int i=0; i < rollAttack; i++) {
            myNumber[i] = this.dieRoll();
        }
        for(int i=0; i < rollDefense; i++) {
            computerNumber[i] = this.dieRoll();
        }
        Arrays.sort(myNumber);
        Arrays.sort(computerNumber);

        myNumber = this.reverse(myNumber);
        computerNumber = this.reverse(computerNumber);

        System.out.println(Arrays.toString(myNumber));
        System.out.println(Arrays.toString(computerNumber));
        int minLengthOfArray = Math.min(myNumber.length, computerNumber.length);
        for (int j=0; j < minLengthOfArray; j++) {
            if (myNumber[j] > computerNumber[j]){
                System.out.println("win attack");
            } else {
                System.out.println("win defense");
            }
        }
    }

    public int[] reverse(int [] array) {
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

}
