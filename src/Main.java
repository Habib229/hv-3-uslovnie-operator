public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Вам исполнилось " + age + " Поздравляю вы уже совершеннолетний");
        } else {
            System.out.println("Вам исполнилось " + age + " ксожалению возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        System.out.println();

        System.out.println("Задание 2");
        int airTemperature = 6;
        if (airTemperature <= 5) {
            System.out.println("Температура за бартом " + airTemperature + " градусов. На улице холодно, советую надеть шапку");
        } else {
            System.out.println("Температура а нулице " + airTemperature + " градусов. Сегодня тепло, можно идти без шапки");
        }

        System.out.println();

        System.out.println("Задача 3");
        int speed = 61;
        if (speed >= 60) {
            System.out.println("Эй гонщик! Скорость автомобиля " + speed + " км/ч. Придется заплатить штраф");
        } else {
            System.out.println("Скорость автомобиля " + speed + " км/ч. Можно ездить спокойно");
        }

        System.out.println();

        System.out.println("Задача 4");
        int theAgeOfThePerson = 65;
        if (theAgeOfThePerson <= 1) {
            System.out.println("Какой милый Миньен");
        }
        if (theAgeOfThePerson >= 2 && theAgeOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " , то ему нужно ходить в детский сад");
        }
        if (theAgeOfThePerson >= 7 && theAgeOfThePerson <= 17) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " , то ему нужно ходить в в школу");
        }
        if (theAgeOfThePerson >= 18 && theAgeOfThePerson <= 24) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " , то его место в университете");
        }
        else {
            System.out.println("Если человеку " + theAgeOfThePerson + " , то ему пора ходить на работу");
        }

        System.out.println();

        System.out.println("Задача 5");
        int ageOfTheChild = 3;
        boolean cannot = ageOfTheChild <= 5;
        boolean accompaniedByAdults = ageOfTheChild >= 5 && ageOfTheChild <= 14;
        boolean unaccompaniedByAnAdult = ageOfTheChild > 14;
        if (cannot) {
            System.out.println("Если возраст ребенка равен " + cannot + " лет, то он не может кататься на аттракционе");
        }
        if (accompaniedByAdults) {
            System.out.println("Если возраст ребенка равен " + accompaniedByAdults + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (unaccompaniedByAnAdult){
            System.out.println("Если возраст ребенка равен " + unaccompaniedByAnAdult + " лет, то он может кататься без сопровождения взрослого");
        }

        System.out.println();

        System.out.println("Задача 6");
        int human = 101;
        boolean availableSeats = human <= 59;
        boolean standingPlaces = human >= 60 && human <= 101;
        if (availableSeats) {
            int availableSeats1 = 60 - human;
            int availableSeats2 = 102 - 60;
            System.out.println("В гагоне " + human + " человек. Свободных сидячих мест " + availableSeats1 + ", а стоячих мест " + availableSeats2);
        }
        if (standingPlaces) {
            int standingPlaces0 = 0;
            int standingPlaces1 = human - 60;
            int standingPlaces2 = 102 - standingPlaces1;
            System.out.println("В гагоне " + human + " человек. Свободных сидячих мест " + standingPlaces0 + "(нет), а стоячих мест " + standingPlaces2);
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        System.out.println();

        System.out.println("Задача 7");
        int one = 20;
        int two = 20;
        int three = 20;
        boolean one1 = one > two && one > three;
        boolean two1 = two > one && two > three;
        if (one1) {
            System.out.println(one);
        }
        if (two1) {
            System.out.println(two);
        } else {
            if (three > one && three > two){
                System.out.println(three);
            } else {
                System.out.println(one);
            }

        }
    }
}