package Autimobile;

public class Run {
    public static void main(String[] args) {
        Automobile lada = new Automobile("Lada", "Granta",1.7f, "Желтый", 2015, "Россия");
        Automobile audi = new Automobile("Audi", "A8 50 L TDI quattro", 3.0f, "Черный", 2020, "Германия");
        Automobile bmw = new Automobile("BMW","Z8",3.0f,"Черный",2021,"Германия");
        Automobile kia = new Automobile("KIA","Sportage 4",2.4f,"Красный",2018,"Южная Корея");
        Automobile hyundai = new Automobile("Hyundai","Avante",1.6f,"Оранжевый",2016,"Южная корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}
