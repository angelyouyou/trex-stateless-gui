package com.cisco.trex.stl.gui.controllers.capture;

import com.exalttech.trex.util.Initialization;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import org.controlsfx.control.CheckComboBox;

public class PortFilterController extends HBox {
    
    @FXML
    private CheckComboBox rxFilter;
    
    @FXML
    private CheckComboBox txFilter;

    public PortFilterController() {
        Initialization.initializeFXML(this, "/fxml/pkt_capture/PortFilter.fxml");
    }
}
