import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//This is a comment :)
//Clarence edited. 
//wow 
//Hunter Celeste has editted this
// alex edit is the best
//I have overwritten alex's line

//Hey this will work

public class main extends Application{

  public void start(Stage primaryStage) {
    try {
      //Create main window
      HBox root = new HBox(30);
      //Create two sides
      VBox vBox1 = new VBox(51);
      VBox vBox2 = new VBox(7);
      //vBox2's hBoxes
      HBox addAndClear = new HBox(5);
      
      //vBox1 UI controls
      Button makeQuestionButton = new Button("Make Question");
      Button loadQuizButton = new Button("Load Quiz");
      Button takeTestButton = new Button("Take Test");
      Button saveAndQuitButton = new Button("Save and Quit");
      
      //vbox2 UI controls
      
      TextField numQuestionsTextField = new TextField("# of Questions in Quiz");
      
        //Hard-coded list
        //TODO change to getting from questions
      ObservableList<String> comboBoxList = FXCollections.observableArrayList("English",
          "Reading", "Quantum Physics");
      ComboBox<String> loadedTopicsComboBox = new ComboBox<String>(comboBoxList);
      loadedTopicsComboBox.setPromptText("<Select a Topic to add>");
      Label comboBoxLabel = new Label("<Load Questions to have Topics>");
      loadedTopicsComboBox.setPlaceholder(comboBoxLabel);
      
      
        //addAndClear HBox buttons
      Button addTopicButton = new Button("Add Topic");
      Button clearTopicListButton = new Button("Clear Topic List");
      
      Label chosenTopicListLabel = new Label("Chosen Topics:");
      ListView<String> chosenTopicsListView = new ListView<String>();
      chosenTopicsListView.setMaxSize(175, 100);
      Button dontSaveAndQuitButton = new Button("Quit Without Saving");
      
      addAndClear.getChildren().addAll(addTopicButton, clearTopicListButton);
      vBox1.getChildren().addAll(makeQuestionButton, loadQuizButton, takeTestButton, saveAndQuitButton);
      vBox2.getChildren().addAll(numQuestionsTextField, loadedTopicsComboBox, 
          addAndClear, chosenTopicListLabel, chosenTopicsListView, dontSaveAndQuitButton);
      root.getChildren().addAll(vBox1, vBox2);
      
      Scene scene = new Scene(root,350,300);
      //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.setTitle("Quiz Generator");
      primaryStage.show();
      
      
      
      
      
      
    }catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }


  public static void main(String[] args) {
    Application.launch(args);
  }
}