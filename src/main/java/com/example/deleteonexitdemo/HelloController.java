package com.example.deleteonexitdemo;

import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Text txtMon;
    public boolean testFolder;
    public String path;

    public void makeDir() {

        String foldername = "tested";
        path = "C:\\Users\\james.keogh\\AppData\\Roaming\\DLCSPM\\" + foldername;
        testFolder = new File(path).mkdir();
        txtMon.setVisible(true);
        txtMon.setText("Folder made");
    }


    public void deleteDir() {
        String userName = System.getenv("APPDATA");
        String foldername = "tested";
        String endPath = "\\DLCSPM\\" + foldername;
        String fullpath = userName + endPath;

        File togo = new File(fullpath);

        togo.deleteOnExit();
        txtMon.setVisible(true);
        txtMon.setText("Folder will delete on exit");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtMon.setVisible(false);
    }
}