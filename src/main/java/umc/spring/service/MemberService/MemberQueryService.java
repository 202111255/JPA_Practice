package umc.spring.service.MemberService;

import org.springframework.data.domain.Page;
import umc.spring.domain.Review;

public interface MemberQueryService {
    boolean isExist(Long id);
    Page<Review> getReviews(Long memberId, Integer page);
}