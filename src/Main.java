public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание 1

        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");

            //Задание 2

            int clientOS = 0;
            int clientDeviceYear = 2020;
            if (clientOS == 0) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            } else {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }

            }

            //Задание 3

            int year = 2020;
            if (year / 4 == 0 && year / 100 != 0 || year / 400 == 0) {
                System.out.println(year + "является високосным");
            } else {
                System.out.println(year + "является не високосным");
            }
        }

        //Задание 4

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        {

        }
    }


    //Задание 5

    {
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный месяц:" + monthNumber);
        }
    }
}













