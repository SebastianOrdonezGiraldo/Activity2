package Ejercicio17;

public class Ejercicio17 {
    String[] options = {"15 días", "30 días", "3 meses"};
    int[] costs = {18000, 35000, 86000};

    public int getCost(String option) {
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals(option)) {
                return costs[i];
            }
        }
        return -1;
    }
}