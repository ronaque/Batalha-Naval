package BatalhaNaval;


public class Interface {

    public static int[][] Grid;
    private static int Gridh = 8;
    private static int Gridv = 8;

    public static void Tabuleiro() {
        Grid = new int[Gridv][Gridh];
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
    public static int getGridv(){
        return Gridv;
    }
    public static int getGridh(){
        return Gridh;
    }

}
