package package1;

public class VisibilityManager {

    UI ui;
    public VisibilityManager(UI userInterface){
        ui = userInterface;

    }

    public void ShowTitleScreen(){
        //show title screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        //Hide the game screen
        ui.maintextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }
}
