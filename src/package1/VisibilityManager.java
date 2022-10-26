package package1;

public class VisibilityManager {

    UI ui;

    public VisibilityManager(UI userInterface){
        ui = userInterface;
    }

    public void showTitleScreen(){
        //SHOW TITLE SCREEN
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        //HIDE THE GAME SCREEN
        ui.maintextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);


    }

    public void titleToTown(){

        //Hide the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        //SHOW THE GAME SCREEN
        ui.maintextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);

    }



}