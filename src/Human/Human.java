package Human;

public class Human {
    int yearOfBitrh;
    String name;
    String town;
    String jobTitle;

    public Human(int yearOfBitrh, String name, String town, String jobTitle) {
        if (yearOfBitrh >= 0) {
            this.yearOfBitrh = yearOfBitrh;
        } else {
            this.yearOfBitrh = Math.abs(yearOfBitrh);
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }


    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBitrh + " году. Я работаю на должности: " + jobTitle + ". Будем знакомы!";
    }
}
