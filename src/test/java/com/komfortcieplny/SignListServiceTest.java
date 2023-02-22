package com.komfortcieplny;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignListServiceTest {

    @Test
    @DisplayName("Should return warning when inputed text is empty")
    void shouldReturnWarningWhenInputedTextIsEmpty() {
        String inputText = "";
        String expectedResult = "Inputed text was empty!";
        assertEquals(expectedResult, SignListService.checkInputText(inputText));
    }

    @Test
    @DisplayName("Should return X3")
    void shouldReturnX3() {
        String inputText = "XXX";
        String expectedResult = "X3";
        assertEquals(expectedResult, SignListService.checkInputText(inputText));
    }

    @Test
    @DisplayName("Should return B1O3M5")
    void shouldReturnB1O3M5() {
        String inputText = "BOOOMMMMM";
        String expectedResult = "B1O3M5";
        assertEquals(expectedResult, SignListService.checkInputText(inputText));
    }
}