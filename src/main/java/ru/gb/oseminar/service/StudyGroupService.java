package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService implements StudyGroupServiceInterface{
    List<StudyGroup> studyGroups;

    public StudyGroupService() {
        this.studyGroups = new ArrayList<>();
    }

    @Override
    public void createStudyGroup(Teacher teacher, List<Student> studentList) {
        this.studyGroups.add(new StudyGroup(teacher, studentList));
    }

    @Override
    public List<StudyGroup> getStudyGroups() {
        return this.studyGroups;
    }
}
