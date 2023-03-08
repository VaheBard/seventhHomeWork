import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] products = {"Milk", "Bread", "Butter", "Cheese"};
        int[] prices = {55, 35, 150, 123};
        System.out.println("Available products: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }

        int total = 0;//count the total shopping
        int[] byProducts = new int[4];//save the amount of each choose product
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what do you want and how many pieces you want(for example : 1 2");
            String inputNumber = sc.nextLine();
            
            if (inputNumber.equals("end")) {
                System.out.println("Your shopping");
                for (int i = 0; i < byProducts.length; i++) {
                    if (byProducts[i] != 0)
                        System.out.println(products[i] + " " + byProducts[i] + " pieces, " + prices[i] + " rub/each, totally " +
                                byProducts[i] * prices[i] + " rub ");

                }
                System.out.println("Total sum : " + total);
                break;
            }
            String[] parts = inputNumber.split(" ");
            int productN = Integer.parseInt(parts[0]);
            int productC = Integer.parseInt(parts[1]);
            byProducts[productN - 1] += productC;
            total += (productC * prices[productN - 1]);
        }
    }
}
