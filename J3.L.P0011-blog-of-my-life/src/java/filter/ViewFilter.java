/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import dao.ViewDao;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viettqhe130524
 */
@WebFilter(filterName = "ViewFilter", urlPatterns = {"/DetailsPost"})
public class ViewFilter implements Filter {

    /**
     *
     * Update view count and get the total view when customer view detail of 
     * blog
     * 
     * 
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        boolean isUpdate = new ViewDao().UpdateView();
        HttpServletRequest req = (HttpServletRequest) request;
        if (isUpdate) {
            int view = new ViewDao().getView();
            if (view == -1) {
                req.setAttribute("error", "Lỗi get view");
                req.getRequestDispatcher("error.jsp").forward(request, response);
            } else {
                req.setAttribute("totalView", view);
                chain.doFilter(request, response);
            }
        } else {
            req.setAttribute("error", "Lỗi update view");
            req.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

}
