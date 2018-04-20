package jp.co.test.exeception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthExceptionHandler  implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(final HttpServletRequest request,
                                         final HttpServletResponse response, final Object handler,
                                         final Exception e) {
        ModelAndView model = new ModelAndView();
        model.setViewName("/common/error");
        return model;
    }
}
