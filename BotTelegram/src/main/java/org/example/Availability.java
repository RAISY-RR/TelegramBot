package org.example;

import org.telegram.telegrambots.meta.api.objects.InputFile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class Availability {
    public HashMap<String, String> Boxes(){
        HashMap<String, String> boxes = new HashMap<>();


        boxes.put("Зефир: \nСостав: зефирные цветы, завитки, мини розочки.\nЦена: от 800р.\n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/zefirka.JPG?raw=true");
        boxes.put("Пастила: \nСостав: пастила(разных вкусов) и йогуртовая\nЦена: 350р.\n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/pastila.jpg?raw=true" );
        boxes.put("Конфеты: \nСостав: конфеты (разных видов). Кол-во: 4, 8, 12. \nЦена: 250р, 400р, 550р.\n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/konfeta.jpg?raw=true");
        boxes.put("Фрипсы: \nСостав: ассорти фрипсов(разных вкусов). 30гр. \nЦена: 200-250р.\n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/fripsi.jpg?raw=true");
        boxes.put("Муфтики: \nСостав: муфтики(разных вкусов). 1 колбочка.\nЦена: 150р. \n",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/muftiki.jpg?raw=true");
        boxes.put("Флаксы: \nСостав: Льняные флаксы - отличная замена вредным чипсам. 100гр.\nЦена: 200р.",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/flacks.jpg?raw=true");
        boxes.put("Йогуртовая пастила: \nСостав: пастила из йогурта(разных вкусов). 100гр.\nФруктовая-розочки - 300р.\nЙогуртовая - 250р.",
                "https://github.com/RAISY-RR/TelegramBot/blob/main/BotTelegram/src/photo/pastilaFructovai.jpg?raw=true");

        return boxes;
    }

    public HashMap<String, String> Pastille() {
        HashMap<String, String> pastille = new HashMap<>();
        pastille.put("1", "Пастила есть в наличии таких вкусов: клубничная, мандариновая, яблочная, апельсиновая, йогуртовая.");

        return  pastille;
    }
    public HashMap<String, String> FruitFrips() {
        HashMap<String, String> fruitFrips = new HashMap<>();
        fruitFrips.put("1", "Фрипсы есть в наличии таких вкусов: яблоко, ананас, апельсин, мандарин, груша, яблохо-орехи, клубника. ");
        return fruitFrips;
    }
    public HashMap<String, String> Zefir() {
        HashMap<String, String> zefir = new HashMap<>();
        zefir.put("1", "Зефир есть в наличии таких видов: тюльпан, завиток, пионы и другие цветы. \nВкусы: клубничный, апельсиновый, яблочный, ванильный и др.");
        return zefir;
    }


}
