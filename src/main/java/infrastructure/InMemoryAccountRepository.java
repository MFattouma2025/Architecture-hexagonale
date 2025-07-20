package infrastructure;

//Adaptateurs (BDD, Mail, API externes, etc.)

import domain.Account;
import domain.AccountRepository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class InMemoryAccountRepository implements AccountRepository {
    private final Map<String, Account> store = new HashMap<>();

    public InMemoryAccountRepository() {
        store.put("abc123", new Account("abc123", BigDecimal.valueOf(100)));
    }

    @Override
    public Account findById(String id) {
        return store.get(id);
    }

    @Override
    public void save(Account account) {
        store.put(account.getId(), account);
    }
}

