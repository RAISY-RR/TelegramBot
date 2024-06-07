package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
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
        

        switch (msg.getText()){
            case "/start":
                sendText(id, "Я Бот который уточняет кол-во продукции в наличии и их состав.\n" +
                        "\n" +
                        "Команды для управления мной:\n" +
                        "/availableBoxes - подарочные коробки (по наличию).\n" +
                        "/pastille - вкусы пастилы (по наличию).\n" +
                        "/fruitFrips - фрипсы (по наличию).\n" +
                        "/zefir - виды, фкусы зефира (по наличию).\n " +
                        "\nДля оформления заказа пишите @Elina_Avanesova");
                break;
            case "/availableBoxes":
                sendText(id, "Наборы в коробках: \n");
                for(Map.Entry<String, String> entry: availability.Boxes().entrySet()) {
                    try {
                        sendPhoto(chatId, entry.getValue(), entry.getKey());
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                break;
            case "/pastille":
                String l = availability.Pastille().get("1");
                sendText(id, l);
                break;
            case "/fruitFrips":
                String d = availability.FruitFrips().get("1");
                sendText(id, d);
                break;
            case"/zefir":
                String k = availability.Zefir().get("1");
                sendText(id, k);
                break;
            default:
                sendText(id, "Неправильно введена команда, повторите ввод!(/start)");
                break;
            }
        }


    // outputs text
    public void sendText(Long who, String str){
        SendMessage sendMessage = SendMessage.builder().
                chatId(who.toString()).text(str).build();
        try{
            execute(sendMessage);
        } catch(TelegramApiException e){
            e.printStackTrace();
        }
    }

    //method output photo in bot
    public void sendPhoto(Long chatId, String photo, String imageCaption) throws TelegramApiException{
        SendPhoto sendphoto = new SendPhoto();
        sendphoto.setChatId(chatId.toString());
        sendphoto.setPhoto(new InputFile(photo));
        sendphoto.setCaption(imageCaption);
        execute(sendphoto);
    }


}
