package app.pojo;

/**
 * Created by wxmimperio on 2017/5/13.
 */
public class NewException<T> {

    private Boolean success;
    private String message;
    private String url;
    private Integer code;
    private T data;

    @Override
    public String toString() {
        return "NewException{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
