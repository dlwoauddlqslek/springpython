package example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public int save(AccountDto accountDto){return accountService.save(accountDto);}

    @GetMapping("/findall")
    public List<AccountDto> findAll(){
        System.out.println("AccountController.findAll");
        return accountService.findAll();}

    @PutMapping("/update")
    public int update(AccountDto accountDto){return accountService.update(accountDto);}

    @DeleteMapping("/delete")
    public int delete(int id){return accountService.delete(id);}
}
