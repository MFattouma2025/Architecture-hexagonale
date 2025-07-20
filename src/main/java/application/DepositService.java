package application;

/* la couche Application joue le rôle de médiateur (ou orchestrateur) entre :
le Domaine (où se trouvent les règles métiers pures),
et les Adaptateurs / Frameworks (ex: REST, base de données, interface graphique, etc.).
*/
import domain.Account;
import domain.AccountRepository;

import java.math.BigDecimal;

public class DepositService implements DepositUseCase {
    private final AccountRepository accountRepository;

    public DepositService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void deposit(String accountId, BigDecimal amount) {
        Account account = accountRepository.findById(accountId);
        if (account == null) throw new RuntimeException("Account not found");
        account.deposit(amount);
        accountRepository.save(account);
    }
}
