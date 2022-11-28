package ru.gb.oseminar.controller;


import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.StudentService;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.view.StudyGroupView;

import java.util.List;

public class UserController {
    private StudyGroupService studyGroupService = new StudyGroupService();
    private StudentService studentService;
    private StudyGroupView studyGroupView;
    public List<Student> testInit() {
        studentService = new StudentService();
        studentService.createUser(
                "ExampleFirstName1",
                "ExampleSecondName1",
                "ExamplePatronymic1"
        );
        studentService.createUser(
                "ExampleFirstName2",
                "ExampleSecondName2",
                "ExamplePatronymic2"
        );
        studentService.createUser(
                "ExampleFirstName3",
                "ExampleSecondName3",
                "ExamplePatronymic3"
        );
        return studentService.getStudents();
    }
    public void createGroup(String firstName, String secondName, String patronymic){

        studyGroupView = new StudyGroupView();
        studyGroupService.createStudyGroup(new Teacher(firstName, secondName, patronymic), testInit());
        studyGroupView.sendOnConsole(studyGroupService.getStudyGroups());
    }

}
