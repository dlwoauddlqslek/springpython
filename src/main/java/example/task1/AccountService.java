package example.task1;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@Log4j2
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    @PostMapping("/save")
    public int save(AccountDto accountDto){return accountDao.save(accountDto);}

    @GetMapping("/findall")
    public List<AccountDto> findAll(){return accountDao.findAll();}

    @PutMapping("/update")
    public int update(AccountDto accountDto){return accountDao.update(accountDto);}

    @DeleteMapping("/delete")
    public int delete(int id){return accountDao.delete(id);}


}
