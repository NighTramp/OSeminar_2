package ru.gb.oseminar.util;

import org.junit.jupiter.api.Test;
import ru.gb.oseminar.service.DataService;

import java.time.LocalDate;

class WriterToTxtTest {

    @Test
    void writeTestSuccessfully() {
        DataService dataService = new DataService();
        dataService.create(
                "First Name",
                "Second Name",
                "Patronymic",
                LocalDate.now()
        );
    }
}