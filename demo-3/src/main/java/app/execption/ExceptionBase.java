package app.execption;


/**
 * Created by wxmimperio on 2017/5/13.
 */
public class ExceptionBase extends Exception {
    private Boolean success;
    private String data;

    public ExceptionBase(String message, Boolean success, String data) {
        super(message);
        this.success = success;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ExceptionBase{" +
                "success=" + success +
                ", data='" + data + '\'' +
                '}';
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
