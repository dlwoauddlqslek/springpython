package example.task1;

import lombok.*;

@Getter@Setter@ToString@Builder
@AllArgsConstructor@NoArgsConstructor
public class AccountDto {
    private int id; // 식별번호
    private String content; // 설명
    private int price; // 금액
    private String date; // 날짜
}
