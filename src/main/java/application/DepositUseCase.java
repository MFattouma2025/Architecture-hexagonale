package application;

import java.math.BigDecimal;

//Port entrant
public interface DepositUseCase {
    void deposit(String accountId, BigDecimal amount);
}
