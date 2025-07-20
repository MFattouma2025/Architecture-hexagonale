package domain;

// Port sortant

public interface AccountRepository {
    Account findById(String id);
    void save(Account account);
}
