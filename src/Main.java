public class Main {
    public static void main(String[] args) {

        System.out.println("Урок 6. Задание 1");
        int clientOs = 1;

        if (clientOs == 0) {
            System.out.println("Установите приложение для ios по ссылке");
        } else {
            System.out.println("Установите приложение для Андроид по ссылке");
        }
        System.out.println("Урок 6. Задание 2");
        int clientOsTwo = 0;
        int clientDeviceYearTwo = 2020;

        if (clientOsTwo == 0) {
            if (clientDeviceYearTwo < 2015) {
                System.out.println("Установите облегченную версию для ios по ссылке");
            } else {
                System.out.println("Установите версию для ios по ссылке");
            }
        } else {
            if (clientDeviceYearTwo < 2015) {
                System.out.println("Установите облегченную версию для Андроид по ссылке");
            } else {
                System.out.println("Установите версию для Андроид по ссылке");
            }
                System.out.println("Урок 6. Задание 3");
        int year = 2020;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год " + year + " является високосным");
        } else {
            System.out.println("год " + year + " не является високосным");
        }

        System.out.println("Урок 6. Задание 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        System.out.println("Потребуется дней: " + deliveryDay);
        }
        System.out.println("Урок 6. Задание 5");
        int monthNumber = 10;
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
                System.out.println("Некорректный месяц" + monthNumber);
        }
    }
}


