
package controller;

import dao.HomeDao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * OverviewController.<br>
 *
 * <pre>
 * Class lấy dữ liệu từ database Thông qua class HomeDao và đẩy dữ liệu lên view để hiển thị lên trình duyệt
 * phân trang dữ liệu lấy được từ db
 *
 *
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . ProcessRequest.
 * . DoGet.
 * . DoPost.
 *
 *
 * </pre>
 *
 * @author viettqhe130524
 * @version 1.0
 */
public class OverviewController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. lấy toàn bộ thông tin từ bảng home và phân trang
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            //khởi tạo contructor và tạo tham số mặc định
            HomeDao model = new HomeDao();
            int page = 1;
            int pageSize = 5;
            
            //check page param
            if (request.getParameter("page") != null) {
                page = Integer.parseInt(request.getParameter("page"));
            }

            request.setAttribute("home", model.getPost(page, pageSize));
            request.setAttribute("page", page);
            request.setAttribute("totalPage", model.getTotalPage(pageSize));
            request.getRequestDispatcher("overview.jsp").forward(request, response);
        } catch (Exception ex) {
            //Đẩy sang error.jsp nếu có try sai
            request.setAttribute("error", ex.toString());
            request.getRequestDispatcher("error.jsp").forward(request, response);
            Logger.getLogger(OverviewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
