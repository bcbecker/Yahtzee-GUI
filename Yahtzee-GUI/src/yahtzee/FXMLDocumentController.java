package yahtzee;

import yahtzee.Roll.scoreType;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author becker.bryce
 */
public class FXMLDocumentController implements Initializable {
    
    private Player player1;
    private Roll player1Roll;
    private RollScoring player1Scorer;
    
    private Player player2;
    private Roll player2Roll;
    private RollScoring player2Scorer;
    
    private Computer computer;
    private Roll computerRoll;
    private RollScoring computerScorer;
    
    private int turnCounter;
    
    
    
    @FXML
    private Button singlePlayerButtonClick;
    @FXML
    private Button multiplayerButtonClick;
    @FXML
    private Button quitButtonClick;
    @FXML
    private Label titleText;
    @FXML
    private Label infoText;
    @FXML
    private AnchorPane player1scoreCard;
    @FXML
    private Label player1Title;
    @FXML
    private AnchorPane otherPlayerScoreCard;
    @FXML
    private Label otherPlayerTitle;
    @FXML
    private Label player1ones;
    @FXML
    private Label player1twos;
    @FXML
    private Label player1threes;
    @FXML
    private Label player1fours;
    @FXML
    private Label player1fives;
    @FXML
    private Label player1sixes;
    @FXML
    private Label player1threeofakind;
    @FXML
    private Label player1fourofakind;
    @FXML
    private Label player1fullhouse;
    @FXML
    private Label player1smallstraight;
    @FXML
    private Label player1largestraight;
    @FXML
    private Label player1chance;
    @FXML
    private Label player1yahtzee;
    @FXML
    private Label player1total;
    @FXML
    private Separator player1grid3;
    @FXML
    private Separator player1grid1;
    @FXML
    private Separator player1grid17;
    @FXML
    private Separator player1grid2;
    @FXML
    private Separator player1grid4;
    @FXML
    private Separator player1grid5;
    @FXML
    private Separator player1grid9;
    @FXML
    private Separator player1grid8;
    @FXML
    private Separator player1grid6;
    @FXML
    private Separator player1grid7;
    @FXML
    private Separator player1grid10;
    @FXML
    private Separator player1grid11;
    @FXML
    private Separator player1grid12;
    @FXML
    private Separator player1grid13;
    @FXML
    private Separator player1grid15;
    @FXML
    private Separator player1grid14;
    @FXML
    private Separator player1grid16;
    @FXML
    private Label otherPlayerones;
    @FXML
    private Label otherPlayertwos;
    @FXML
    private Label otherPlayerthrees;
    @FXML
    private Label otherPlayerfours;
    @FXML
    private Label otherPlayerfives;
    @FXML
    private Label otherPlayersixes;
    @FXML
    private Label otherPlayerthreeofakind;
    @FXML
    private Label otherPlayerfourofakind;
    @FXML
    private Label otherPlayerfullhouse;
    @FXML
    private Label otherPlayersmallstraight;
    @FXML
    private Label otherPlayerlargestraight;
    @FXML
    private Label otherPlayerchance;
    @FXML
    private Label otherPlayeryahtzee;
    @FXML
    private Label otherPlayertotal;
    @FXML
    private Separator otherPlayergrid3;
    @FXML
    private Separator otherPlayergrid1;
    @FXML
    private Separator otherPlayergrid17;
    @FXML
    private Separator otherPlayergrid2;
    @FXML
    private Separator otherPlayergrid4;
    @FXML
    private Separator otherPlayergrid5;
    @FXML
    private Separator otherPlayergrid9;
    @FXML
    private Separator otherPlayergrid8;
    @FXML
    private Separator otherPlayergrid6;
    @FXML
    private Separator otherPlayergrid7;
    @FXML
    private Separator otherPlayergrid10;
    @FXML
    private Separator otherPlayergrid11;
    @FXML
    private Separator otherPlayergrid12;
    @FXML
    private Separator otherPlayergrid13;
    @FXML
    private Separator otherPlayergrid15;
    @FXML
    private Separator otherPlayergrid14;
    @FXML
    private Separator otherPlayergrid16;
    @FXML
    private Button player1scoreONES;
    @FXML
    private Button player1scoreTWOS;
    @FXML
    private Button player1scoreTHREES;
    @FXML
    private Button player1scoreFOURS;
    @FXML
    private Button player1scoreFIVES;
    @FXML
    private Button player1scoreSIXES;
    @FXML
    private Button player1scoreTHREEOFAKIND;
    @FXML
    private Button player1scoreFOUROFAKIND;
    @FXML
    private Button player1scoreFULLHOUSE;
    @FXML
    private Button player1scoreSMALLSTRAIGHT;
    @FXML
    private Button player1scoreLARGESTRAIGHT;
    @FXML
    private Button player1scoreCHANCE;
    @FXML
    private Button player1scoreYAHTZEE;
    @FXML
    private Button otherplayerscoreONES;
    @FXML
    private Button otherplayerscoreTWOS;
    @FXML
    private Button otherplayerscoreTHREES;
    @FXML
    private Button otherplayerscoreFOURS;
    @FXML
    private Button otherplayerscoreFIVES;
    @FXML
    private Button otherplayerscoreSIXES;
    @FXML
    private Button otherplayerscoreTHREEOFAKIND;
    @FXML
    private Button otherplayerscoreFOUROFAKIND;
    @FXML
    private Button otherplayerscoreFULLHOUSE;
    @FXML
    private Button otherplayerscoreSMALLSTRAIGHT;
    @FXML
    private Button otherplayerscoreLARGESTRAIGHT;
    @FXML
    private Button otherplayerscoreCHANCE;
    @FXML
    private Button otherplayerscoreYAHTZEE;
    @FXML
    private AnchorPane otherplayerRollAnchor;
    @FXML
    private Button otherplayerRollButton;
    @FXML
    private AnchorPane player1RollAnchor;
    @FXML
    private Button player1RollButton;
    @FXML
    private Button die1;
    @FXML
    private Button die2;
    @FXML
    private Button die3;
    @FXML
    private Button die4;
    @FXML
    private Button die5;
    @FXML
    private Button die6;
    @FXML
    private Button otherplayerRerollButton;
    @FXML
    private Button player1RerollButton;
    @FXML
    private Label player1scoreONESLabel;
    @FXML
    private Label player1scoreTWOSLabel;
    @FXML
    private Label player1scoreTHREESLabel;
    @FXML
    private Label player1scoreFOURSLabel;
    @FXML
    private Label player1scoreFIVESLabel;
    @FXML
    private Label player1scoreSIXESLabel;
    @FXML
    private Label player1scoreTHREEOFAKINDLabel;
    @FXML
    private Label player1scoreFOUROFAKINDLabel;
    @FXML
    private Label player1scoreFULLHOUSELabel;
    @FXML
    private Label player1scoreSMALLSTRAIGHTLabel;
    @FXML
    private Label player1scoreLARGESTRAIGHTLabel;
    @FXML
    private Label player1scoreCHANCELabel;
    @FXML
    private Label player1scoreYAHTZEELabel;
    @FXML
    private Label player1TotalScoreLabel;
    @FXML
    private Label otherplayerscoreONESLabel;
    @FXML
    private Label otherplayerscoreTWOSLabel;
    @FXML
    private Label otherplayerscoreTHREESLabel;
    @FXML
    private Label otherplayerscoreFOURSLabel;
    @FXML
    private Label otherplayerscoreFIVESLabel;
    @FXML
    private Label otherplayerscoreSIXESLabel;
    @FXML
    private Label otherplayerscoreTHREEOFAKINDLabel;
    @FXML
    private Label otherplayerscoreFOUROFAKINDLabel;
    @FXML
    private Label otherplayerscoreFULLHOUSELabel;
    @FXML
    private Label otherplayerscoreSMALLSTRAIGHTLabel;
    @FXML
    private Label otherplayerscoreLARGESTRAIGHTLabel;
    @FXML
    private Label otherplayerscoreCHANCELabel;
    @FXML
    private Label otherplayerscoreYAHTZEELabel;
    @FXML
    private Label otherplayerTotalScoreLabel;
    @FXML
    private Label winLabel;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        makeStartingScreenVisible(true);
        makeTablesVisible(false);
        makePlayer1TableButtonsVisible(false);
        makeOtherPlayerTableButtonsVisible(false);
        makeDiceVisible(false);
        player1RerollButton.setVisible(false);
        otherplayerRerollButton.setVisible(false);
        winLabel.setVisible(false);
        turnCounter = 1;

    }    

    @FXML
    private void singlePlayerButtonAction(ActionEvent event) {
        makeStartingScreenVisible(false);
        
        otherPlayerTitle.setText("Computer");
        setUpPlayer1();
        setUpComputer();
        makeTablesVisible(true);
        player1RollButton.setVisible(true);
        makeDiceWhite();
        makeDiceVisible(true);
        disableAllScoreButtons();
    }

    @FXML
    private void multiplayerButtonAction(ActionEvent event) {
        makeStartingScreenVisible(false);
        
        otherPlayerTitle.setText("Player 2");
        setUpPlayer1();
        setUpPlayer2();
        makeTablesVisible(true);
        player1RollButton.setVisible(true);
        makeDiceWhite();
        makeDiceVisible(true);
        disableAllScoreButtons();
    }

    @FXML
    private void quitButtonAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void player1RollClick(ActionEvent event) {
        
        setPlayerDiceToButtons(player1Roll);
        
        checkPlayer1Scores();
        
        player1RollButton.setVisible(false);
        player1RerollButton.setDisable(false);
        player1RerollButton.setVisible(true);
    }
    
    @FXML
    private void player1RerollClick(ActionEvent event) {
        player1Roll.rerollCurrentDice();
        setPlayerDiceToButtons(player1Roll);
        
        checkPlayer1Scores();
        
        if(player1Roll.getRollCounter() >= 3) {
            player1RerollButton.setDisable(true);
        }
    }
    
    @FXML
    private void otherplayerRollClick(ActionEvent event) {
        
        setPlayerDiceToButtons(player2Roll);
        
        checkPlayer2Scores();
        
        otherplayerRollButton.setVisible(false);
        otherplayerRerollButton.setDisable(false);
        otherplayerRerollButton.setVisible(true);
    }
    
    @FXML
    private void otherplayerRerollClick(ActionEvent event) {
        player2Roll.rerollCurrentDice();
        setPlayerDiceToButtons(player2Roll);
        
        checkPlayer2Scores();
        
        if(player2Roll.getRollCounter() >= 3) {
            otherplayerRerollButton.setDisable(true);
        }
    }
    
    @FXML
    private void die1Click(ActionEvent event) {
        if(!die1.getStyle().equals("-fx-background-color: gray; ")) {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(0).setIsRollable(false);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(0).setIsRollable(false);
            }
            die1.setStyle("-fx-background-color: gray; ");
        }
        else {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(0).setIsRollable(true);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(0).setIsRollable(true);
            }
            die1.setStyle("-fx-background-color: white;");
        }
    }

    @FXML
    private void die2Click(ActionEvent event) {
        if(!die2.getStyle().equals("-fx-background-color: gray; ")) {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(1).setIsRollable(false);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(1).setIsRollable(false);
            }
            die2.setStyle("-fx-background-color: gray; ");
        }
        else {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(1).setIsRollable(true);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(1).setIsRollable(true);
            }
            die2.setStyle("-fx-background-color: white;");
        }
    }

    @FXML
    private void die3Click(ActionEvent event) {
        if(!die3.getStyle().equals("-fx-background-color: gray; ")) {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(2).setIsRollable(false);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(2).setIsRollable(false);
            }
            die3.setStyle("-fx-background-color: gray; ");
        }
        else {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(2).setIsRollable(true);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(2).setIsRollable(true);
            }
            die3.setStyle("-fx-background-color: white;");
        }
    }

    @FXML
    private void die4Click(ActionEvent event) {
        if(!die4.getStyle().equals("-fx-background-color: gray; ")) {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(3).setIsRollable(false);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(3).setIsRollable(false);
            }
            die4.setStyle("-fx-background-color: gray; ");
        }
        else {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(3).setIsRollable(true);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(3).setIsRollable(true);
            }
            die4.setStyle("-fx-background-color: white;");
        }
    }

    @FXML
    private void die5Click(ActionEvent event) {
        if(!die5.getStyle().equals("-fx-background-color: gray; ")) {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(4).setIsRollable(false);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(4).setIsRollable(false);
            }
            die5.setStyle("-fx-background-color: gray; ");
        }
        else {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(4).setIsRollable(true);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(4).setIsRollable(true);
            }
            die5.setStyle("-fx-background-color: white;");
        }
    }

    @FXML
    private void die6Click(ActionEvent event) {
        if(!die6.getStyle().equals("-fx-background-color: gray; ")) {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(5).setIsRollable(false);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(5).setIsRollable(false);
            }
            die6.setStyle("-fx-background-color: gray; ");
        }
        else {
            if(turnCounter % 2 != 0) {
                player1Roll.getDice().get(5).setIsRollable(true);
            }
            if(turnCounter % 2 == 0) {
                player2Roll.getDice().get(5).setIsRollable(true);
            }
            die6.setStyle("-fx-background-color: white;");
        }
    }
    
    
    
    @FXML
    private void player1scoreONESButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.ONES);
        
        player1scoreONES.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreONESLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreTWOSButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.TWOS);
        
        player1scoreTWOS.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreTWOSLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreTHREESButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.THREES);
        
        player1scoreTHREES.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreTHREESLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreFOURSButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.FOURS);
        
        player1scoreFOURS.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreFOURSLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreFIVESButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.FIVES);
        
        player1scoreFIVES.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreFIVESLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreSIXESButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.SIXES);
        
        player1scoreSIXES.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreSIXESLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreTHREEOFAKINDButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.THREE_OF_A_KIND);
        
        player1scoreTHREEOFAKIND.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreTHREEOFAKINDLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreFOUROFAKINDButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.FOUR_OF_A_KIND);
        
        player1scoreFOUROFAKIND.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreFOUROFAKINDLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreFULLHOUSEButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.FULL_HOUSE);
        
        player1scoreFULLHOUSE.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreFULLHOUSELabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreSMALLSTRAIGHTButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.SMALL_STRAIGHT);
        
        player1scoreSMALLSTRAIGHT.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreSMALLSTRAIGHTLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreLARGESTRAIGHTButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.LARGE_STRAIGHT);
        
        player1scoreLARGESTRAIGHT.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreLARGESTRAIGHTLabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreCHANCEButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.CHANCE);
        
        player1scoreCHANCE.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreCHANCELabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void player1scoreYAHTZEEButton(ActionEvent event) {
        player1Scorer.scoreRoll(player1, player1Roll, scoreType.YAHTZEE);
        
        player1scoreYAHTZEE.setVisible(false);
        
        String valueAsString = String.valueOf(player1Roll.getScore());
        player1scoreYAHTZEELabel.setText(valueAsString);
        
        setupSwitchTurnsPlayer1();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreONESButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.ONES);
        
        otherplayerscoreONES.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreONESLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreTWOSButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.TWOS);
        
        otherplayerscoreTWOS.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreTWOSLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreTHREESButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.THREES);
        
        otherplayerscoreTHREES.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreTHREESLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreFOURSButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.FOURS);
        
        otherplayerscoreFOURS.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreFOURSLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreFIVESButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.FIVES);
        
        otherplayerscoreFIVES.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreFIVESLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreSIXESButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.SIXES);
        
        otherplayerscoreSIXES.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreSIXESLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreTHREEOFAKINDButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.THREE_OF_A_KIND);
        
        otherplayerscoreTHREEOFAKIND.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreTHREEOFAKINDLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreFOUROFAKINDButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.FOUR_OF_A_KIND);
        
        otherplayerscoreFOUROFAKIND.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreFOUROFAKINDLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreFULLHOUSEButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.FULL_HOUSE);
        
        otherplayerscoreFULLHOUSE.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreFULLHOUSELabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreSMALLSTRAIGHTButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.SMALL_STRAIGHT);
        
        otherplayerscoreSMALLSTRAIGHT.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreSMALLSTRAIGHTLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreLARGESTRAIGHTButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.LARGE_STRAIGHT);
        
        otherplayerscoreLARGESTRAIGHT.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreLARGESTRAIGHTLabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreCHANCEButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.CHANCE);
        
        otherplayerscoreCHANCE.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreCHANCELabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }

    @FXML
    private void otherplayerscoreYAHTZEEButton(ActionEvent event) {
        player2Scorer.scoreRoll(player2, player2Roll, scoreType.YAHTZEE);
        
        otherplayerscoreYAHTZEE.setVisible(false);
        
        String valueAsString = String.valueOf(player2Roll.getScore());
        otherplayerscoreYAHTZEELabel.setText(valueAsString);
        
        setupSwitchTurnsOtherPlayer();
        turnCounter++;
        gameOver();
    }
    
    
    
    
    private void makeStartingScreenVisible(boolean flag) {
        infoText.setVisible(flag);
        singlePlayerButtonClick.setVisible(flag);
        multiplayerButtonClick.setVisible(flag);
        quitButtonClick.setVisible(flag);
    }
    
    private void setUpPlayer1() {
        player1 = new Player("Player 1");
        player1Scorer = new RollScoring();
        newPlayer1RollAndRollScorer();
    }
    
    private void newPlayer1RollAndRollScorer() {
        player1Roll = new Roll();
        player1.setCurrentRoll(player1Roll);
    }
    
    private void setUpPlayer2() {
        player2 = new Player("Player 2");
        player2Scorer = new RollScoring();
        newPlayer2RollAndRollScorer();
    }
    
    private void newPlayer2RollAndRollScorer() {
        player2Roll = new Roll();
        player2.setCurrentRoll(player1Roll);
    }
    
    private void setUpComputer() {
        computer = new Computer();
        computerScorer = new RollScoring();
        newComputerRollAndRollScorer();
    }
    
    private void newComputerRollAndRollScorer() {
        computerRoll = new Roll();
        computer.setCurrentRoll(player1Roll);
    }
    
    private void makeTablesVisible(boolean flag) {
        
        otherPlayerTitle.setVisible(flag);
        otherPlayerones.setVisible(flag);
        otherPlayertwos.setVisible(flag);
        otherPlayerthrees.setVisible(flag);
        otherPlayerfours.setVisible(flag);
        otherPlayerfives.setVisible(flag);
        otherPlayersixes.setVisible(flag);
        otherPlayerthreeofakind.setVisible(flag);
        otherPlayerfourofakind.setVisible(flag);
        otherPlayerfullhouse.setVisible(flag);
        otherPlayersmallstraight.setVisible(flag);
        otherPlayerlargestraight.setVisible(flag);
        otherPlayerchance.setVisible(flag);
        otherPlayeryahtzee.setVisible(flag);
        otherPlayertotal.setVisible(flag);
        otherPlayergrid3.setVisible(flag);
        otherPlayergrid1.setVisible(flag);
        otherPlayergrid17.setVisible(flag);
        otherPlayergrid2.setVisible(flag);
        otherPlayergrid4.setVisible(flag);
        otherPlayergrid5.setVisible(flag);
        otherPlayergrid9.setVisible(flag);
        otherPlayergrid8.setVisible(flag);
        otherPlayergrid6.setVisible(flag);
        otherPlayergrid7.setVisible(flag);
        otherPlayergrid10.setVisible(flag);
        otherPlayergrid11.setVisible(flag);
        otherPlayergrid12.setVisible(flag);
        otherPlayergrid13.setVisible(flag);
        otherPlayergrid15.setVisible(flag);
        otherPlayergrid14.setVisible(flag);
        otherPlayergrid16.setVisible(flag);
        
        player1Title.setVisible(flag);
        player1ones.setVisible(flag);
        player1twos.setVisible(flag);
        player1threes.setVisible(flag);
        player1fours.setVisible(flag);
        player1fives.setVisible(flag);
        player1sixes.setVisible(flag);
        player1threeofakind.setVisible(flag);
        player1fourofakind.setVisible(flag);
        player1fullhouse.setVisible(flag);
        player1smallstraight.setVisible(flag);
        player1largestraight.setVisible(flag);
        player1chance.setVisible(flag);
        player1yahtzee.setVisible(flag);
        player1total.setVisible(flag);
        player1grid3.setVisible(flag);
        player1grid1.setVisible(flag);
        player1grid17.setVisible(flag);
        player1grid2.setVisible(flag);
        player1grid4.setVisible(flag);
        player1grid5.setVisible(flag);
        player1grid9.setVisible(flag);
        player1grid8.setVisible(flag);
        player1grid6.setVisible(flag);
        player1grid7.setVisible(flag);
        player1grid10.setVisible(flag);
        player1grid11.setVisible(flag);
        player1grid12.setVisible(flag);
        player1grid13.setVisible(flag);
        player1grid15.setVisible(flag);
        player1grid14.setVisible(flag);
        player1grid16.setVisible(flag);
    }
    
    private void makePlayer1TableButtonsVisible(boolean flag) {
        player1scoreONES.setVisible(flag);
        player1scoreTWOS.setVisible(flag);
        player1scoreTHREES.setVisible(flag);
        player1scoreFOURS.setVisible(flag);
        player1scoreFIVES.setVisible(flag);
        player1scoreSIXES.setVisible(flag);
        player1scoreTHREEOFAKIND.setVisible(flag);
        player1scoreFOUROFAKIND.setVisible(flag);
        player1scoreFULLHOUSE.setVisible(flag);
        player1scoreSMALLSTRAIGHT.setVisible(flag);
        player1scoreLARGESTRAIGHT.setVisible(flag);
        player1scoreCHANCE.setVisible(flag);
        player1scoreYAHTZEE.setVisible(flag);
        player1RollButton.setVisible(flag);
    }
    
    private void makeOtherPlayerTableButtonsVisible(boolean flag) {
        otherplayerscoreONES.setVisible(flag);
        otherplayerscoreTWOS.setVisible(flag);
        otherplayerscoreTHREES.setVisible(flag);
        otherplayerscoreFOURS.setVisible(flag);
        otherplayerscoreFIVES.setVisible(flag);
        otherplayerscoreSIXES.setVisible(flag);
        otherplayerscoreTHREEOFAKIND.setVisible(flag);
        otherplayerscoreFOUROFAKIND.setVisible(flag);
        otherplayerscoreFULLHOUSE.setVisible(flag);
        otherplayerscoreSMALLSTRAIGHT.setVisible(flag);
        otherplayerscoreLARGESTRAIGHT.setVisible(flag);
        otherplayerscoreCHANCE.setVisible(flag);
        otherplayerscoreYAHTZEE.setVisible(flag);
        otherplayerRollButton.setVisible(flag);
    }
    
    private void makeDiceWhite() {
        //this should be in CSS for sure, I should just make a styleshet...
        die1.setStyle("-fx-background-color: white;");
        die2.setStyle("-fx-background-color: white;");
        die3.setStyle("-fx-background-color: white;");
        die4.setStyle("-fx-background-color: white;");
        die5.setStyle("-fx-background-color: white;");
        die6.setStyle("-fx-background-color: white;");
    }

    private void makeDiceVisible(boolean flag) {
        die1.setVisible(flag);
        die2.setVisible(flag);
        die3.setVisible(flag);
        die4.setVisible(flag);
        die5.setVisible(flag);
        die6.setVisible(flag);
    }
    
    private void  setDie1Text(int value) {
        String valueAsString = String.valueOf(value);
        die1.setText(valueAsString);
    }
    
    private void  setDie2Text(int value) {
        String valueAsString = String.valueOf(value);
        die2.setText(valueAsString);
    }
    
    private void  setDie3Text(int value) {
        String valueAsString = String.valueOf(value);
        die3.setText(valueAsString);
    }
    
    private void  setDie4Text(int value) {
        String valueAsString = String.valueOf(value);
        die4.setText(valueAsString);
    }
    
    private void  setDie5Text(int value) {
        String valueAsString = String.valueOf(value);
        die5.setText(valueAsString);
    }
    
    private void  setDie6Text(int value) {
        String valueAsString = String.valueOf(value);
        die6.setText(valueAsString);
    }
    
    private void disableAllScoreButtons() {
        player1scoreONES.setDisable(true);
        player1scoreTWOS.setDisable(true);
        player1scoreTHREES.setDisable(true);
        player1scoreFOURS.setDisable(true);
        player1scoreFIVES.setDisable(true);
        player1scoreSIXES.setDisable(true);
        player1scoreTHREEOFAKIND.setDisable(true);
        player1scoreFOUROFAKIND.setDisable(true);
        player1scoreFULLHOUSE.setDisable(true);
        player1scoreSMALLSTRAIGHT.setDisable(true);
        player1scoreLARGESTRAIGHT.setDisable(true);
        player1scoreCHANCE.setDisable(true);
        player1scoreYAHTZEE.setDisable(true);
        otherplayerscoreONES.setDisable(true);
        otherplayerscoreTWOS.setDisable(true);
        otherplayerscoreTHREES.setDisable(true);
        otherplayerscoreFOURS.setDisable(true);
        otherplayerscoreFIVES.setDisable(true);
        otherplayerscoreSIXES.setDisable(true);
        otherplayerscoreTHREEOFAKIND.setDisable(true);
        otherplayerscoreFOUROFAKIND.setDisable(true);
        otherplayerscoreFULLHOUSE.setDisable(true);
        otherplayerscoreSMALLSTRAIGHT.setDisable(true);
        otherplayerscoreLARGESTRAIGHT.setDisable(true);
        otherplayerscoreCHANCE.setDisable(true);
        otherplayerscoreYAHTZEE.setDisable(true);
    }
    
    private void setPlayerDiceToButtons(Roll roll) {
        setDie1Text(roll.getDice().get(0).getValue());
        setDie2Text(roll.getDice().get(1).getValue());
        setDie3Text(roll.getDice().get(2).getValue());
        setDie4Text(roll.getDice().get(3).getValue());
        setDie5Text(roll.getDice().get(4).getValue());
        setDie6Text(roll.getDice().get(5).getValue());
    }
    
    private void setupSwitchTurnsPlayer1() {
        player1RerollButton.setVisible(false);
        otherplayerRollButton.setVisible(true);
        makePlayer1TableButtonsVisible(false);
        player1RollButton.setVisible(false);
        otherplayerRollButton.setVisible(true);
        
        newPlayer2RollAndRollScorer();
        
        enableAllDice();
        makeDiceWhite();
    }
    
    private void setupSwitchTurnsOtherPlayer() {
        otherplayerRerollButton.setVisible(false);
        player1RollButton.setVisible(true);
        makeOtherPlayerTableButtonsVisible(false);
        otherplayerRollButton.setVisible(false);
        player1RollButton.setVisible(true);
        
        newPlayer1RollAndRollScorer();
        
        enableAllDice();
        makeDiceWhite();
    }
    
    private void checkPlayer1Scores() {
        Set<scoreType> possibleScoreTypes = null;
        player1Scorer.setPossibleScoreTypes(player1, player1Roll);
        possibleScoreTypes = player1Scorer.getPoissibleScoreTypes().keySet();
        
        if(possibleScoreTypes.contains(scoreType.ONES)) {
            player1scoreONES.setVisible(true);
            player1scoreONES.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.TWOS)) {
            player1scoreTWOS.setVisible(true);
            player1scoreTWOS.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.THREES)) {
            player1scoreTHREES.setVisible(true);
            player1scoreTHREES.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.FOURS)) {
            player1scoreFOURS.setVisible(true);
            player1scoreFOURS.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.FIVES)) {
            player1scoreFIVES.setVisible(true);
            player1scoreFIVES.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.SIXES)) {
            player1scoreSIXES.setVisible(true);
            player1scoreSIXES.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.THREE_OF_A_KIND)) {
            player1scoreTHREEOFAKIND.setVisible(true);
            player1scoreTHREEOFAKIND.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.FOUR_OF_A_KIND)) {
            player1scoreFOUROFAKIND.setVisible(true);
            player1scoreFOUROFAKIND.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.FULL_HOUSE)) {
            player1scoreFULLHOUSE.setVisible(true);
            player1scoreFULLHOUSE.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.SMALL_STRAIGHT)) {
            player1scoreSMALLSTRAIGHT.setVisible(true);
            player1scoreSMALLSTRAIGHT.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.LARGE_STRAIGHT)) {
            player1scoreLARGESTRAIGHT.setVisible(true);
            player1scoreLARGESTRAIGHT.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.CHANCE)) {
            player1scoreCHANCE.setVisible(true);
            player1scoreCHANCE.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.YAHTZEE)) {
            player1scoreYAHTZEE.setVisible(true);
            player1scoreYAHTZEE.setDisable(false);
        }
    }
    
    private void checkPlayer2Scores() {
        Set<scoreType> possibleScoreTypes = null;
        player2Scorer.setPossibleScoreTypes(player2, player2Roll);
        possibleScoreTypes = player2Scorer.getPoissibleScoreTypes().keySet();
        
        if(possibleScoreTypes.contains(scoreType.ONES)) {
            otherplayerscoreONES.setVisible(true);
            otherplayerscoreONES.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.TWOS)) {
            otherplayerscoreTWOS.setVisible(true);
            otherplayerscoreTWOS.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.THREES)) {
            otherplayerscoreTHREES.setVisible(true);
            otherplayerscoreTHREES.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.FOURS)) {
            otherplayerscoreFOURS.setVisible(true);
            otherplayerscoreFOURS.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.FIVES)) {
            otherplayerscoreFIVES.setVisible(true);
            otherplayerscoreFIVES.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.SIXES)) {
            otherplayerscoreSIXES.setVisible(true);
            otherplayerscoreSIXES.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.THREE_OF_A_KIND)) {
            otherplayerscoreTHREEOFAKIND.setVisible(true);
            otherplayerscoreTHREEOFAKIND.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.FOUR_OF_A_KIND)) {
            otherplayerscoreFOUROFAKIND.setVisible(true);
            otherplayerscoreFOUROFAKIND.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.FULL_HOUSE)) {
            otherplayerscoreFULLHOUSE.setVisible(true);
            otherplayerscoreFULLHOUSE.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.SMALL_STRAIGHT)) {
            otherplayerscoreSMALLSTRAIGHT.setVisible(true);
            otherplayerscoreSMALLSTRAIGHT.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.LARGE_STRAIGHT)) {
            otherplayerscoreLARGESTRAIGHT.setVisible(true);
            otherplayerscoreLARGESTRAIGHT.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.CHANCE)) {
            otherplayerscoreCHANCE.setVisible(true);
            otherplayerscoreCHANCE.setDisable(false);
        }
        if(possibleScoreTypes.contains(scoreType.YAHTZEE)) {
            otherplayerscoreYAHTZEE.setVisible(true);
            otherplayerscoreYAHTZEE.setDisable(false);
        }
    }
    
    private void enableAllDice() {
        die1.setDisable(false);
        die2.setDisable(false);
        die3.setDisable(false);
        die4.setDisable(false);
        die5.setDisable(false);
        die6.setDisable(false);
    }
    
    private void gameOver() {
        if(turnCounter == 27) {
            makeDiceVisible(false);
            player1RollButton.setVisible(false);
            scorePlayersCards();
        }
    }
    
    private void scorePlayersCards() {
        int player1Score = player1.sumUpScoreCard();
        int player2Score = player2.sumUpScoreCard();

        String player1ScoreAsString = String.valueOf(player1Score);
        String player2ScoreAsString = String.valueOf(player2Score);

        player1TotalScoreLabel.setText(player1ScoreAsString);
        otherplayerTotalScoreLabel.setText(player2ScoreAsString);

        if(player1Score > player2Score) {
            winLabel.setText(player1 + " wins");
            winLabel.setVisible(true);
            player1TotalScoreLabel.setStyle("-fx-background-color: yellow; ");
        }
        else if(player2Score > player1Score) {
            winLabel.setText(player2 + " wins");
            winLabel.setVisible(true);
            otherplayerTotalScoreLabel.setStyle("-fx-background-color: yellow; ");
        }
        else {
            winLabel.setText("It's a draw!");
            winLabel.setVisible(true);
            player1TotalScoreLabel.setStyle("-fx-background-color: blue; ");
            otherplayerTotalScoreLabel.setStyle("-fx-background-color: blue; ");
        }  
    }

}
