/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-07 12:42:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changePwd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1623371898000L));
    _jspx_dependants.put("jar:file:/Users/macbook/git/team/yeowoori/WebContent/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/Users/macbook/git/team/yeowoori/WebContent/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>비밀번호 변경</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#btn-change {\r\n");
      out.write("	background-color: #A66129;\r\n");
      out.write("	color: white;\r\n");
      out.write("	font-size: medium;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("	font-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("	font-family: 'Spoqa Han Sans Neo', 'sans-serif';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".category-selected {\r\n");
      out.write("	background-color: #A66129;\r\n");
      out.write("	color: white !important;\r\n");
      out.write("	font-weight: 500;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".category-unselected {\r\n");
      out.write("	color: #A66129 !important;\r\n");
      out.write("	font-weight: 500;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".category-btn> a {\r\n");
      out.write("	margin-left: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".category-btn {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding-right: 15px;\r\n");
      out.write("	padding-left: 15px;\r\n");
      out.write("	margin-right: auto;\r\n");
      out.write("	margin-left: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#h4-change {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\" id=\"content-main\">\r\n");
      out.write("\r\n");
      out.write("	<div class=\"category-btn\">\r\n");
      out.write("		<div style=\"padding: 10px;\"></div>\r\n");
      out.write("		<h6 style=\"display: inline-block; font-weight: bold;\">설정</h6>\r\n");
      out.write("			<a class=\"btn btn-light category-unselected\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/updateMyPage\">내 정보 수정</a>\r\n");
      out.write("			<a class=\"btn btn-light category-selected\"  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/changePwd\">비밀번호 변경</a>\r\n");
      out.write("		<hr align=\"center\"\r\n");
      out.write("			style=\"border: solid #b6957c; border-width: 1px 0px 0px 0px; width: 100%\">\r\n");
      out.write("		<div style=\"padding: 20px\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row my-5\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\r\n");
      out.write("				<h4 id=\"h4-change\">&nbsp; 비밀번호 변경</h4>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"bg-white rounded shadow-sm container p-3\">\r\n");
      out.write("					<form method=\"POST\" action=\"changePwd\"\r\n");
      out.write("						onsubmit=\"return pwdValidate();\" class=\"form-horizontal\"\r\n");
      out.write("						role=\"form\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div>\r\n");
      out.write("							<label for=\"pwd1\">현재 비밀번호</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row mb-3 form-row\">\r\n");
      out.write("							<input type=\"password\" class=\"form-control\" id=\"currentpwd\"\r\n");
      out.write("								name=\"currentPwd\" maxlength=\"20\" required>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("							<span>&nbsp;</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div>\r\n");
      out.write("							<label for=\"pwd1\">새 비밀번호</label>\r\n");
      out.write("							<p>영어 소문자, 대문자, 특수문자 포함(8~12자)</p>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row mb-3 form-row\">\r\n");
      out.write("							<input type=\"password\" class=\"form-control\" id=\"newPwd1\"\r\n");
      out.write("								name=\"newPwd1\" maxlength=\"20\" required>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("							<span>&nbsp;</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div>\r\n");
      out.write("							<label for=\"pwd1\">새 비밀번호 확인</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\" form-row\">\r\n");
      out.write("							<input type=\"password\" class=\"form-control\" id=\"newPwd2\"\r\n");
      out.write("								name=\"newPwd2\" maxlength=\"20\" required>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<hr>\r\n");
      out.write("						<button class=\"btn btn-lg btn-block\" id=\"btn-change\" type=\"submit\">비밀번호\r\n");
      out.write("							변경</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		\r\n");
      out.write("		// 비밀번호 유효성 검사\r\n");
      out.write("		function pwdValidate(){\r\n");
      out.write("			const regExp = /^[a-zA-Z0-9~!@#$%^&*()\\-\\+]{8,12}$/;\r\n");
      out.write("			\r\n");
      out.write("			const Pwd1 = $(\"#Pwd1\").val().trim();\r\n");
      out.write("			const Pwd2 = $(\"#Pwd2\").val().trim();\r\n");
      out.write("\r\n");
      out.write("			// 새비밀번호가 유효하지 않거나\r\n");
      out.write("			// 새비밀번호, 새비밀번호 확인이 같지 않는 경우\r\n");
      out.write("			if(!regExp.test(newPwd1) || (newPwd1 != newPwd2)){\r\n");
      out.write("				\r\n");
      out.write("				swal({\r\n");
      out.write("					\"icon\" : \"error\",\r\n");
      out.write("					\"title\" : \"비밀번호가 유효하지 않습니다.\"\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
