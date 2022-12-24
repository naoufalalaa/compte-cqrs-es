package ma.enset.comptecqrses.commonapi.events;

import lombok.Getter;
import ma.enset.comptecqrses.commonapi.enums.AccountStatus;

import java.util.Date;

public class AccountCreatedEvent extends BaseEvent<String> {
    @Getter public double initialBalance;
    @Getter public String currency;
    @Getter public AccountStatus status;
    @Getter public Date dateCreation;

    public AccountCreatedEvent(String id, double initialBalance, String currency, AccountStatus status) {
        super(id);
        this.initialBalance = initialBalance;
        this.currency = currency;
        this.status = status;
        this.dateCreation = new Date();
    }
}
