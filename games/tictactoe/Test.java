
public class Test {

    public static void main(String[] args) {

        boolean player_turn = true;
        String player = player_turn ? "X" : "O";

        player_turn = false;
        player = player_turn ? "X" : "O";

        System.out.println("'\nplayer = " + player + "\n");
    }

}
