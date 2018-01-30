package batalha.naval;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class InterfaceGrafica extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    private Stage Sone;
    private Scene Principal,Player1,Player2,SRegras;
    
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
        VBox layout3 = new VBox(40);
        Label regras = new Label("Regras:\n"+
                "1. No máximo 2 jogadores\n"+
                "2. Cada jogador coloca 1 navio de cada exemplar\n"+
                "3. Cada jogador ataca uma vez por turno\n"+
                "4. Os jogadores não podem ver o jogo do oponente\n"+
                "5. Os barcos não podem ocupar o mesmo espaço");
        Button ExitR = new Button("Sair");
        ExitR.setOnAction(e -> {
            Sone.setWidth(480);
            Sone.setHeight(520);
            Sone.setTitle("Batalha Naval");
            Sone.setScene(Principal);
        });
        layout3.setAlignment(Pos.CENTER);
        layout3.getChildren().addAll(regras,ExitR);
        SRegras = new Scene(layout3);
    }
    public void setPlayer1(){
        BorderPane border = new BorderPane();
        //Player 1 = new scene(border);
    }
}
