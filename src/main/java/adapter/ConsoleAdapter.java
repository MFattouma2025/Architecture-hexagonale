package adapter;

import application.DepositUseCase;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleAdapter {
    private final DepositUseCase depositUseCase;

    public ConsoleAdapter(DepositUseCase depositUseCase) {
        this.depositUseCase = depositUseCase;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter amount to deposit: ");
        BigDecimal amount = scanner.nextBigDecimal();

        depositUseCase.deposit(id, amount);
        System.out.println("Deposit successful!");
    }
}
