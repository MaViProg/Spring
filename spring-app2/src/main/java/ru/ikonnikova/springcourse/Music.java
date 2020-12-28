package ru.ikonnikova.springcourse;

public interface Music {
    //все жанры музыки обязаны иметь метод getSong(),
    // кот. возвращает одну песню,
    // кот. явл. песней в этом жанре
  String getSong();

}
