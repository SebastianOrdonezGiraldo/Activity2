package Ejercicio16;

public class Ejercicio16 {
    private String gender;
    private int age;

    public Ejercicio16(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculateAid() {
        if (gender.equalsIgnoreCase("female")) {
            if (age > 50) {
                return 120000;
            } else if (age >= 30) {
                return 100000;
            }
        } else if (gender.equalsIgnoreCase("male")) {
            return 40000;
        }
        return 0;
    }
}
