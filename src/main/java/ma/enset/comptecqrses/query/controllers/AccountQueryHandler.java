package ma.enset.comptecqrses.query.controllers;

import lombok.extern.slf4j.Slf4j;
import ma.enset.comptecqrses.commonapi.dtos.AccountResponseDTO;
import ma.enset.comptecqrses.commonapi.queries.FindAccountQuery;
import ma.enset.comptecqrses.commonapi.queries.FindAllAccountsQuery;
import ma.enset.comptecqrses.query.entities.Account;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/query")
public class AccountQueryHandler {
    private QueryGateway queryGateway;

    public AccountQueryHandler(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping("/accounts")
    public List<Account> getAll(){
        return queryGateway.query(new FindAllAccountsQuery(), ResponseTypes.multipleInstancesOf(Account.class)).join();
    }

    @GetMapping("/account/{id}")
    public Account getOne(@PathVariable String id){
        return queryGateway.query(new FindAccountQuery(id), Account.class).join();
    }
}