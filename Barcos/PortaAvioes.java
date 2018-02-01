package BatalhaNaval.Barcos;
import BatalhaNaval.Interface;

public class PortaAvioes {
    public int size = 5;
    
    public void setPosition(int x, int y) {
        for (int h = 0; h < size; h++) {
        Interface.Grid[x - 1 + h][y - 1] = 1;
    }
}
}
