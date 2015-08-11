package com.tong.springtest01.resp;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by tong on 8/11/15.
 */
public class RestResponse implements Serializable {
    protected String            message;
    protected String            code;
    private Map<String, Object> data;
    protected String            redirect;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }
}
