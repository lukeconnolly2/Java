import java.util.Scanner;

public class Game {

    public Game(){
        Board b = new Board();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Player 1 name: ");
        Player p1 = new Player(s.nextLine());

        System.out.println("Enter Player 2 name: ");
        Player p2 = new Player(s.nextLine());

        s.close();

        b.printBoard();
        System.out.println(p1.getName() + "'s pieces: " + p1.getPieces());
        System.out.println(p2.getName() + "'s pieces: " + p2.getPieces());

        p1.usePiece("I1");

        System.out.println(p1.getName() + "'s pieces: " + p1.getPieces());
        System.out.println(p2.getName() + "'s pieces: " + p2.getPieces());

    }
}
