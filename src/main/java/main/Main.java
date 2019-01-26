package main;

import location.model.Location;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Location location = new Location(
                1,
                "Łódź",
                "90-404",
                "Pomorska",
                "30");

        Task task = new Task(1,"Instalacja","Instalacja sprzętu u klienta", "null", Status.OPEN,
                false, LocalDate.now(),null,null, Priority.LOW,location,)
    }
}
