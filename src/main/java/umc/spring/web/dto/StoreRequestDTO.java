package umc.spring.web.dto;

import lombok.Getter;

public class StoreRequestDTO {

    @Getter
    public static class JoinStoreDTO {
        String name;
        String address;
        Float score;
        Long regionId;
    }
}
