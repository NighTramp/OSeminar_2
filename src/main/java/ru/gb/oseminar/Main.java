package ru.gb.oseminar;

import ru.gb.oseminar.controller.UserController;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.DataService;
import ru.gb.oseminar.service.StudyGroupService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        UserController userController = new UserController();
//        userController.createStudent(
//                "ExampleFirstName",
//                "ExampleSecondName",
//                "ExamplePatronymic"
//        );

        StudyGroupService service = new StudyGroupService();
        DataService dataService = new DataService();
        dataService.create(
                "ExampleFirstName",
                "ExampleSecondName",
                "ExamplePatronymic"
        );
        service.createStudyGroup(new Teacher("Иванов","Иван","Иванович"), (List<Student>)dataService.getAll());
    }
}