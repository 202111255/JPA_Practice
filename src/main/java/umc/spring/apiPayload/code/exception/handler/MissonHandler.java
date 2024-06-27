package umc.spring.apiPayload.code.exception.handler;

import umc.spring.apiPayload.code.BaseErrorCode;
import umc.spring.apiPayload.code.exception.GeneralException;


public class MissonHandler extends GeneralException {

    public MissonHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
