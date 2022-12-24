package ma.enset.comptecqrses.commonapi.events;

import lombok.Getter;

import java.util.Date;

public class AccountDebitedEvent extends BaseEvent<String> {
    @Getter public double amountDebited;
    @Getter  public String currency;
    @Getter public Date dateTransaction;
    public AccountDebitedEvent(String id, double amountDebited, String currency) {
        super(id);
        this.amountDebited = amountDebited;
        this.currency = currency;
        this.dateTransaction = new Date();
    }

}
