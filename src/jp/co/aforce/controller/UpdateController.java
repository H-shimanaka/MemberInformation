package jp.co.aforce.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.model.ConfirmModel;
import jp.co.aforce.model.GetMemberDataModel;
import jp.co.aforce.model.UpdateModel;
import jp.co.aforce.tool.Message;

@WebServlet(urlPatterns = {"/jp/co/aforce/controller/UpdateController"})
public class UpdateController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String member_id = request.getParameter("member_id");

		ConfirmModel model1 = new ConfirmModel();
		int count = model1.confirmExistMember(member_id);
		if(count == 0) {
			request.setAttribute("errorMsg", Message.E_WKK0003);
			request.getRequestDispatcher("/views/update.jsp").forward(request, response);
		}else {

			GetMemberDataModel model2 = new GetMemberDataModel();
			MemberBean mb = model2.GetMemberData(member_id);

			request.setAttribute("mb", mb);
			request.getRequestDispatcher("/views/update.jsp").forward(request, response);

		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String member_id = request.getParameter("member_id");
		String last_name = request.getParameter("last_name");
		String first_name = request.getParameter("first_name");
		String sex = request.getParameter("sex");
		String job = request.getParameter("job");
		String mail_address = request.getParameter("mail_address");
		String phone_number = request.getParameter("phone_number");
		int birth_year = Integer.parseInt(request.getParameter("birth_year"));
		int birth_month = Integer.parseInt(request.getParameter("birth_month"));
		int birth_day = Integer.parseInt(request.getParameter("birth_day"));


		UpdateModel model = new UpdateModel();
		int update = model.UpdateMemberData(member_id, last_name, first_name, sex, birth_year, birth_month, birth_day, job, phone_number, mail_address);
		if(update == 0) {
			request.setAttribute("errorMsg", Message.E_WKK0004);
			request.getRequestDispatcher("/views/update.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMsg", Message.I_WKK0002);
			request.getRequestDispatcher("/views/update.jsp").forward(request, response);
		}

	}

}
