package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Label GreetLabel;
    public Button GreetButton;

    public void greetButtonClicked(){
        this.GreetLabel.setVisible(true);
    }
}
