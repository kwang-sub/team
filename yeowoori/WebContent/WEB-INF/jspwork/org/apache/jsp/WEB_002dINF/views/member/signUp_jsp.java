/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-08 12:58:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>회원가입</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\"\n");
      out.write("	integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n");
      out.write("	integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("	integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("/* number 태그 화살표 제거 */\n");
      out.write("input[type=\"number\"]::-webkit-outer-spin-button, input[type=\"number\"]::-webkit-inner-spin-button\n");
      out.write("	{\n");
      out.write("	-webkit-appearance: none;\n");
      out.write("	margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-md-3 p {\n");
      out.write("	font-size: small;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#signUp-btn {\n");
      out.write("	background-color: #A66129;\n");
      out.write("	color: white;\n");
      out.write("	font-size: medium;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("	font-weight: bold;\n");
      out.write("	\n");
      out.write("	\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text-center{\n");
      out.write("height : 700px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#idDupCheck, #nickDupCheck {\n");
      out.write("	background-color: gray;\n");
      out.write("	opacity: 0.7;\n");
      out.write("	color: black;\n");
      out.write("	font-weight: bold;\n");
      out.write("	margin-top : 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#id {\n");
      out.write("	margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#email {\n");
      out.write("	margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("	font-size: 7px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#logo-img {\n");
      out.write("	width: 150px;\n");
      out.write("	margin-left: 10%;\n");
      out.write("	margin-top: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#email1, #email2 {\n");
      out.write("	display: inline-block;\n");
      out.write("	width: 45%;\n");
      out.write("	float: left;\n");
      out.write("	margin-bottom: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#at-sign {\n");
      out.write("	display: inline-block;\n");
      out.write("	box-sizing: border-box;\n");
      out.write("	float: left;\n");
      out.write("	width: 10%;\n");
      out.write("	text-align: center;\n");
      out.write("	font-size: 1.3em;\n");
      out.write("	font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#email>p {\n");
      out.write("	display: inline-block;\n");
      out.write("	width: fit-content;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-row {\n");
      out.write("	margin-left: 2%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<!-- \n");
      out.write("			상대 경로에서 사용하는 기호\n");
      out.write("			(빈칸) : 현재 폴더\n");
      out.write("			/	  : 하위 폴더\n");
      out.write("			..    : 상위 폴더\n");
      out.write("		 -->\n");
      out.write("\n");
      out.write("		<div class=\"py-4 col-md-3 offset-md-3\">\n");
      out.write("			<label for=\"id\">회원가입</label>\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("		<form method=\"POST\" action=\"signUp\" class=\"needs-validation\"\n");
      out.write("			name=\"signUpForm\" onsubmit=\"return validate();\">\n");
      out.write("\n");
      out.write("			<!-- 아이디 -->\n");
      out.write("\n");
      out.write("			<div class=\"col-md-3 offset-md-3\">\n");
      out.write("				<label for=\"id\">아이디</label>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<input type=\"text\" class=\"form-control\" name=\"id\" id=\"id\"\n");
      out.write("					maxlength=\"12\" placeholder=\"아이디\" autocomplete=\"off\" required>\n");
      out.write("				<!-- required : 필수 입력 항목으로 지정 -->\n");
      out.write("				<!-- autocomplete=\"off\" : input 태그 자동완성 기능을 끔 -->\n");
      out.write("\n");
      out.write("				<!-- 팝업창 중복체크 여부 판단을 위한 hidden 타입 요소 -->\n");
      out.write("				<input type=\"hidden\" name=\"idDup\" id=\"idDup\" value=\"false\">\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<!-- ajax 중복검사 시 필요없음 -->\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<button type=\"button\" class=\"btn btn-sm btn-block btn-light\"\n");
      out.write("					id=\"idDupCheck\">아이디 중복검사</button>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("			<div class=\"col-md-6 offset-md-3\">\n");
      out.write("				<span id=\"checkId\">&nbsp;</span>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("			<!-- 비밀번호 -->\n");
      out.write("\n");
      out.write("			<div class=\"col-md-3 offset-md-3\">\n");
      out.write("				<label for=\"pwd1\">비밀번호</label>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<input type=\"password\" class=\"form-control\" id=\"pwd1\" name=\"pwd1\"\n");
      out.write("					maxlength=\"20\" placeholder=\"비밀번호\" required>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<span id=\"checkPwd1\">&nbsp;</span>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("			<!-- 비밀번호 확인 -->\n");
      out.write("\n");
      out.write("			<div class=\"col-md-4 offset-md-3\">\n");
      out.write("				<label for=\"pwd2\">비밀번호 확인</label>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<input type=\"password\" class=\"form-control\" id=\"pwd2\" maxlength=\"20\"\n");
      out.write("					placeholder=\"비밀번호 확인\" required>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<span id=\"checkPwd2\">&nbsp;</span>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("			<!-- 이메일 -->\n");
      out.write("\n");
      out.write("			<div class=\"col-md-9 offset-md-3 \">\n");
      out.write("				<label for=\"email\">Email</label>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("			<div class=\"col-md-5 offset-md-3\" style=\"height:38px;\">\n");
      out.write("					<input type=\"text\" class=\"form-control\" id=\"email1\" name=\"email\" placeholder=\"이메일\" autocomplete=\"off\" required>\n");
      out.write("				 <span id=\"at-sign\" class=\"px-1\">@</span> \n");
      out.write("				 <input type=\"text\" class=\"form-control\" id=\"email2\" name=\"email\" autocomplete=\"off\" required>\n");
      out.write("			</div>\n");
      out.write("			<!--  <div>&nbsp;&nbsp;@</div> -->\n");
      out.write("\n");
      out.write("			<!--  <div class=\"col-md-2\" >\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\"  autocomplete=\"off\" required>\n");
      out.write("        \n");
      out.write("                            </div> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<button type=\"button\" class=\"btn btn-sm btn-block btn-light\">이메일 인증</button>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<span id=\"checkEmail\">&nbsp;</span>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("			<!-- 닉네임 -->\n");
      out.write("			<!-- 팝업창 중복체크 여부 판단을 위한 hidden 타입 요소 -->\n");
      out.write("			<input type=\"hidden\" name=\"nickDup\" id=\"nickDup\" value=\"false\">\n");
      out.write("			<div class=\"col-md-6 offset-md-3\">\n");
      out.write("				<label for=\"nickName\">닉네임</label>\n");
      out.write("				<p>한글 2~15자리로 입력해주세요.</p>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<input type=\"text\" class=\"form-control\" id=\"nickName\"\n");
      out.write("					name=\"nickName\" placeholder=\"닉네임(2-15자)\" required>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<button type=\"button\" class=\"btn btn-sm btn-block btn-light\"\n");
      out.write("					id=\"nickDupCheck\">닉네임 중복검사</button>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<span id=\"checkName\">&nbsp;</span>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"col-md-5 offset-md-3\">\n");
      out.write("				<button class=\"btn btn-lg btn-block\" id=\"signUp-btn\" type=\"submit\">회원가입\n");
      out.write("					완료</button>\n");
      out.write("					 \n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<script>\n");
      out.write("		 // 아이디 중복 검사용 팝업창 오픈\n");
      out.write("		$(\"#idDupCheck\").on(\"click\", function() {\n");
      out.write("			// window.open(\"주소/경로\", \"창 이름\", \"스타일 설정\");\n");
      out.write("			window.open(\"idDupCheck\", \"idDupForm\", \"width=450, height=250\");\n");
      out.write("			// 절대 경로 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/idDupCheck\n");
      out.write("			// 상대 경로 : idDupCheck\n");
      out.write("\n");
      out.write("		});\n");
      out.write("		 \n");
      out.write("		$(\"#nickDupCheck\").on(\"click\", function() {\n");
      out.write("			// window.open(\"주소/경로\", \"창 이름\", \"스타일 설정\");\n");
      out.write("			window.open(\"nickDupCheck\", \"nickDupForm\", \"width=450, height=250\");\n");
      out.write("			// 절대 경로 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/idDupCheck\n");
      out.write("			// 상대 경로 : idDupCheck\n");
      out.write("\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("	</script>\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/member.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
