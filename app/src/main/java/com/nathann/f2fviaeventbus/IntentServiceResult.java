package com.nathann.f2fviaeventbus;

import java.util.List;

public class IntentServiceResult {

    private List<String> mResult;
    private String mResultValue;

    IntentServiceResult(List<String> resultCode, String resultValue) {
        mResult = resultCode;
        mResultValue = resultValue;
    }

    public List<String> getResult() {
        return mResult;
    }

    public String getResultValue() {
        return mResultValue;
    }

}