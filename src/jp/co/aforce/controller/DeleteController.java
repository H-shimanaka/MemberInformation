package jp.co.aforce.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.model.ConfirmModel;
import jp.co.aforce.model.DeleteModel;
import jp.co.aforce.model.GetMemberDataModel;
import jp.co.aforce.tool.Message;

@WebServlet(urlPatterns = {"/jp/co/aforce/controller/DeleteController"})
public class DeleteController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String member_id = request.getParameter("member_id");

		ConfirmModel model1 = new ConfirmModel();
		int count = model1.confirmExistMember(member_id);
		if(count == 0) {
			request.setAttribute("errorMsg", Message.E_WKK0003);
			request.getRequestDispatcher("/views/delete.jsp").forward(request, response);
		}else {

			GetMemberDataModel model2 = new GetMemberDataModel();
			MemberBean mb = model2.GetMemberData(member_id);

			request.setAttribute("mb", mb);
			request.getRequestDispatcher("/views/delete.jsp").forward(request, response);

		}
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String member_id = request.getParameter("member_id");

		DeleteModel model = new DeleteModel();
		int delete = model.DeleteMemberData(member_id);

		if(delete == 0) {
			request.setAttribute("errorMsg", Message.E_WKK0005);
			request.getRequestDispatcher("/views/delete.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMsg", Message.I_WKK0003);
			request.getRequestDispatcher("/views/delete.jsp").forward(request, response);
		}

	}

}
