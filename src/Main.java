public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        short age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +age+ ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " +age+ ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println("Задание 2.");
        byte temperature = -1;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        System.out.println("Задание 3.");
        short speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " +speed+ ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " +speed+", то можно ездить спокойно.");
        }
        System.out.println("Задание 4.");
        short age1 = 25;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " +age1+ ", то ему нужно ходить в детский сад.");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " +age1+ ", то ему нужно ходить в школу.");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " +age1+ ", то его место в университете.");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " +age1+", то ему пора ходить на работу.");
        }
        System.out.println("Задание 5.");
        byte childAge = 17;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " +childAge+ ", то ему нельзя кататься на аттракционе.");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " +childAge+ ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " +childAge+ ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("Задание 6.");
        short occupiedSeating = 60;
        short occupiedStanding = 41;
        if ((occupiedSeating + occupiedStanding) < 102) {
            System.out.println("Места есть.");
            if (occupiedSeating < 60) {
                System.out.println("Сидячих мест " + (60 - occupiedSeating) + ".");
            } else {
                System.out.println("Сидячих мест нет.");
            }
            if (occupiedStanding < 42) {
                System.out.println("Стоячих мест " + (42 - occupiedStanding) + ".");
            } else {
                System.out.println("Стоячих мест нет.");
            }
        } else {
            System.out.println("Мест нет.");
        }
        System.out.println("Задание 7.");
        int one = 10;
        int two = 25;
        int three = 15;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else {
            if (two >= one && two >= three) {
                System.out.println("Наибольшее число: " + two);
            } else {
                System.out.println("Наибольшее число: " + three);

            }
        }
    }
}