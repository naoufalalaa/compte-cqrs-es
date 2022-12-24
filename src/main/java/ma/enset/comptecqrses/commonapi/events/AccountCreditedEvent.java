package ma.enset.comptecqrses.commonapi.events;

import lombok.Getter;

import java.util.Date;

public class AccountCreditedEvent extends BaseEvent<String> {
    @Getter public double amountCredited;
    @Getter  public String currency;
    @Getter public Date dateTransaction;

    public AccountCreditedEvent(String id, double amountCredited, String currency) {
        super(id);
        this.amountCredited = amountCredited;
        this.currency = currency;
        this.dateTransaction = new Date();
    }

}
