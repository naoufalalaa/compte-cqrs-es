package ma.enset.comptecqrses.commonapi.mappers;

import ma.enset.comptecqrses.commonapi.dtos.AccountResponseDTO;
import ma.enset.comptecqrses.query.entities.Account;
import org.mapstruct.Mapper;

//@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountResponseDTO toAccountResponseDTO(Account account);
}
