package ela.module_1.elafinder.api;

import javax.xml.bind.annotation.XmlTransient;

@javax.xml.bind.annotation.XmlRootElement
public class ApiResponseMessage {
    public static final int ERROR = 1;
    public static final int WARNING = 2;
    public static final int INFO = 3;
    public static final int OK = 4;
    public static final int TOO_BUSY = 5;

    int code;
    String type;
    String message;

    public ApiResponseMessage() {
    }

    public ApiResponseMessage(int code, String message) {
        this.code = code;
        switch (code) {
            case ERROR -> setType("error");
            case WARNING -> setType("warning");
            case INFO -> setType("info");
            case OK -> setType("ok");
            case TOO_BUSY -> setType("too busy");
            default -> setType("unknown");
        }
        this.message = message;
    }

    @XmlTransient
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
