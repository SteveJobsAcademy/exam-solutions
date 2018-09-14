public class Main {
    public static void main (String args[]) {
        //EvenOdd g = new EvenOdd();
        //String response = g.play("even", 2);
        //System.out.println("response:" + response);

        //String response2 = g.playWithDivision("even", 2);
        //System.out.println("response:" + response2);
        //Risiko r = new Risiko();
        //r.play();
        //r.play(3, 2);

        Goose g = new Goose(90, 3);

        int response = g.play();
        System.out.println("response:" + response);
    }
}

