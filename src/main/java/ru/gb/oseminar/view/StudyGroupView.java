package ru.gb.oseminar.view;

import ru.gb.oseminar.data.StudyGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudyGroupView {
    public void sendOnConsole(List<StudyGroup> studyGroups) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info("Group List:\n");
        studyGroups.forEach(group -> logger.info(group.toString()));
    }
}
