package com.example.lesson1.ui;


import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.lesson1.data.Card;
import com.example.lesson1.data.Game;

import java.util.List;

public class EmojiGame {

    private Game<String> game;

    @RequiresApi(api = Build.VERSION_CODES.R)
    public EmojiGame(){
        List<String> content = List.of("\uD83E\uDD2A", "\uD83D\uDE02", "\uD83D\uDE18", "\uD83D\uDE21", "\uD83D\uDC8B");
        game = new Game<>(content);
    }

    public void choose(Card<String> card){
        game.choose(card);
    }

    public List<Card<String>> getCards() {
        return game.getCards();
    }
}