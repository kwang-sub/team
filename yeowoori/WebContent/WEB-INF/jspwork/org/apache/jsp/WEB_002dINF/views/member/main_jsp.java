/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-03 16:33:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1623371898000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
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

      out.write("\n");
      out.write("    \n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("	<title>main</title>\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link href='//spoqa.github.io/spoqa-han-sans/css/SpoqaHanSansNeo.css' rel='stylesheet' type='text/css'>\n");
      out.write("</head>\n");
      out.write("	<style>\n");
      out.write("	 	* {  font-family: 'Spoqa Han Sans Neo', 'sans-serif'; }\n");
      out.write("        body{padding-top: 10px;}\n");
      out.write("        a{text-decoration: none; color:black;}\n");
      out.write("        a:hover{text-decoration: none; color:#A66129;}\n");
      out.write("        a:visited{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .jumbotron{\n");
      out.write("            \n");
      out.write("            background-image: url(resources/img/지도-기본.png);\n");
      out.write("            background-size : auto 100% ;\n");
      out.write("           	background-position : center center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-color: white;\n");
      out.write("            \n");
      out.write("            height: 600px;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        .area{\n");
      out.write("            border: 1px rgb(197, 197, 197) solid;\n");
      out.write("        }\n");
      out.write("        .northwest{\n");
      out.write("            width: 150px;\n");
      out.write("            height: 180px;\n");
      out.write("            background-color: white;\n");
      out.write("            position: absolute;\n");
      out.write("            top: 80px;\n");
      out.write("            left: 250px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .northeast{\n");
      out.write("            width: 150px;\n");
      out.write("            height: 130px;\n");
      out.write("            background-color: white;\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0px;\n");
      out.write("            right: 320px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .southwest{\n");
      out.write("            width: 150px;\n");
      out.write("            height: 130px;\n");
      out.write("            background-color: white;\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 80px;\n");
      out.write("            left: 320px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .southeast{\n");
      out.write("            width: 180px;\n");
      out.write("            height: 200px;\n");
      out.write("            background-color: white;\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 30px;\n");
      out.write("            right: 200px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .content{\n");
      out.write("            margin-left: 10px;\n");
      out.write("        }\n");
      out.write("        @media(max-width: 1300px) { \n");
      out.write("            .northwest{\n");
      out.write("                top: 80px;\n");
      out.write("                left: 140px;\n");
      out.write("            }\n");
      out.write("            .northeast{\n");
      out.write("                top: 20px;\n");
      out.write("                right: 160px;\n");
      out.write("            }\n");
      out.write("            .southwest{\n");
      out.write("                bottom: 80px;\n");
      out.write("                left: 140px;\n");
      out.write("            }\n");
      out.write("            .southeast{\n");
      out.write("            bottom: 30px;\n");
      out.write("            right: 150px;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        @media(max-width: 730px) { \n");
      out.write("           \n");
      out.write("            .northwest{\n");
      out.write("                top:30px;\n");
      out.write("                left: 50px;\n");
      out.write("            }\n");
      out.write("            .northeast{\n");
      out.write("                top: 0px;\n");
      out.write("                right: 20px;\n");
      out.write("            }\n");
      out.write("            .southwest{\n");
      out.write("                bottom: 80px;\n");
      out.write("                left: 50px;\n");
      out.write("            }\n");
      out.write("            .southeast{\n");
      out.write("            bottom: 30px;\n");
      out.write("            right: 40px;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("<body>\n");
      out.write("	<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/homeBoard\">\n");
      out.write("		<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/logo.png\" style=\"width:150px; margin-top:60px; margin-left : 120px;\">\n");
      out.write("	</a>\n");
      out.write("	<div style=\"display:inline-block; position:absolute; top:90px; line-height: 2; margin-left : 30px; color:grey;\">\n");
      out.write("	    	지역을 선택해주세요.\n");
      out.write("	</div>\n");
      out.write("    \n");
      out.write(" <div class=\"row\">\n");
      out.write("    <div class=\"col-1\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-10 jumbotron jumbotron-fluid con\" id=\"jumbotron\">\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/homeBoard?area=1\" style=\"color:black;\">\n");
      out.write("            <div class=\"area northwest\" id=\"northwest\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>서북</h3>\n");
      out.write("                    <p style=\"font-size: 12px;\">\n");
      out.write("                        연남동, 망원/서교, 홍대,<br>\n");
      out.write("                        연희, 합정, 은평구, <br>공덕역,상수, 상암, 이대, <br>\n");
      out.write("                        신수동, 신촌, 독립문<br><br><br>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/homeBoard?area=4\" style=\"color:black;\">\n");
      out.write("            <div class=\"area northeast\" id=\"northeast\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>동북</h3>\n");
      out.write("                    <p style=\"font-size: 12px;\">\n");
      out.write("                        성수, 성북구, 건대<br>\n");
      out.write("                        동대문, 옥수, 왕십리\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/homeBoard?area=2\" style=\"color:black;\">\n");
      out.write("            <div class=\"area southwest\" id=\"southwest\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>서남</h3>\n");
      out.write("                    <p style=\"font-size: 12px;\">\n");
      out.write("                        문래동, 여의도, 영등포,<br>\n");
      out.write("                        구로, 마곡\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/homeBoard?area=3\" style=\"color:black;\">\n");
      out.write("            <div class=\"area southeast\" id=\"southeast\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>동남</h3>\n");
      out.write("                    <p style=\"font-size: 12px;\">\n");
      out.write("                        압구정, 청담, 가로수길, 잠실,<br>\n");
      out.write("                        송리단길, 삼성역, 강동구, <br>\n");
      out.write("                        논현, 역삼동, 강남역,<br>\n");
      out.write("                        고속터미널, 양재 ,장원, <br>\n");
      out.write("                        서래마을, 대치동\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-1\">\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("\n");
      out.write("            const northwest = document.getElementById(\"northwest\");\n");
      out.write("            const northeast = document.getElementById(\"northeast\");\n");
      out.write("            const southwest = document.getElementById(\"southwest\");\n");
      out.write("            const southeast = document.getElementById(\"southeast\");\n");
      out.write("            const jumbotron =  document.getElementById(\"jumbotron\");\n");
      out.write("            northwest.addEventListener(\"mouseover\",function(){\n");
      out.write("                $(\"#jumbotron\").css(\"background-image\" , \"url(resources/img/지도-서북.png)\");\n");
      out.write("            });\n");
      out.write("            northwest.addEventListener(\"mouseout\",function(){\n");
      out.write("                $(\"#jumbotron\").css(\"background-image\" , \"url(resources/img/지도-기본.png)\");\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("            northeast.addEventListener(\"mouseover\",function(){\n");
      out.write("                $(\"#jumbotron\").css(\"background-image\" , \"url(resources/img/지도-동북.png)\");\n");
      out.write("            });\n");
      out.write("            northeast.addEventListener(\"mouseout\",function(){\n");
      out.write("                $(\"#jumbotron\").css(\"background-image\" , \"url(resources/img/지도-기본.png)\");\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("            southwest.addEventListener(\"mouseover\",function(){\n");
      out.write("                $(\"#jumbotron\").css(\"background-image\" , \"url(resources/img/지도-서남.png)\");\n");
      out.write("            });\n");
      out.write("            southwest.addEventListener(\"mouseout\",function(){\n");
      out.write("                $(\"#jumbotron\").css(\"background-image\" , \"url(resources/img/지도-기본.png)\");\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            southeast.addEventListener(\"mouseover\",function(){\n");
      out.write("                $(\"#jumbotron\").css(\"background-image\" , \"url(resources/img/지도-동남.png)\");\n");
      out.write("            });\n");
      out.write("            southeast.addEventListener(\"mouseout\",function(){\n");
      out.write("                $(\"#jumbotron\").css(\"background-image\" , \"url(resources/img/지도-기본.png)\");\n");
      out.write("            });\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/member/main.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/member/main.jsp(4,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setScope("application");
      // /WEB-INF/views/member/main.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/member/main.jsp(4,0) '${pageContext.servletContext.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.servletContext.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
