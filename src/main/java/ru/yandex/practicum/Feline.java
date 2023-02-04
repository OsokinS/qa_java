package ru.yandex.practicum;

import java.util.List;

public class Feline extends Animal implements Predator {

 //   private Integer kittensCount;

  //  public Feline (Integer kittensCount){
  //      this.kittensCount = kittensCount;
   // }


    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
