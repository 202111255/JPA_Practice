package umc.spring.service.StoreService;

import org.springframework.data.domain.Page;
import umc.spring.domain.Mission;
import umc.spring.domain.Review;
import umc.spring.domain.Store;

import java.util.Optional;

public interface StoreQueryService {
    boolean isExist(Long id);

    Optional<Store> findStore(Long id);

    Page<Review> getReviewList(Long StoreId, Integer page);
}
