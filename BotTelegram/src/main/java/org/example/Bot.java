package org.example;



import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;

import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import javax.lang.model.util.Elements;
import javax.swing.text.html.HTMLEditorKit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Bot extends TelegramLongPollingBot {

    private boolean screaming = false;
    Availability availability = new Availability();



    @Override
    public String getBotUsername() {
        return "YaelPastila_bot";
    }

    @Override
    public String getBotToken() {
        return "7139278881:AAHI56MLOY8_G4swQ92vLsg8S-JI6oOzKco";
    }

    @Override
    public void onUpdateReceived(Update update) {
        var msg = update.getMessage();
        var user = msg.getFrom();
        var id = user.getId();
        Long chatId = update.getMessage().getChatId();
        var txt = msg.getText();


        if(msg.isCommand()){
            if (txt.equals("/start")) {
                sendText(id, "Я Бот который уточняет кол-во продукции в наличии и их состав.\n" +
                        "\n" +
                        "Команды для управления мной:\n" +
                        "/availableBoxes - подарочные коробки (по наличию).\n" +
                        "/pastille - вкусы пастилы (по наличию).\n" +
                        "/fruitFrips - фрипсы (по наличию).\n" +
                        "/zefir - виды, фкусы зефира (по наличию).\n " +
                        "\nДля оформления заказа пишите @Elina_Avanesova");
            } else if(txt.equals("/availableBoxes")){

                sendText(id, "Наборы в коробках: \n");
                for(Map.Entry<String, String> entry: availability.Boxes().entrySet()) {
                    try {
                        sendPhoto(chatId, entry.getValue(), entry.getKey());
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else if(txt.equals("/pastille")){
                String l = availability.Pastille().get("1");
                sendText(id, l);
            }
        }
    }

    // Ввыводит текст
    public void sendText(Long who, String str){
        SendMessage sendMessage = SendMessage.builder().
                chatId(who.toString()).text(str).build();
        try{
            execute(sendMessage);
        } catch(TelegramApiException e){
            e.printStackTrace();
        }
    }

    // создает и выводит меню
    public void sendMenu(Long who, String str, InlineKeyboardMarkup kb){
        SendMessage sendMessage = SendMessage.builder().chatId(who.toString())
                .parseMode("HTML").text(str)
                .replyMarkup(kb).build();

        try {
            execute(sendMessage);
        } catch (TelegramApiException e){
            throw new RuntimeException(e);
        }
    }

    public void sendPhoto(Long chatId, String photo, String imageCaption) throws TelegramApiException{

        SendPhoto sendphoto = new SendPhoto();
        sendphoto.setChatId(chatId.toString());
        sendphoto.setPhoto(new InputFile(photo));
        sendphoto.setCaption(imageCaption);

        execute(sendphoto);
    }
}
