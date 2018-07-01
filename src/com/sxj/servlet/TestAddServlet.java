package com.sxj.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestAddServlet
 */
@WebServlet("/mng/testadd")
public class TestAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestAddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 配置字符集
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// 获取页面数据
		String name = request.getParameter("username");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		int gender1 = Integer.valueOf(gender);// 类型转换。字符型转换为int型
		String address = request.getParameter("address");
		String[] hobby = request.getParameterValues("hobby");

		System.out.println("username=" + name + " ,tel=" + tel + " ,gender=" + gender1 + " ,address=" + address);

		System.out.println("============================");
		for (int i = 0; i < hobby.length; i++) {
			String id=hobby[i];
			System.out.println(id);
		}
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		Date d1=new Date();
		System.out.println("d1："+d1);
		String creatDate=df1.format(d1);
		System.out.println("creatDate:"+creatDate);
		String stdate=request.getParameter("date1");
		Date date=null;
		try {
			date=df1.parse(stdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("在请求域中赋值=============");// request.setAttribute("属性名"，属性值);
		request.setAttribute("username", name);
		request.setAttribute("tel", tel);
		request.setAttribute("gender", gender);
		request.setAttribute("address", address);
		request.setAttribute("hobby", hobby);
		request.setAttribute("date", date);
		// 查询的时候用请求分派，重新跳到一个界面。======重定向\\请求分派
		request.getRequestDispatcher("/Testshow.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
