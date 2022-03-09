package com.jamesvrooney.filters;

import org.springframework.security.web.csrf.CsrfToken;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Logger;

public class CsrfTokenLogger implements Filter {

    private Logger logger = Logger.getLogger(CsrfTokenLogger.class.getName());

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        Object o = servletRequest.getAttribute("_csrf");
        CsrfToken csrfToken = (CsrfToken) o;

        logger.info("CSRF token " + csrfToken.getToken());

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
