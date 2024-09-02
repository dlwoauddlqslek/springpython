package example.mybatis;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MyDao {
    // [1] 추상메소드
    // [C] 1. 등록
    int save( UserDto userDto );
    // [R] 2. 전체 출력
    List<UserDto> findAll();
    // [R] 2-1 개별 출력
    UserDto findById( int id );
    // [R] 3. 수정
    int update( UserDto userDto);
    // [D] 4. 삭제
    int delete( int id );
}
