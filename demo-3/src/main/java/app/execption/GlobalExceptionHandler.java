package app.execption;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import app.pojo.NewException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wxmimperio on 2017/5/13.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ExceptionBase.class)
    @ResponseBody
    public NewException<String> jsonErrorHandler(HttpServletRequest request, HttpServletResponse response, ExceptionBase e) throws Exception {
        NewException<String> exception = new NewException<>();
        exception.setMessage(e.getMessage());
        exception.setCode(response.getStatus());
        exception.setUrl(request.getRequestURL().toString());
        exception.setData(e.getData());
        exception.setSuccess(e.getSuccess());
        return exception;
    }
}
