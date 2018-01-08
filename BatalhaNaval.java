package batalha.naval;

import batalha.naval.Barcos.Cruzador;
import batalha.naval.Barcos.Destruidor;
import batalha.naval.Barcos.NaviodeGuerra;
import batalha.naval.Barcos.PortaAvioes;
import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cruzador C = new Cruzador();
        Destruidor D = new Destruidor();
        NaviodeGuerra NG = new NaviodeGuerra();
        PortaAvioes PA = new PortaAvioes();
        Tiro T = new Tiro();
        
        Interface.Tabuleiro();
        C.setPosition(in.nextInt(), in.nextInt());
        D.setPosition(in.nextInt(), in.nextInt());
        NG.setPosition(in.nextInt(), in.nextInt());
        PA.setPosition(in.nextInt(), in.nextInt());
        Interface.print();
        
        T.tiro(3, 4);
        Interface.print();
    }
    
}
