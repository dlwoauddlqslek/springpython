package example.task1;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountDao {

    // 추상메소드
    boolean create( AccountDto accountDto );
    List<AccountDto> read();
    boolean update( AccountDto accountDto );
    boolean delete( int id );

}
