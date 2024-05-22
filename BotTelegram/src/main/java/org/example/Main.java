package org.example;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);

        try{
            botsApi.registerBot(new Bot());
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
        System.out.println("Bot successfully starts.");

    }
}