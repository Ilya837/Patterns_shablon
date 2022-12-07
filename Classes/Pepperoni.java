package com.shablon.Classes;

public class Pepperoni extends Pizza {

    @Override
    protected void CreateDough(){
        System.out.println("Месим тесто из 250 гр муки, 120 мл воды," +
                " 10 гр дрожжей, 1 с.л. растительного масла, 1 гр сахара" +
                " и 1 гр соли");
    }

    @Override
    protected void CreateSauce(){
       System.out.println( "Готовим соус из 1 помидора, 1 с.л. оливкового масла, " +
                "1 с.л. кетчупа, 1 ч.л. томатной пасты, 2 зубчиков чеснока, " +
               "5 гр трав, 1/4 ч.л. паприки, 1 гр чили и соли по вкусу ");
    }

    @Override
    protected void Filling(){
        System.out.println("Выкладываем на пиццу 120 гр морцепана и 100 гр пеперони");
    }
}
