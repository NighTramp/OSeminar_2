package ru.gb.oseminar.controller;

import ru.gb.oseminar.service.DataService;

import java.time.LocalDate;

public class Controller {

    DataService dataService = new DataService();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
    }

}
