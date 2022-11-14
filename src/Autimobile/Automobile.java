package Autimobile;

public class Automobile {
    String brand;
    String model;
    Float engineVolume;
    String color;
    int year;
    String country;

    public Automobile(String brand, String model, Float engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = model;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = Math.abs(year);
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", цвет: " + color + ", год выпуска: " + year + ", страна сборки: " + country + ".";
    }
}

