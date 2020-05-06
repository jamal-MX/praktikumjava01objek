public class Main {
    public static void main(String[] args) {
        Worm player1 = new Worm();
        Worm player2 = new Worm();

        player1.username = "Agus";
        player1.score = 500;
        player1.length = 3.5;

        player1.eatSnack();

        System.out.println(player1.score);
        player1.eatOthers(player2);
        System.out.println(player1.score);
    }
}

