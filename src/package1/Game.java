package package1;


//Ur at like 13:43 in the tutoiral

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();

    public static void main(String[] args){

        new Game();

    }

    public Game(){

        ui.createUI(cHandler);

    }

    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){


        }

    }


}