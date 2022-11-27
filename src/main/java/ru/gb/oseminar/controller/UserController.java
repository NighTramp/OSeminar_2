package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.DataService;
import ru.gb.oseminar.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController {

    DataService dataService = new DataService();
    UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic){
        dataService.create(firstName, secondName, patronymic);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

}
