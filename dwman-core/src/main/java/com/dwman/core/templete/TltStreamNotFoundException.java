package com.dwman.core.templete;

/**
 * 模板文件流读取不到
 */
public class TltStreamNotFoundException extends Exception {
    public TltStreamNotFoundException() {
    }

    public TltStreamNotFoundException(String message) {
        super(message);
    }

    public TltStreamNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TltStreamNotFoundException(Throwable cause) {
        super(cause);
    }

    public TltStreamNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
