package batalha.naval.Barcos;
import batalha.naval.Interface;


public class Destruidor {
    static Interface in = new Interface();
    public int size = 2;

    
    public void setPosition(int x, int y) {
        for (int h = 0; h < size; h++) {
        Interface.Grid[x - 1 + h][y - 1] = 1;
    }  
}
}
