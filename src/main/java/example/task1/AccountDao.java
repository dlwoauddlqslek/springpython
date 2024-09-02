package example.task1;

import example.mybatis.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountDao {
    // [1] 추상메소드
    // [C] 1. 등록
    int save( AccountDto accountDto );
    // [R] 2. 전체 출력
    List<AccountDto> findAll();

    // [R] 3. 수정
    int update( AccountDto accountDto);
    // [D] 4. 삭제
    int delete( int id );
}
