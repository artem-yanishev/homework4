public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        short age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +age+ ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " +age+ ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println("Задание 2.");

        byte age1 = 19;
        boolean canNotGoToSchool = age1 < 7 || age1 > 18;
        if (age1 >= 18 && age1 < 21) {
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