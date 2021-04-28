import java.io.IOException;
import java.util.*;
import Basket.Basket;
import Client.Big;
import Client.Client;
import Client.Medium;
import Client.Small;
import Invoice.Accountant;
import Products.Groceries.Fruit;
import Products.Groceries.Vegetables;
import Products.Medicine.PainKillers;
import Products.Medicine.Probiotics;
import Products.Other.Chainsaw;
import Products.Other.Mower;
import Products.Paper.HarshToiletPaper;
import Products.Paper.SoftToiletPaper;
import Products.Paper.ToiletPaper;
import Products.Product;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class main extends Application implements EventHandler<ActionEvent>{
    TableView<Product> tableView = new TableView<Product>();
    TableColumn ProductCol = new TableColumn("Product");
    TableColumn PriceCol = new TableColumn("Price");
    Date czas = new Date(2000,3,12);
    Client Small = new Small(1, czas, "Olimpijska","156");
    Client Medium = new Medium(1, czas, "Olimpijska","222");
    Client Big = new Big(1, czas, "Olimpijska","321");
    int cena1 = 0;
    Text cena2 = new Text("");
    List<Product> products=new ArrayList<>();
    List<Product> ListOfBucket=new ArrayList<>();
    Basket koszyk = new Basket();
    Stage window;
    Scene scene;
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Text cena = new Text("");
    int i;
    Accountant John = new Accountant(1);

    ComboBox<String> combobox;
    ComboBox<String> combobox1;
    String cos = "-fx-background-color: #a9a9a9;"
            + "-fx-font-size: 38;-fx-border-color: #000000; -fx-border-width: 3px;";
    String cos1 = "-fx-background-color: #a9a9a9;"
            + "-fx-font-size: 22;-fx-border-color: #000000; -fx-border-width: 3px;";
    public void main() {
        launch();
    }

    @Override
    public void start(Stage primaryStage)  {

        John.setActualBasket(koszyk);
        Date czas = new Date(2000,3,12);
        Product Paper1 = new ToiletPaper(1,2,"PaperRegina",10,10,1,"Super");
        Product Paper2 = new SoftToiletPaper(2,5,"PaperAnt",10,10,1,"Super",3,1);
        Product Paper3 = new HarshToiletPaper(3,10,"PaperForBDSM",10,10,1,"Super",1);
        Product Paper4 = new HarshToiletPaper(4,30,"PaperDiamond",10,10,1,"Super",1);
        Product Chainsaw1 = new Chainsaw(5,300,"ZombieCutterV10",10,40,"Sthil",100,"Blue");
        Product Chainsaw2 = new Chainsaw(6,400,"ZombieCutterV12",15,50,"Sthil",120,"Blue");
        Product Mover1 = new Mower(7,1200,"ZombieSmasherV4",400,1000,"Sthil",120,"GULGUL");
        Product PainKiller1 = new PainKillers(8,32,"APAP",5,12,"DAY",czas);
        Product PainKiller2 = new PainKillers(9,39,"Peralgin",6,12,"DAY",czas);
        Product PainKiller3 = new PainKillers(10,43,"PainKiller",7,12,"NIGHT",czas);
        Product Probitic1 = new Probiotics(11,22,"ACTIMEL",7,12,"NIGHT",czas,1);
        Product Probitic2 = new Probiotics(12,12,"ACT PLUS",8,13,"DAY",czas,2);
        Product Fruit1 = new Fruit(13,2,"Apple",1,3,true,3);
        Product Fruit2 = new Fruit(14,3,"Peach",1,3,true,3);
        Product Fruit3 = new Fruit(15,4,"Banana",1,3,true,3);
        Product Fruit4 = new Fruit(16,6,"Strawberry",1,3,true,3);
        Product Vegetable1 = new Vegetables(17,4,"Potato",1,3,true,true);
        Product Vegetable2 = new Vegetables(18,3,"Cucumber",1,3,true,true);
        Product Vegetable3 = new Vegetables(19,5,"Tomato",1,3,true,true);
        products.add(Paper1);
        products.add(Paper2);
        products.add(Paper3);
        products.add(Paper4);
        products.add(Chainsaw1);
        products.add(Chainsaw2);
        products.add(Mover1);
        products.add(PainKiller1);
        products.add(PainKiller2);
        products.add(PainKiller3);
        products.add(Probitic1);
        products.add(Probitic2);
        products.add(Fruit1);
        products.add(Fruit2);
        products.add(Fruit3);
        products.add(Fruit4);
        products.add(Vegetable1);
        products.add(Vegetable2);
        products.add(Vegetable3);



        CheckBox checkBox1 = new CheckBox("BIG");
        CheckBox checkBox2 = new CheckBox("MEDIUM");
        CheckBox checkBox3 = new CheckBox("SMALL");

        Text textWybiezProdukt = new Text("CHOOSE");
        Text textBASKET = new Text("BASKET");
        Text textilosc = new Text("AMOUNT");
        Text textkoszyk = new Text("CART");
        Text textprzerwa = new Text("                                 ");
        Text textprzerwa2 = new Text("             ");
        Text textprzerwa3 = new Text("");
        Text textprzerwa4 = new Text("        ");
        Text textprzerwa5 = new Text("        ");
        Text textprzerwa6 = new Text("                                            ");
        Text textprzerwa7 = new Text("             ");
        Text textprzerwa8 = new Text("             ");
        Text textprzerwa9 = new Text("             ");
        Text textprzerwa10 = new Text("");
        checkBox1.setStyle(cos);
        checkBox2.setStyle(cos);
        checkBox3.setStyle(cos);
        textBASKET.setStyle(cos);
        textkoszyk.setStyle(cos);
        textprzerwa.setStyle(cos);
        textprzerwa2.setStyle(cos);
        textprzerwa3.setStyle(cos);
        textilosc.setStyle(cos);
        textWybiezProdukt.setStyle(cos);
        button = new Button("ADD");
        button.setStyle(cos);
        button1 = new Button("Invoice");
        button1.setStyle(cos);
        button2 = new Button("Info");
        button2.setStyle(cos);
        button3 = new Button("ClearALL");
        button3.setStyle(cos);
        button4 = new Button("ClearSelected");
        button4.setStyle(cos);
        VBox layout = new VBox(10);
        GridPane gridPane = new GridPane();
        GridPane gridPane2 = new GridPane();
        GridPane gridPane3 = new GridPane();
        GridPane gridPane4 = new GridPane();
        TextField text = new TextField();
        text.setStyle(cos);
        scene = new Scene(layout,1500, 800);
        window = primaryStage;
        window.setTitle("Sklep");

        combobox = new ComboBox<>();
        combobox.getItems().addAll(
                Paper1.getName(),
                Paper2.getName(),
                Paper3.getName(),
                Paper4.getName(),
                Chainsaw1.getName(),
                Chainsaw2.getName(),
                Mover1.getName(),
                PainKiller1.getName(),
                PainKiller2.getName(),
                PainKiller3.getName(),
                Probitic1.getName(),
                Probitic2.getName(),
                Fruit1.getName(),
                Fruit2.getName(),
                Fruit3.getName(),
                Fruit4.getName(),
                Vegetable1.getName(),
                Vegetable2.getName(),
                Vegetable3.getName()

        );
        combobox.setStyle(cos);
        gridPane.add(textWybiezProdukt,0,0);
        gridPane.add(textilosc,2,0);
        gridPane.add(textkoszyk,4,0);
        gridPane.add(combobox,0,1);
        gridPane.add(textprzerwa,1,0);
        gridPane.add(text,2,1);
        gridPane.add(textprzerwa2,3,0);
        gridPane.add(button,4,1);
        gridPane2.add(textprzerwa3,0,2);
        gridPane2.add(textBASKET,0,4);
        gridPane2.add(checkBox1,0,3);
        gridPane2.add(textprzerwa4,1,3);
        gridPane2.add(checkBox2,2,3);
        gridPane2.add(textprzerwa5,3,3);
        gridPane2.add(checkBox3,4,3);
        gridPane2.add(textprzerwa6,6,4);
        gridPane2.add(button1,7,4);
        gridPane2.add(textprzerwa7,8,4);
        gridPane2.add(button2,9,4);
        gridPane2.add(textprzerwa10,8,5);
        gridPane2.add(textprzerwa8,8,6);
        gridPane2.add(button3,7,6);
        gridPane2.add(textprzerwa9,8,6);
        gridPane2.add(button4,9,6);
        this.ListOfBucket = koszyk.getAll();

        button.setOnAction(event1 ->addToBasket(combobox.getValue(),(i = Integer.parseInt(text.getText())),gridPane3,1,gridPane4));

        button1.setOnAction(event3 -> {
            try {
                Invoice(checkBox1.isSelected(),checkBox2.isSelected(),checkBox3.isSelected(),gridPane4);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        button2.setOnAction(event4 ->info());

        button3.setOnAction(event5 ->addToBasket(combobox.getValue(),(i = Integer.parseInt(text.getText())),gridPane3,2,gridPane4));
        button4.setOnAction(event6 ->delete(gridPane3,gridPane4));


        layout.setPadding(new Insets(15, 15, 15, 15));
        layout.getChildren().addAll(gridPane,gridPane2,gridPane3,gridPane4);
        layout.setStyle(("-fx-background-color: grey"));
        window.setScene(scene);
        window.show();
    }
    public void delete(GridPane gridPane,GridPane gridPane6) {
            Text text = new Text();
            Stage stage = new Stage();
            stage.setTitle("Delete");
            Label label = new Label("This is a Popup");
            TilePane tilepane = new TilePane();
            GridPane gridPane4 = new GridPane();
            GridPane gridPane2 = new GridPane();
            GridPane gridPane3 = new GridPane();
            VBox layout = new VBox(10);
            layout.getChildren().addAll(gridPane4, gridPane2, gridPane3);
            layout.setStyle(("-fx-background-color: grey"));
            combobox1 = new ComboBox<>();
            combobox1.setStyle(cos);
            for (int x = 0; x < koszyk.getAll().size(); x++) {
                combobox1.getItems().addAll(ListOfBucket.get(x).getName());
            }
            Button button3 = new Button("Delete");
            Button button4 = new Button("End");
            gridPane4.getChildren().add(combobox1);
            gridPane2.add(button3,1,0);
            gridPane2.add(button4,2,0);
            gridPane3.getChildren().add(text);
            button3.setOnAction(event -> {
                for (int x = 0; x < koszyk.getListSize(); x++) {
                    if (ListOfBucket.get(x).getName().equals(combobox1.getValue())) {
                        ListOfBucket.remove(x);
                        gridPane.getChildren().remove(tableView);
                        ObservableList data = FXCollections.observableList(koszyk.getAll());
                        tableView.setItems(data);
                        ProductCol.setCellValueFactory(new PropertyValueFactory("name"));
                        PriceCol.setCellValueFactory(new PropertyValueFactory("cost"));
                        tableView.getColumns().setAll(ProductCol,PriceCol);
                        gridPane.add(tableView,0,5);
                        combobox1.getItems().clear();
                        cena1 = 0;
                        for (int y = 0; y < koszyk.getAll().size(); y++) {
                            combobox1.getItems().addAll(ListOfBucket.get(y).getName());
                            cena1 += ListOfBucket.get(y).getCost();
                        }
                        cena.setText("SUM : "+cena1+"$");
                        cena.setStyle(cos);
                        gridPane.getChildren().remove(cena);
                        gridPane.add(cena,0,6);
                        gridPane6.getChildren().clear();
                        break;

                    }
                }


            });
            button3.setStyle(cos);
            button4.setStyle(cos);
            text.setStyle(cos);
            Scene scene = new Scene(layout, 1200, 600);
            tilepane.setStyle((("-fx-background-color: grey")));
            stage.setScene(scene);
            stage.show();
            button4.setOnAction(event -> stage.close());
    }

    public void info(){
//        System.out.println(ListOfBucket.get(1).getName());
        Text text = new Text();
        Stage stage = new Stage();
        stage.setTitle("INFO");
        Label label = new Label("This is a Popup");
        TilePane tilepane = new TilePane();
        GridPane gridPane = new GridPane();
        GridPane gridPane2 = new GridPane();
        GridPane gridPane3 = new GridPane();
        Button button4 = new Button("End");
        VBox layout = new VBox(10);
        layout.getChildren().addAll(gridPane,gridPane2,gridPane3);
        layout.setStyle(("-fx-background-color: grey"));
        combobox1 = new ComboBox<>();
        combobox1.setStyle(cos);
        for( int x =0 ;x<koszyk.getAll().size();x++){
            if(!combobox1.getItems().contains(ListOfBucket.get(x).getName()))
                combobox1.getItems().addAll(ListOfBucket.get(x).getName());
        }
        Button button3 = new Button("Info");
        button4.setStyle(cos);
        gridPane.getChildren().add(combobox1);
        gridPane2.add(button3,0,0);
        gridPane2.add(button4,1,0);
        gridPane3.getChildren().add(text);
        button3.setOnAction(event -> {
            for(int x=0;x<koszyk.getListSize();x++){
                if(ListOfBucket.get(x).getName().equals(combobox1.getValue())){
                    text.setText(ListOfBucket.get(x).getInfo());

                }
            }
        });
        button3.setStyle(cos);
        text.setStyle(cos);
        Scene scene = new Scene(layout,1200,600);
        tilepane.setStyle((("-fx-background-color: grey")));
        stage.setScene(scene);
        stage.show();
        button4.setOnAction(event -> stage.close());
    }

    public void addToBasket(String nazwa, int ilośc, GridPane gridPane,int tryb,GridPane gridPane2){
    tableView.setStyle(cos1);
    if(tryb == 1) {
        for (int x = 0; x < ilośc; x++) {
            for (int j = 0; j < products.size(); j++) {
                if (nazwa == products.get(j).getName()) {
                    koszyk.add(products.get(j));
                }
            }
        }
        cena1 = 0;
        for (int x = 0; x < koszyk.getAll().size(); x++) {
            cena1 += ListOfBucket.get(x).getCost();
        }
    }
    else {
        koszyk.getAll().clear();
        cena1 = 0;
        gridPane2.getChildren().clear();
    }
        if(tryb!=1){
            ProductCol.getColumns().removeAll();
            PriceCol.getColumns().removeAll();
            tableView.getColumns().setAll(ProductCol,PriceCol);
        } else {
            ObservableList data = FXCollections.observableList(koszyk.getAll());
            tableView.setItems(data);
            ProductCol.setCellValueFactory(new PropertyValueFactory("name"));
            PriceCol.setCellValueFactory(new PropertyValueFactory("cost"));
            tableView.getColumns().setAll(ProductCol,PriceCol);
        }
        tableView.setPrefWidth(550);
        tableView.setPrefHeight(400);
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        gridPane.getChildren().remove(tableView);
        gridPane.add(tableView,0,5);
        cena.setText("SUM : "+cena1+"$");
        cena.setStyle(cos);
        gridPane.getChildren().remove(cena);
        gridPane.add(cena,0,6);

    }
    public void Invoice(boolean a, boolean b, boolean c,GridPane gridPane) throws IOException {


        if(a){
            koszyk.setClientOfBasket(Big);
            John.generateInvoice();

        } else if(b){
            koszyk.setClientOfBasket(Medium);
            John.generateInvoice();
        } else {
            koszyk.setClientOfBasket(Small);
            John.generateInvoice();

        }

        cena2.setText("Final Price : "+John.getPrice()+"$");
        cena2.setStyle(cos);
        gridPane.getChildren().remove(cena2);
        gridPane.add(cena2,0,7);
    }

    @Override
    public void handle(ActionEvent event) {

    }
    String addspace(int i, String str)
    {
        StringBuilder str1 = new StringBuilder();
        for(int j=0;j<i;j++)
        {
            str1.append(" ");
        }
        str1.append(str);
        return str1.toString();

    }



}
