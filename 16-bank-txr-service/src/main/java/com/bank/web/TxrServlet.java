package com.bank.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.repository.JdbcAccountRepository;
import com.bank.service.SGTxrService;
import com.bank.service.TxrService;

@WebServlet(urlPatterns= {"/txr","/transfer"})
public class TxrServlet extends HttpServlet {

	private SGTxrService txrService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		txrService = new SGTxrService();
		txrService.setAccountRepository(new JdbcAccountRepository());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// input
		String amount = req.getParameter("amount");
		String fromAccNum = req.getParameter("fromAccNum");
		String toAccNum = req.getParameter("toAccNum");

		// conversion & validate
		// authentication

		// process
		boolean b = txrService.txr(Double.parseDouble(amount), fromAccNum, toAccNum);
		String statusMessage = b ? "Txr success" : "Txr Failed";

		// output
//		PrintWriter out = resp.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<hr />\n" + "	<h1>my-bank</h1>\n" + "	<hr />");
//		out.println(statusMessage);
//		out.println("</body>");
//		out.println("</html>");
//		out.close();
		
		
		// dispatching
		
		req.setAttribute("message", statusMessage);;
		req.getRequestDispatcher("txr-status.jsp").forward(req, resp);;

	}

}
