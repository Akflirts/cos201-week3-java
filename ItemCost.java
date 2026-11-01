import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        double totalCost = price * quantity;

        System.out.println("\n--- Item Cost Summary ---");
        System.out.println("Price per item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);

        scanner.close();
    }
}
