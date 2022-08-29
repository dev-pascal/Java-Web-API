package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;

public class CarritoController {
	
	public static void cargar (JspWriter out, HttpSession session) throws IOException {
		@SuppressWarnings("unchecked")
		List<String> list = (List<String>)session.getAttribute("checked_items");
		if (list != null && list.size() != 0) { 
			for (String in: list) {
				out.println(in + "<br>");
			}
		} else {
			out.println("No items selected");
		}
	}
}
