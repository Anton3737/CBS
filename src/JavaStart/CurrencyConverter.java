package JavaStart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class CurrencyConverter {

    public static void main(String[] args) {
        try {
            // Получаем курс валют от Нацбанка
            double rate = getExchangeRate("USD");

            // Получаем от пользователя входные данные
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите сумму: ");
            double amount = Double.parseDouble(reader.readLine());

            // Конвертируем сумму в гривны
            double uahAmount = amount * rate;

            // Выводим результат
            System.out.printf("%.2f %s = %.2f UAH\n", amount, "USD", uahAmount);
        } catch (IOException e) {
            System.out.println("Ошибка при получении курса валют");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат суммы");
        }
    }

    // Получение курса валют от Нацбанка
    private static double getExchangeRate(String currencyCode) throws IOException {
        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=" + currencyCode);
        URLConnection connection = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("<rate>")) {
                int startIndex = line.indexOf("<rate>") + "<rate>".length();
                int endIndex = line.indexOf("</rate>");
                return Double.parseDouble(line.substring(startIndex, endIndex).replace(',', '.'));
            }
        }

        throw new IOException("Курс валюты не найден");
    }
}
