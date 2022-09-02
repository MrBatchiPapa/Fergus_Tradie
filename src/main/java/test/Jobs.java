package test;

import java.time.LocalDate;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Jobs {
    private SimpleIntegerProperty Job;
    private SimpleStringProperty Status, Notes, Client;
    private LocalDate Creation;

    public Jobs(Integer Job, String Status, String Notes, String Client, LocalDate Creation){
        this.Job = new SimpleIntegerProperty(Job);
        this.Status = new SimpleStringProperty(Status);
        this.Notes = new SimpleStringProperty(Notes);
        this.Client = new SimpleStringProperty(Client);
        this.Creation = Creation;
    }

    public Integer getJob(){
        return Job.get();
    }

    public void setJob(SimpleIntegerProperty Job){
        this.Job = Job;
    }

    public String getStatus(){
        return Status.get();
    }

    public void setStatus(SimpleStringProperty Status){
        this.Status = Status;
    }

    public String getNotes(){
        return Notes.get();
    }

    public void setNotes(SimpleStringProperty Notes){
        this.Notes = Notes;
    }

    public String getClient(){
        return Client.get();
    }

    public void setClient(SimpleStringProperty Client){
        this.Client = Client;
    }

    public LocalDate getCreation(){
        return Creation;
    }

    public void setCreation(LocalDate Creation){
        this.Creation = Creation;
    }

}
