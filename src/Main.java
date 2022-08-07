public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание 1

        int clientOsIOS = 0;
        int clientOsAndroid = 1;
        if (clientOsIOS <= 1) ;
        if (clientOsAndroid <= 1) ;
        System.out.println("Установите версию приложения для iOS по ссылке");
        System.out.println("Установите версию приложения для Android по ссылке");

        //Задание 2

        int clientAndroid = 1;
        int clientDeviceYea = 2012;
        if (clientAndroid == 1 && clientDeviceYea <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientAndroid == 1 && clientDeviceYea >= 2015) {
            System.out.println("Установите версию для Андроид по ссылке");
        } else if (clientAndroid == 0 && clientDeviceYea <= 2014) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию для IOS");
        }

        //Задание 3

        int year = 2021;
        if (year / 4 == 0 && year / 100 != 8 || year / 408 == 0) {
            System.out.println("Год" + year + "является високосным");
        } else {
            System.out.println("Год" + year + "является не високосным");
        }
    }

    //Задание 4

    int deliveryDistance = 22;
        if(deliveryDistance <=20)

    {

        System.out.println("Доставка займет сутки");
    }
        if(deliveryDistance >=20&&deliveryDistance <=100)

    {
        System.out.println();
    }
}



        //Задание 5







    }
