package example.task1;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class AccountService {
    @Autowired AccountDao accountDao;
    boolean create( AccountDto accountDto ){
        System.out.println("accountDto = " + accountDto);
        boolean result = accountDao.create( accountDto );
        if( result ){ log.info("Account created"); }
        return result;
    }
    List<AccountDto> read(){
        System.out.println("AccountService.read");
        return accountDao.read();
    }
    boolean update( AccountDto accountDto ){
        System.out.println("accountDto = " + accountDto);
        boolean result = accountDao.update( accountDto );
        if( result ){ log.info("Account updated"); }
        return result;
    }
    boolean delete( int id ){
        System.out.println("id = " + id);
        boolean result =  accountDao.delete( id );
        if( result ){ log.info("Account deleted"); }
        return result;
    }
}
