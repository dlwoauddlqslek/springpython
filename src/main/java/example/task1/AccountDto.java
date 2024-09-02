package example.task1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AccountDto {
    private int id; // 식별번호
    private String ex; // 설명
    private int amount; // 금액
    private String date; // 날짜
}
