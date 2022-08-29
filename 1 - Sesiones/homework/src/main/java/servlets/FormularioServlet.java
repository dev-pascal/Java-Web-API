package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
        name = "FormularioServlet",
        urlPatterns = "/formulario"
)
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormularioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("carrito.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSesion = request.getSession();
		List<String> checked = getCheckedBoxs(request);
		httpSesion.setAttribute("checked_items", checked);
		request.getRequestDispatcher("carrito.jsp").forward(request, response);
	}

	public List<String> getCheckedBoxs(HttpServletRequest request) {
		List<String> list = new ArrayList<String>();
		attemptToAdd(list, request.getParameter("cbox1"));
		attemptToAdd(list, request.getParameter("cbox2"));
		attemptToAdd(list, request.getParameter("cbox3"));
		return list;
	}
	
	private void attemptToAdd(List<String> list, String data) {
		if (data != null) {
			list.add(data);
		}
	}

}
