import java.util.Scanner;

import ru.netology.service.СustomsService;

import static ru.netology.service.СustomsService.calculateCustoms;


public class Main {

    public static void main(String[] args) {

        System.out.println(" Добрый день вас привествует калькулятор для расчета пошлины для провоза товара");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара(в кг.): ");
        int weight = scanner.nextInt();


        int p1 = calculateCustoms(price, weight);
        System.out.println("Стоимость пошлины составляет: " + p1 + " рублей");
    }
}