package ru.yandex.practicum;

import lombok.Data;

import java.util.List;


public class Lion {

    private Feline feline;

    boolean hasMane;


  //  Feline feline; //= new Feline();


 //   public Lion(Feline feline, String sex){
 //       this.feline = feline;
 //       this.sex = sex;
 //   }

    public Lion (String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }




    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }



    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
