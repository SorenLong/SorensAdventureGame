package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);


    public Game() {
        this.ui.createUI(cHandler);
        vm.ShowTitleScreen();
    }

    public class ChoiceHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String yourChoice = e.getActionCommand();
            switch (yourChoice){
                case "start":
                    vm.hideTitleScreen();
                    break;
                case "c1":
                    break;
                case "c2":
                    break;
                case "c3":
                    break;
                case "c4":
                    break;
                case "c5":
                    break;
            }
        }
    }
}
