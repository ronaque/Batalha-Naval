package batalha.naval;


public class Interface {

    public static int[][] Grid;

    public static void Tabuleiro() {
        Grid = new int[10][10];
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                Grid[i][j] = 0;
            }
        }
    }

    public static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                System.out.print((Grid[i][j]));
            }
        }
        System.out.println("");
    }

}
