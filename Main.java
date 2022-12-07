package com.shablon;

import com.shablon.Classes.Morgarita;
import com.shablon.Classes.Pepperoni;
import com.shablon.Classes.Pizza;

public class Main {
    public static void main(String[] args)
    {
        Pizza pep = new Pepperoni();
        pep.PizzaCooking();

        System.out.println("\n");
        Pizza Mar = new Morgarita();
        Mar.PizzaCooking();
    }
}