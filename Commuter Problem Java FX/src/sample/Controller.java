package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label distLabel;
    public TextField distTF;
    public Label mainLabel;
    public TextField mainTF;
    public Label mpgLabel;
    public TextField mpgTF;
    public Label gasLabel;
    public TextField gasTF;
    public Label tickLabel;
    public TextField tickTF;
    public Button okButton;
    public Label CostLabel;
    public Label CheaperLabel;
    public Label distErrorLabel;
    public Label mainErrorLabel;
    public Label mpgErrorLabel;
    public Label gasErrorLabel;
    public Label ticketErrorLabel;


    public void okButtonClicked() {
        double dist = 0;
        double maint = 0;
        double mpg = 0;
        double gas = 0;
        double ticket = 0;
        try {
            dist = Double.parseDouble(distTF.getText());
        } catch (NumberFormatException e) {
            distErrorLabel.setText("Error: input a number");
        }

        try {
            mpg = Double.parseDouble(mpgTF.getText());
        } catch (NumberFormatException e) {
            mpgErrorLabel.setText("Error: input a number");
        }
        try {
            gas = Double.parseDouble(gasTF.getText());
        } catch (NumberFormatException e) {
            gasErrorLabel.setText("Error: input a number");
        }
        try {
            ticket = Double.parseDouble(tickTF.getText());
        } catch (NumberFormatException e) {
            ticketErrorLabel.setText("Error: input a number");
        }
        if (dist!=0) {
            if (mpg != 0) {
                if (gas != 0) {
                    if (maint != 0) {
                        if (ticket != 0) {
                            Commuter me = new Commuter(dist, mpg, gas, maint, ticket);
                            me.calculateCostToDrive();
                            me.determineCheaperTransportation();
                            CostLabel.setText("Cost to drive: $" + me.getCostToDrive() + " Ticket: $" +
                                    ticket);
                            CheaperLabel.setText("Cheaper: " + me.getCheaperTransportation());
                            //Commuter me = new Commuter(dist, mpg, gas, maint, ticket);
                        }
                    }
                }
            }
        }
        else{
            CostLabel.setText("Calcultion Error");
            CheaperLabel.setText("Calcultion Error");
        }
    }
}
