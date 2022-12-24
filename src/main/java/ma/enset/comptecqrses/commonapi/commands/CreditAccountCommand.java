package ma.enset.comptecqrses.commonapi.commands;

import lombok.Getter;

import java.util.Date;

public class CreditAccountCommand extends BaseCommand<String> {
    @Getter public double amountCredited;
    @Getter public String currency;
    @Getter public Date dateTransaction;

    public CreditAccountCommand(String id, double amountCredited, String currency) {
        super(id);
        this.amountCredited = amountCredited;
        this.currency = currency;
        this.dateTransaction = new Date();
    }

}
