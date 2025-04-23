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
        short totalSeats = 50;
        short seating = 60;
        short standing = 42;
        if (totalSeats < 102) {
            System.out.println("Места есть.");
        } else {
            System.out.println("Мест нет.");
        }
        if (seating < 60) {
            System.out.println("Сидячих мест " +seating+ ".");
        } else {
            System.out.println("Сидячих мест нет.");
        }
        if (standing < 42) {
            System.out.println("Стоячих мест " +seating+ ".");
        } else {
            System.out.println("Стоячих мест нет.");
        }
        byte age2 = 19;
        boolean canNotGoToSchool = age2 < 7 || age2 > 18;
        if (age2 >= 18 && age2 < 21) {
            System.out.println("Ты достаточно взрослый, чтобы водить, но недостаточно, чтобы пить алкоголь");
        }
        if (canNotGoToSchool) {
            System.out.println("Я думаю ты не ходишь в школу");
        }
        boolean skyIsClear = true;
        if (skyIsClear) {
            System.out.println("Небо чистое");
        }
    }
}