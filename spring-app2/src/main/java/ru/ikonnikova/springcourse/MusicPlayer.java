package ru.ikonnikova.springcourse;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
   //поле-зависимость - интерфейс Music
   private Music music;

    public MusicPlayer(Music music) {
        //присваиваем полю music то,
        // что было внедрено в нашу сущность
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing:" + music.getSong());

    }
}
