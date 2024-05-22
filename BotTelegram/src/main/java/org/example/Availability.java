package org.example;

import org.telegram.telegrambots.meta.api.objects.InputFile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class Availability {
    public HashMap<String, String> Boxes(){
        HashMap<String, String> boxes = new HashMap<>();

        boxes.put("Зефир: Состав: зефирные цветы, завитки, мини розочки.\nЦена: от 800р.\n",
                "https://username.github.io/cf194694324821a5eec6e0223a4473770e006758/BotTelegram/src/photo/zefirka.JPG");
        boxes.put("Пастила: Состав: пастила(разных вкусов) и йогуртовая\nЦена: 350р.\n", "" );
        boxes.put("Конфеты: Состав: конфеты (разных видов). Кол-во: 4, 8, 12. \n Цена: 250р, 400р, 550р.\n", "");
        boxes.put("Фрипсы: Состав: ассорти фрипсов(разных вкусов). 100гр. \n Цена: 450р.\n", "");

        return boxes;
    }

    public HashMap<String, String> Pstille() {
        HashMap<String, String> pastille = new HashMap<>();
        pastille.put("1", "Клубничная, мандариновая, яблочная, апельсиновая, йогуртовая");

        return  pastille;
    }
    public HashMap<String, String> FruitFrips() {
        HashMap<String, String> fruitFrips = new HashMap<>();
        fruitFrips.put("1", "Яблоко, ананас, апельсин, мандарин, груша, яблохо-орехи, ");
        return fruitFrips;
    }
    public HashMap<String, String> Zefir() {
        HashMap<String, String> zefir = new HashMap<>();
        zefir.put("1", "тюльпан, завиток, и др ");
        return zefir;
    }

}
