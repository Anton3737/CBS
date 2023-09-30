package SomeTask;

public class SpaceShip {

    private String name;

    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }
        this.name = name;
    }

//    Створи приватне поле serialNumber рядкового типу. Зроби геттер та сеттер для цього поля. +
//    Зверни увагу, що структура серійного коду наступна - дві літери SN
//    , і шість будь-яких символів після літер (всього 8 символів, наприклад SNAX65G8).
//    Напиши сеттер так, щоб якщо хтось намагається встановити неправильний серійний номер, то ця спроба ігнорувалась.

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        String firstLet = serialNumber.substring(0, 2).toUpperCase();
        if (firstLet.equals("SN") && serialNumber.length() == 8) {
            this.serialNumber = serialNumber;
        }
    }


    public void printInfo() {
        String msgName = getName();
        String msgSN = getSerialNumber();
        String soutMSG = "Name is " + msgName + ", serial number is " + msgSN + "";
        System.out.println(soutMSG);
    }


    public static void main(String[] args) {

        SpaceShip ship = new SpaceShip();

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }
}
