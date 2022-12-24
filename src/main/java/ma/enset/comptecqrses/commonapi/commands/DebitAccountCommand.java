package ma.enset.comptecqrses.commonapi.commands;

import lombok.Getter;

import java.util.Date;

public class DebitAccountCommand extends BaseCommand<String> {
    @Getter public double amountDebited;
    @Getter public String currency;
    @Getter public Date dateTransaction;

    public DebitAccountCommand(String id, double amountDebited, String currency) {
        super(id);
        this.amountDebited = amountDebited;
        this.currency = currency;
        this.dateTransaction = new Date();
    }
}
