/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-07 12:45:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class secession_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>secession</title>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".col-xs-12 {\r\n");
      out.write("	border: 1px solid gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("a:hover{\r\n");
      out.write("text-decoration : none;\r\n");
      out.write("color : black;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#cancel-btn {\r\n");
      out.write("	background-color: #A66129;\r\n");
      out.write("	color: white;\r\n");
      out.write("	font-size: medium;\r\n");
      out.write("	width: 40%;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	margin-top :0;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#secession-btn {\r\n");
      out.write("	background-color: gray;\r\n");
      out.write("	opacity: 0.7;\r\n");
      out.write("	color: black;\r\n");
      out.write("	font-size: medium;\r\n");
      out.write("	width: 40%;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	margin-left : 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#classform{\r\n");
      out.write("	margin-left:15%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\" id=\"content-main\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row my-5\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-sm-offset-2 col-sm-8\" id=\"classform\">\r\n");
      out.write("				<h4>회원 탈퇴 신청</h4>\r\n");
      out.write("				<p>회원 탈퇴 신청에 앞서 아래 내용을 반드시 확인해주세요.</p>\r\n");
      out.write("				<form method=\"POST\" action=\"secession\" onsubmit=\"return secessionValidate();\" class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("					<div class=\"bg-white rounded shadow-sm container p-3\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"panel panel-default\">\r\n");
      out.write("\r\n");
      out.write("							<div class=\"panel-body\">\r\n");
      out.write("								<div class=\"form-group pull-left\">\r\n");
      out.write("									<label class=\"control-label\"> 회원 탈퇴 약관 </label>\r\n");
      out.write("									<div class=\"col-xs-12\">\r\n");
      out.write("										<textarea class=\"form-control\" readonly rows=\"10\" cols=\"100\">\r\n");
      out.write("제1조\r\n");
      out.write("이 약관은 샘플 약관입니다.\r\n");
      out.write("\r\n");
      out.write("① 약관 내용 1\r\n");
      out.write("\r\n");
      out.write("② 약관 내용 2\r\n");
      out.write("\r\n");
      out.write("③ 약관 내용 3\r\n");
      out.write("\r\n");
      out.write("④ 약관 내용 4\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제2조\r\n");
      out.write("이 약관은 샘플 약관입니다.\r\n");
      out.write("\r\n");
      out.write("① 약관 내용 1\r\n");
      out.write("\r\n");
      out.write("② 약관 내용 2\r\n");
      out.write("\r\n");
      out.write("③ 약관 내용 3\r\n");
      out.write("\r\n");
      out.write("④ 약관 내용 4\r\n");
      out.write("</textarea>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"checkbox pull-right\">\r\n");
      out.write("										<div class=\"custom-checkbox\">\r\n");
      out.write("											<div class=\"form-check\">\r\n");
      out.write("												<input type=\"checkbox\" name=\"agree\" id=\"agree\" class=\"form-check-input custom-control-input\" required> <br> <label class=\"form-check-label custom-control-label\" for=\"agree\">위 내용을 모두 확인하였습니다. </label>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<br>\r\n");
      out.write("				<div class=\"bg-white rounded shadow-sm container p-3\">\r\n");
      out.write("					<p>여기우리 여행우리 커뮤니티에서 탈퇴하려는 이유가 무엇인가요? (복수 선택 가능)</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"panel panel-default\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"panel-body\">\r\n");
      out.write("							<div class=\"form-group pull-left\">\r\n");
      out.write("\r\n");
      out.write("								<div class=\"col-xs-12\">\r\n");
      out.write("								 	&nbsp;<input type=\"checkbox\" id=\"reason1\" name=\"reason\"> <label for=\"reason1\" >이유1</label> <br> \r\n");
      out.write("								    &nbsp;<input type=\"checkbox\" id=\"reason2\" name=\"reason\"> <label for=\"reason2\">이유2</label> <br>\r\n");
      out.write("									&nbsp;<input type=\"checkbox\" id=\"reason3\" name=\"reason\"> <label for=\"reason3\">이유3</label> <br> \r\n");
      out.write("									&nbsp;<input type=\"checkbox\" id=\"reason4\" name=\"reason\"> <label for=\"reason4\">이유4</label> <br> \r\n");
      out.write("									&nbsp;<input type=\"checkbox\" id=\"reason5\" name=\"reason\"> <label for=\"reason5\">이유5</label> <br> \r\n");
      out.write("									&nbsp;<input type=\"checkbox\" id=\"reason6\" name=\"reason\"> <label for=\"reason6\">이유6</label> <br> \r\n");
      out.write("									&nbsp;<input type=\"checkbox\" id=\"reason7\" name=\"reason\"> <label for=\"reason7\">이유7</label> <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"checkbox pull-right\">\r\n");
      out.write("									<div class=\"custom-checkbox\">\r\n");
      out.write("										<div class=\"form-check\"></div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<br>\r\n");
      out.write("\r\n");
      out.write("				<button class=\"btn btn-sm btn-block\" id=\"secession-btn\" type=\"submit\">탈퇴 신청</button>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				<a class=\"btn btn-sm btn-block\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/updateMyPage\" id=\"cancel-btn\" >취소하기</a>\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		function secessionValidate(){\r\n");
      out.write("\r\n");
      out.write("		   if( $(\"input[name='reason']:checked\").length == 0){\r\n");
      out.write("		      alert(\"이유를 선택해주세요\");\r\n");
      out.write("		      return false;\r\n");
      out.write("		   }\r\n");
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
