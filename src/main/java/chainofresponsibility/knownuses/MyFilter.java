package chainofresponsibility.knownuses;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("환영합니다.");
        chain.doFilter(request, response);
        System.out.println("종료");
    }
}
