package chainofresponsibility.knownuses;

import javax.servlet.*;
import java.io.IOException;

public class CoRInJava {
    public static void main(String[] args) {
        Filter filter = new Filter() {
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                chain.doFilter(request, response);
            }
        };
    }
}
