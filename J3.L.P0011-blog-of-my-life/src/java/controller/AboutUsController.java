
package controller;

import dao.AboutUsDao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * AboutUsController
 * Class lấy dữ liệu từ database Thông qua class AboutUsDao và đẩy dữ liệu lên view để hiển thị lên trình duyệt
 * 
 * @author viettqhe130524
 * @version 1.0
 */
public class AboutUsController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * lấy toàn bộ thông tin từ bảng info
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
            AboutUsDao model = new AboutUsDao();
            //Gọi phương thức getAllIn4 để lấy ra tất cả thông tin

            request.setAttribute("info", model.getAllIn4());
            //Đẩy dữ liệu lên aboutus.jsp

            request.getRequestDispatcher("aboutus.jsp").forward(request, response);
        } catch (IOException | ServletException ex) {
            //Đẩy sang error.jsp nếu có try sai
             request.setAttribute("error", ex.toString());
            request.getRequestDispatcher("error.jsp").forward(request, response);
            Logger.getLogger(AboutUsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     ** Gọi method processRequest
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
     * * Gọi method processRequest
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
