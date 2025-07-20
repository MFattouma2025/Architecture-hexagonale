package domain;

/*
le pckage domain Contient les entités, les règles métier, les cas d’usage (services métier).
Aucune dépendance vers l’extérieur.
Ce module définit des interfaces (Ports) que les composants externes implémentent.*/

import java.math.BigDecimal;

public class Account {
    private String id;
    private BigDecimal balance;

    public Account(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }
}
