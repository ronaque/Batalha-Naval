package BatalhaNaval;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class InterfaceGrafica extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    private Stage Sone;
    private Scene Principal,Player1,Player2,SRegras;
    private Button[][] buttons;
    
    @Override
    public void start(Stage sla) throws Exception {
        Sone = sla;
        Sone.setTitle("Batalha Naval");
        Sone.setWidth(480);
        Sone.setHeight(520);
        
        setPrincipal();
        
        Sone.setScene(Principal);
        Sone.show();
    }
    
    public void setPrincipal(){
        
        Label Title = new Label("Batalha Naval");
        Title.setStyle("-fx-font-size: 48");
        Button play = new Button("Jogar");
        play.setOnAction(e -> {
            Sone.setTitle("Jogador 1");
            setPlayer1();
            Sone.setScene(Player1);
        });
        Button Regras = new Button("Regras");
        VBox layout = new VBox(30);
        Regras.setOnAction(e -> {
            setSRegras();
            Sone.setScene(SRegras);
        });
        Button exit = new Button("Sair");
        exit.setOnAction(e -> {
           Sone.close();
        });
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(Title, play, Regras,exit);
        Principal = new Scene(layout);
    }

    public void setSRegras(){
        Sone.setWidth(470);
        Sone.setHeight(360);
        Sone.setTitle("Regras");
        VBox layout2 = new VBox(40);
        Label regras = new Label("Regras:\n"+
                "1. No máximo 2 jogadores\n"+
                "2. Cada jogador coloca 1 navio de cada exemplar\n"+
                "3. Cada jogador ataca uma vez por turno\n"+
                "4. Os jogadores não podem ver o jogo do oponente\n"+
                "5. Os barcos não podem ocupar o mesmo espaço\n"+
                "6. Tamanho dos barcos:\n"+
                "  Destruidor - 2 espaços\n"+
                "  Cruzador - 3 espaços\n"+
                "  Navio de Guerra - 4 espaços\n"+
                "  Porta Aviões - 5 espaços\n");
        Button ExitR = new Button("Sair");
        ExitR.setOnAction(e -> {
            Sone.setWidth(480);
            Sone.setHeight(520);
            Sone.setTitle("Batalha Naval");
            Sone.setScene(Principal);
        });
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().addAll(regras,ExitR);
        SRegras = new Scene(layout2);
    }
    public void setPlayer1(){
        Sone.setHeight(420);
        Sone.setWidth(530);
        BorderPane border = new BorderPane();
        GridPane grid = new GridPane();
        VBox layout3 = new VBox();
        grid.setVgap(4);
        grid.setHgap(4);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setAlignment(Pos.TOP_LEFT);
         
        for(int x = 0; x < Interface.getGridh(); x++){
            for (int y = 0; y < Interface.getGridv(); y++){
                Button buttong = new Button();
                grid.add(buttong, x, y);
                
                buttong.setMinHeight(35);
                buttong.setMinWidth(35);
            }
        }
        
        VBox Planes = new VBox(20);
        Button cruzador = new Button("Cruzador");
        cruzador.setOnAction(e -> {
        
        });
        
        Button destruidor = new Button("Destruidor");
        
        Button naviodeguerra = new Button("Navio De Guerra");       
        
        Button portaavioes = new Button("Porta Aviões");
        
        Planes.setPadding(new Insets(80, 20, 20, 20));
        
        Planes.getChildren().addAll(destruidor, cruzador, naviodeguerra, portaavioes);
        border.setLeft(grid);
        border.setRight(Planes);
        Player1 = new Scene(border);
    }
}
