package jp.co.aforce.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.model.ConfirmModel;
import jp.co.aforce.model.RegistModel;
import jp.co.aforce.tool.Message;

@WebServlet(urlPatterns = {"/jp/co/aforce/controller/RegistController"})
public class RegistController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String last_name = request.getParameter("last_name");
		String first_name = request.getParameter("first_name");
		String sex = request.getParameter("sex");
		String job = request.getParameter("job");
		String mail_address = request.getParameter("mail_address");
		String phone_number = request.getParameter("phone_number");
		int birth_year = Integer.parseInt(request.getParameter("birth_year"));
		int birth_month = Integer.parseInt(request.getParameter("birth_month"));
		int birth_day = Integer.parseInt(request.getParameter("birth_day"));


		ConfirmModel model1 = new ConfirmModel();
		int count = model1.confirmMemberData(last_name, first_name, sex, birth_year, birth_month, birth_day, job, phone_number, mail_address);
		if(count == 0) {

			RegistModel model2 = new RegistModel();
			int insert = model2.registerNewMemberData(last_name, first_name, sex, birth_year, birth_month, birth_day, job, phone_number, mail_address);

			if(insert == 0) {
				request.setAttribute("errorMsg", Message.E_WKK0002);
				request.getRequestDispatcher("/views/regist.jsp").forward(request, response);
			}else {
				request.setAttribute("errorMsg", Message.I_WKK0001);
				request.getRequestDispatcher("/views/regist.jsp").forward(request, response);
			}

		}else {
			request.setAttribute("errorMsg", Message.E_WKK0001);
			request.getRequestDispatcher("/views/regist.jsp").forward(request, response);
		}

	}

}
