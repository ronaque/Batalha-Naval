package batalha.naval.Barcos;
import batalha.naval.Interface;

public class Cruzador {
    public static Interface in = new Interface();
    public static int l = 0;
    public int size = 3;
   
    public void setPosition(int x, int y){
        for (int h = 0; h < size;h++) {
            Interface.Grid[x - 1 + h][y - 1] = 1;
        }
    }
}