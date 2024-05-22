package org.example;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.net.MalformedURLException;
import java.util.Map;

public class TestClass {
    public static void main(String[] args) throws MalformedURLException {
        for (Map.Entry<String, String> entry : Availability.Boxes().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
