
package internetcafe;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;


public class DashboardController implements Initializable {

    @FXML
    private FontAwesomeIconView addComp;
    @FXML
    private TabPane mainTab;
    @FXML
    private Button btnsession;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addCompPage(MouseEvent event) {
        mainTab.getSelectionModel().select(2);
    }

    @FXML
    private void startSession(MouseEvent event) {
        
    }
    
}
