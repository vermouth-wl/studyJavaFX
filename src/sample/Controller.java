package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label hello;
    public Controller(){}

    public void functionSayHello(ActionEvent actionEvent) {
        hello.setText("你好世界");
    }
}
