package test;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable{

    @FXML private TableView<Jobs> tableView;
    @FXML private TableColumn<Jobs, Integer> JobColumn;
    @FXML private TableColumn<Jobs, String> StatusColumn;
    @FXML private TableColumn<Jobs, String> NotesColumn;
    @FXML private TableColumn<Jobs, String> ClientColumn;
    @FXML private TableColumn<Jobs, LocalDate> CreationColumn;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL url, ResourceBundle rBundle) {
        JobColumn.setCellValueFactory(new PropertyValueFactory<Jobs, Integer>("Job"));
        StatusColumn.setCellValueFactory(new PropertyValueFactory<Jobs, String>("Status"));
        NotesColumn.setCellValueFactory(new PropertyValueFactory<Jobs, String>("Notes"));
        ClientColumn.setCellValueFactory(new PropertyValueFactory<Jobs, String>("Client"));
        CreationColumn.setCellValueFactory(new PropertyValueFactory<Jobs, LocalDate>("Creation"));
        
        tableView.setItems(getJobs());
    }

    public ObservableList<Jobs>  getJobs(){
        ObservableList<Jobs> jobs = FXCollections.observableArrayList();
        jobs.add(new Jobs(1,"Completed","No notes","William Tang", LocalDate.of(2022, Month.JANUARY, 19)));
        jobs.add(new Jobs(2,"Completed","No notes","Jim Tang", LocalDate.of(2022, Month.FEBRUARY, 21)));
        jobs.add(new Jobs(3,"Active","Client wants completed ASAP","William Tang", LocalDate.of(2022, Month.JANUARY, 19)));
        jobs.add(new Jobs(4,"To Priced","No notes","Bob Tim", LocalDate.of(2022, Month.JANUARY, 19)));
        jobs.add(new Jobs(5,"Invoicing","No notes","Wok Tang", LocalDate.of(2022, Month.JANUARY, 19)));
        jobs.add(new Jobs(6,"Active","Client is on vaccation, not urgent","Jason Seid", LocalDate.of(2022, Month.JANUARY, 19)));
        return jobs;
    }


}
