package batalha.naval;

public class Tiro {

    public void tiro(int x, int y) {
        if (Interface.Grid[x - 1][y - 1] == 1) {
            System.out.println("Você acertou um barco");
            Interface.Grid[x - 1][y - 1] = 0;
        } else {
            System.out.println("Você errou");
        }
    }
}
