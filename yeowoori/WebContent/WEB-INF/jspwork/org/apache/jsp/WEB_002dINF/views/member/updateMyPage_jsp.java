/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-07 09:09:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateMyPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>updateMyPage</title>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("<style>\r\n");
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
      out.write(".category-btn>a {\r\n");
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
      out.write("#update-btn {\r\n");
      out.write("	background-color: #A66129;\r\n");
      out.write("	color: white;\r\n");
      out.write("	font-size: medium;\r\n");
      out.write("	width: 40%;\r\n");
      out.write("	/* margin-left: 10%; */\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-email {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	width: 46%;\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("	float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#email-at {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 8%;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	line-height: 38px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h6 {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h4 {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("	width: 66%;\r\n");
      out.write("	/* margin-left: 0; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("	font-size: 11px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*#update{\r\n");
      out.write("            margin-left: 6%;\r\n");
      out.write("        }*/\r\n");
      out.write("#female {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#male {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#updateForm>div {\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".session-btn {\r\n");
      out.write("	float: right;\r\n");
      out.write("	color: gray;\r\n");
      out.write("	opacity: 0.7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#fileArea {\r\n");
      out.write("	display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardImg {\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	width: 200px;\r\n");
      out.write("	height: 200px;\r\n");
      out.write("	border: 1px solid #ced4da;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardImg>img {\r\n");
      out.write("	max-width: 100%;\r\n");
      out.write("	max-height: 100%;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	top: 0;\r\n");
      out.write("	bottom: 0;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	right: 0;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\" id=\"content-main\">\r\n");
      out.write("		<div class=\"category-btn\">\r\n");
      out.write("			<div style=\"padding: 10px;\"></div>\r\n");
      out.write("			<h6 style=\"display: inline-block; font-weight: bold;\">설정</h6>\r\n");
      out.write("			<a class=\"btn btn-light category-selected\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/updateMyPage\">내 정보 수정</a> <a class=\"btn btn-light category-unselected\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/changePwd\">비밀번호 변경</a>\r\n");
      out.write("			<hr align=\"center\" style=\"border: solid #b6957c; border-width: 1px 0px 0px 0px; width: 100%\">\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row my-5\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-md-8 offset-md-2\">\r\n");
      out.write("				<h4 id=\"update\" style=\"margin-left: 18%;\">내 정보 수정</h4>\r\n");
      out.write("				<a class=\"session-btn\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/secession\">탈퇴하기</a>\r\n");
      out.write("				<div class=\"bg-white rounded shadow-sm container p-3\">\r\n");
      out.write("					<form method=\"POST\" action=\"updateMyPage\" onsubmit=\"return updateMyPageValidate();\" \r\n");
      out.write("					 	enctype=\"multipart/form-data\" class=\"form-horizontal\" role=\"form\" id=\"updateForm\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div class=\"row my-6 form-row\">\r\n");
      out.write("							<div class=\"col-md-2 offset-md-2\">\r\n");
      out.write("								<h6>아이디</h6>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-6\">\r\n");
      out.write("								<h5 id=\"id\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"row my-6 form-row\">\r\n");
      out.write("							<div class=\"col-md-2 offset-md-2\">\r\n");
      out.write("								<h6>닉네임</h6>\r\n");
      out.write("								<p>*필수항목</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-6\">\r\n");
      out.write("								<input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberNickname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"nickname\" name=\"nickname\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row my-6 form-row\">\r\n");
      out.write("							<div class=\"col-md-2 offset-md-2\">\r\n");
      out.write("								<h6>이메일</h6>\r\n");
      out.write("								<p>*필수항목</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-6\">\r\n");
      out.write("								<h5 id=\"email\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberEmail }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div class=\"row my-6 form-row\">\r\n");
      out.write("							<div class=\"col-md-2 offset-md-2\">\r\n");
      out.write("								<h6>프로필 이미지</h6>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mr-2 boardImg\" id=\"contentImgArea1\">\r\n");
      out.write("								<img id=\"contentImg1\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberProfile}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div id=\"fileArea\">\r\n");
      out.write("							<input type=\"file\" id=\"img0\" name=\"img0\" onchange=\"LoadImg(this,0)\">\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"row my-6 form-row\">\r\n");
      out.write("							<div class=\"col-md-2 offset-md-2\">\r\n");
      out.write("								<h6>한줄 소개</h6>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-6\">\r\n");
      out.write("								<input type=\"text \" class=\"form-control\" id=\"intro\" name=\"intro\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberContent }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row my-6 form-row\">\r\n");
      out.write("							<hr>\r\n");
      out.write("							<button class=\"btn btn-lg btn-block\" type=\"submit\" id=\"update-btn\">내 정보 수정</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		//닉네임 유효성 검사\r\n");
      out.write("		function updateMyPageValidate() {\r\n");
      out.write("			const regExp = /^[가-힣]{2,15}$/;\r\n");
      out.write("\r\n");
      out.write("			const nickname = $(\"#nickname\").val().trim();\r\n");
      out.write("\r\n");
      out.write("			if (!regExp.test(nickname)) {\r\n");
      out.write("				swal({\r\n");
      out.write("					\"icon\" : \"warning\",\r\n");
      out.write("					\"title\" : \"닉네임이 유효하지 않습니다.\",\r\n");
      out.write("					\"text\" : \"한글 2~15자리이내로 작성해주세요.\"\r\n");
      out.write("				});\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			// 한줄 소개 검사  \r\n");
      out.write("			//const regExp1 =  /^[\\w]{1,20}$/;\r\n");
      out.write("\r\n");
      out.write("			const intro = $(\"#intro\").val().trim();\r\n");
      out.write("\r\n");
      out.write("			//if(!regExp1.test(intro)){\r\n");
      out.write("			if (intro.length > 21) {\r\n");
      out.write("				swal({\r\n");
      out.write("					\"icon\" : \"warning\",\r\n");
      out.write("					\"title\" : \"한줄소개가 유효하지 않습니다.\",\r\n");
      out.write("					\"text\" : \"1~20자리이내로 작성해주세요.\"\r\n");
      out.write("				});\r\n");
      out.write("				return false;\r\n");
      out.write("\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		// 이미지 영역을 클릭할 때 파일 첨부 창이 뜨도록 설정하는 함수\r\n");
      out.write("		$(function() {\r\n");
      out.write("			$(\".boardImg\").on(\"click\", function() {\r\n");
      out.write("				var index = $(\".boardImg\").index(this);\r\n");
      out.write("				$(\"#img\" + index).click();\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		// 각각의 영역에 파일을 첨부 했을 경우 미리 보기가 가능하도록 하는 함수\r\n");
      out.write("		function LoadImg(value, num) {\r\n");
      out.write("			if (value.files && value.files[0]) {\r\n");
      out.write("				var reader = new FileReader();\r\n");
      out.write("				// 자바스크립트 FileReader\r\n");
      out.write("				// 웹 애플리케이션이 비동기적으로 데이터를 읽기 위하여 읽을 파일을 가리키는 File 혹은 Blob객체를 이용해 파일의 내용을 읽고 사용자의 컴퓨터에 저장하는 것을 가능하게 해주는 객체\r\n");
      out.write("\r\n");
      out.write("				reader.readAsDataURL(value.files[0]);\r\n");
      out.write("				// FileReader.readAsDataURL()\r\n");
      out.write("				// 지정된의 내용을 읽기 시작합니다. Blob완료되면 result속성 data:에 파일 데이터를 나타내는 URL이 포함 됩니다.\r\n");
      out.write("\r\n");
      out.write("				// FileReader.onload\r\n");
      out.write("				// load 이벤트의 핸들러. 이 이벤트는 읽기 동작이 성공적으로 완료 되었을 때마다 발생합니다.\r\n");
      out.write("				reader.onload = function(e) {\r\n");
      out.write("					//console.log(e.target.result);\r\n");
      out.write("					// e.target.result\r\n");
      out.write("					// -> 파일 읽기 동작을 성공한 객체에(fileTag) 올라간 결과(이미지 또는 파일)\r\n");
      out.write("\r\n");
      out.write("					$(\".boardImg\").eq(num).children(\"img\").attr(\"src\",\r\n");
      out.write("							e.target.result);\r\n");
      out.write("				}\r\n");
      out.write("\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
