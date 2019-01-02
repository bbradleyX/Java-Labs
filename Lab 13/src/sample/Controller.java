package sample;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public Label colorTypeLabel;
    public RadioButton p2RB;
    public RadioButton p1RB;
    public RadioButton p3RB;
    public RadioButton greyRB;
    public Label paperTypeLabel;
    public RadioButton glossyRB;
    public RadioButton matteRB;
    public Label sidedLabel;
    public RadioButton doubleRB;
    public RadioButton singleRB;
    public Label numPageLabel;
    public TextField numPageTF;
    public Label costPerPageLabel;
    public Label totalCostLabel;
    public Label selection;

    public AnchorPane ofPane;

    public void Initialize() {
        p1RB.setToggleGroup(rbGroup);
        p2RB.setToggleGroup(rbGroup);
        p3RB.setToggleGroup(rbGroup);
        greyRB.setToggleGroup(rbGroup);
        matteRB.setToggleGroup(rbGroup);
        glossyRB.setToggleGroup(rbGroup);
        singleRB.setToggleGroup(rbGroup);
        doubleRB.setToggleGroup(rbGroup);
        selection.setVisible(false);
    }

    public ToggleGroup rbGroup = new ToggleGroup();
}
