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

    public void hideTitleScreen(){
        // Hide Title Screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        // Show Game Scree stuff
        ui.maintextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);

    }
}
