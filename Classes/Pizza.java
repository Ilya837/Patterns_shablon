package com.shablon.Classes;

public abstract class Pizza {
    protected void CreateDough() {
        System.out.println("Месим тесто из 300г муки, 1 ч.л. соли," +
                " 1 ч.л. дрожжей, 1 столовой ложки оливкового масла и " +
                "200 мл воды");
    }

    protected void CreateForm() {
        System.out.println("Делаем из теста круг");
    }

    protected void CreateSauce() {
        System.out.println("готовим соус из 100 мл томат. пасты, одной ч.л. базилика и" +
                " одного измельчённого зубчика чеснока");
    }

    protected void UseSauce() {
        System.out.println("Размазываем соус по пицце");
    }

    protected void Filling() {
        System.out.println("Добавляем на пиццу 250 г сыра моцарелла и " +
                "разрезанные пополам черри ");
    }

    protected void Bake() {
        System.out.println("Выпекаем пиццу в духовке 8-10 минут при 220-240 градусах");
    }

    public final void PizzaCooking() {
        CreateDough();
        CreateForm();
        CreateSauce();
        UseSauce();
        Filling();
        Bake();
        System.out.println("Пицца готова");
    }
}
