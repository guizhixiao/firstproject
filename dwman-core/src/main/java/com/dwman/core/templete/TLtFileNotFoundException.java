package com.dwman.core.templete;

/**
 * 模板文件为找到错误
 */
public class TLtFileNotFoundException  extends Exception{

    public TLtFileNotFoundException() {
    }

    public TLtFileNotFoundException(String message) {
        super(message);
    }

    public TLtFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TLtFileNotFoundException(Throwable cause) {
        super(cause);
    }

    public TLtFileNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
