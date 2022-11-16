public class Main {
    public static void dz1Task1(){
        System.out.println("\nTask 1");
        int age = 19;
        if (age>=18){
            System.out.println("Поздравляем с совершеннолетием");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил");
        }
    }

    public static void dz1Task2(){
        System.out.println("\nTask 2");
        int age = 25;
        if(age>=7){
            if(age>=18){
                if(age>=24){
                    System.out.println("Человек окончил университет");
                }
                else {
                    System.out.println("Человек закончил школу");
                }
            }
            else {
                System.out.println("Ребенок ходит в школу");
            }
        }
    }

    public static void dz1Task3(){
        System.out.println("\nTask 3");
        int freeSpace = 102;
        int sittingSpace = 60;
        int newSpace = 123;
        if (newSpace<=sittingSpace){
            System.out.println("Доступно сидячее место");
        }
        else {
            if(newSpace<=freeSpace){
                System.out.println("Доступны стоячие места");
            }
            else{
                System.out.println("Мест нет");
            }
        }
    }

    public static void dz2Task1(){
        System.out.println("\nTask 2.1");
        int age = 3;
        String place = "none";
        if(age>=2 && age<=6){
            place="в детский сад";
        }
        else{
            if (age>=7 && age<18){
                place="в школу";
            }
            else{
                if (age>=18 && age<24){
                    place = "в университет";
                }
                else {
                    place = "на работу";
                }
            }
        }
        System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить "+place);
    }

    public static void dz2Task2(){
        System.out.println("\nTask 2.2");
        int age = 6;
        if(age<5){
            System.out.println("не может кататься на аттракционе");
        }
        else{
            if(age>=5 && age<14){
                System.out.println("может кататься только в сопровождении взрослого");
            }
            else {
                System.out.println("может кататься без сопровождения взрослого");
            }
        }
    }

    public static void dz2Task3(){
        System.out.println("\nTask 2.3");
        int one = 6;
        int two = 5;
        int three = 3;
        if (one>two){
            if (one>three) {
                System.out.println(one);
            }
            else{
                System.out.println(three);
            }
        }else {
            if (two>three){
                System.out.println(two);
            }
            else {
                System.out.println(three);
            }
        }
    }

    public static void main(String[] args) {
        dz1Task1();
        dz1Task2();
        dz1Task3();
        dz2Task1();
        dz2Task2();
        dz2Task3();
    }
}