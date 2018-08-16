
package com.dulcejosefina.server;

import com.dulcejosefina.ejb.EJBPresupuestoBeanService;
import com.dulcejosefina.reporte.Reportes;
import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
public class ShowPresupuesto extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/EJBPresupuestoBeanService/EJBPresupuestoBean.wsdl")
    private EJBPresupuestoBeanService service;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0L);
    response.setContentType("application/pdf");
    String xml="";
        Reportes reporte = new Reportes();
    try { // Call Web Service Operation
        System.out.println("11");
        com.dulcejosefina.ejb.EJBPresupuestoBean port = service.getEJBPresupuestoBeanPort();
        System.out.println("11");
        // TODO initialize WS operation arguments here
        String nro = request.getParameter("nro");
        System.out.println("11");
        Integer idPresupuesto = Integer.valueOf(nro);
        // TODO process result here
         xml = port.selectOnePresupuesto(idPresupuesto);
        ServletOutputStream servletOutputStream = response.getOutputStream();
        System.out.println("11");
                org.w3c.dom.Document doc = reporte.obtenerDocumentoParseado(xml);
                byte[] bytes = reporte.obtenerReporteJasper(doc, "/Lista/presupuesto", reporte.obtenerPresupuesto());
                response.setContentType("application/pdf");
                response.setContentLength(bytes.length);
                servletOutputStream.write(bytes, 0, bytes.length);
                servletOutputStream.flush();
    } catch (IOException | NumberFormatException ex) {
        // TODO handle custom exceptions here
        
        Logger.getLogger(ex.getMessage());
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
