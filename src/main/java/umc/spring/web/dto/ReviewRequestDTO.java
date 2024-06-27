package umc.spring.web.dto;

import lombok.Getter;

public class ReviewRequestDTO {

    @Getter
    public static class JoinReviewDTO {
        String body;
        Float score;
        Long memberId;
        Long storeId;
    }
}
