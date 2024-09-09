package example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("")
    // http://localhost:8080/account?content=커피&price=2000&date=2024-09-03
    boolean create( AccountDto accountDto ) {
        return accountService.create(accountDto);
    }
    @GetMapping("")
    List<AccountDto> read(){
        return accountService.read();
    }
    @PutMapping("")
    // http://localhost:8080/account?content=커피&price=2000&date=2024-09-03&id=1
    boolean update( AccountDto accountDto ){
        return accountService.update( accountDto );
    }
    @DeleteMapping("")
    // http://localhost:8080/account?id=1
    boolean delete( int id ){
        return accountService.delete( id );
    }
}
