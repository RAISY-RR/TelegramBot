package org.example;

import org.telegram.telegrambots.meta.api.objects.InputFile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class Availability {
    public HashMap<String, String> Boxes(){
        HashMap<String, String> boxes = new HashMap<>();


        boxes.put("Зефир: Состав: зефирные цветы, завитки, мини розочки.\nЦена: от 800р.\n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/zefirka.JPG?raw=true");
        boxes.put("Пастила: Состав: пастила(разных вкусов) и йогуртовая\nЦена: 350р.\n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/pastila.jpg?raw=true" );
        boxes.put("Конфеты: Состав: конфеты (разных видов). Кол-во: 4, 8, 12. \n Цена: 250р, 400р, 550р.\n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/konfeta.jpg?raw=true");
        boxes.put("Фрипсы: Состав: ассорти фрипсов(разных вкусов). 30гр. \n Цена: 200-250р.\n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/fripsi.jpg?raw=true");
        boxes.put("Муфтики: Состав: муфтики(разных вкусов). 1 колбочка.\n Цена: 150р. \n",
                "");

        return boxes;
    }

    public HashMap<String, String> Pastille() {
        HashMap<String, String> pastille = new HashMap<>();
        pastille.put("1", "Клубничная, мандариновая, яблочная, апельсиновая, йогуртовая, ");

        return  pastille;
    }
    public HashMap<String, String> FruitFrips() {
        HashMap<String, String> fruitFrips = new HashMap<>();
        fruitFrips.put("1", "Яблоко, ананас, апельсин, мандарин, груша, яблохо-орехи, клубника. ");
        return fruitFrips;
    }
    public HashMap<String, String> Zefir() {
        HashMap<String, String> zefir = new HashMap<>();
        zefir.put("1", "тюльпан, завиток, пионы и другие цветы. ");
        return zefir;
    }


}
