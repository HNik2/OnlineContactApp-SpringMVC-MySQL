/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-04 09:42:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
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
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/view/include/menu.jsp(3,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userId==null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("<head>\r\n");
        out.write("<style>\r\n");
        out.write("ul {\r\n");
        out.write("    list-style-type: none;\r\n");
        out.write("    margin: 0;\r\n");
        out.write("    padding: 0;\r\n");
        out.write("    overflow: hidden;\r\n");
        out.write("    background-color: #333;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li {\r\n");
        out.write("    float: left;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li a {\r\n");
        out.write("    display: inline-block;\r\n");
        out.write("    color: white;\r\n");
        out.write("    text-align: center;\r\n");
        out.write("    padding: 14px 16px;\r\n");
        out.write("    text-decoration: none;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li a:hover {\r\n");
        out.write("    background-color: #111;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write(".active {\r\n");
        out.write("    background-color: red;\r\n");
        out.write("}\r\n");
        out.write("</style>\r\n");
        out.write("</head>\r\n");
        out.write("<body>\r\n");
        out.write("\r\n");
        out.write("<ul>\r\n");
        out.write("  <li><a href=\"/index\" class=\"active\">Home</a></li>\r\n");
        out.write("  <li><a href=\"/index\">LogIn</a></li>\r\n");
        out.write("  <li><a href=\"/reg_form\">Register</a></li>\r\n");
        out.write("  <li><a href=\"#about\">About</a></li>\r\n");
        out.write("  <li><a href=\"#about\">Help</a></li>\r\n");
        out.write("</ul>\r\n");
        out.write("\r\n");
        out.write("</body>\r\n");
        out.write("</html>\r\n");
        out.write("\t\r\n");
        out.write("\t<!-- <b> <a href=\"/index\">Home</a> | <a href=\"/index\">LogIn</a> | <a\r\n");
        out.write("\t\thref=\"/reg_form\">Register</a> | <a href=\"#\">About</a> | <a href=\"#\">Help</a>\r\n");
        out.write("\t</b> -->\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/view/include/menu.jsp(55,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.role==1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<!-- User Menu -->\r\n");
        out.write("\t<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("<head>\r\n");
        out.write("<style>\r\n");
        out.write("ul {\r\n");
        out.write("    list-style-type: none;\r\n");
        out.write("    margin: 0;\r\n");
        out.write("    padding: 0;\r\n");
        out.write("    overflow: hidden;\r\n");
        out.write("    background-color: #333;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li {\r\n");
        out.write("    float: left;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li a {\r\n");
        out.write("    display: inline-block;\r\n");
        out.write("    color: white;\r\n");
        out.write("    text-align: center;\r\n");
        out.write("    padding: 14px 16px;\r\n");
        out.write("    text-decoration: none;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li a:hover {\r\n");
        out.write("    background-color: #111;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write(".active {\r\n");
        out.write("    background-color: red;\r\n");
        out.write("}\r\n");
        out.write("</style>\r\n");
        out.write("</head>\r\n");
        out.write("<body>\r\n");
        out.write("\r\n");
        out.write("<ul>\r\n");
        out.write("  <li><a href=\"/user_dashboard\" class=\"active\">Home</a></li>\r\n");
        out.write("  <li><a href=\"/profile\">Profile</a></li>\r\n");
        out.write("  <li><a href=\"/contact_form\">Add Contact</a></li>\r\n");
        out.write("  <li><a href=\"/clist\">Contact List</a></li>\r\n");
        out.write("   <li><a href=\"/logout\">Logout</a></li>\r\n");
        out.write("</ul>\r\n");
        out.write("\r\n");
        out.write("</body>\r\n");
        out.write("</html>\r\n");
        out.write("\t\r\n");
        out.write("\t<!-- <b><a href=\"/user_dashboard\">Home</a> |<a href=\"/profile\">Profile</a>\r\n");
        out.write("\t\t| <a href=\"contact_form\">Add Contact</a> |<a href=\"/clist\">Contact\r\n");
        out.write("\t\t\tList</a> |<a href=\"/logout\">Logout</a> </b> -->\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/view/include/menu.jsp(108,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.role==2}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<!-- Admin Menu -->\r\n");
        out.write("\t<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("<head>\r\n");
        out.write("<style>\r\n");
        out.write("ul {\r\n");
        out.write("    list-style-type: none;\r\n");
        out.write("    margin: 0;\r\n");
        out.write("    padding: 0;\r\n");
        out.write("    overflow: hidden;\r\n");
        out.write("    background-color: #333;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li {\r\n");
        out.write("    float: left;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li a {\r\n");
        out.write("    display: inline-block;\r\n");
        out.write("    color: white;\r\n");
        out.write("    text-align: center;\r\n");
        out.write("    padding: 14px 16px;\r\n");
        out.write("    text-decoration: none;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("li a:hover {\r\n");
        out.write("    background-color: #111;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write(".active {\r\n");
        out.write("    background-color: red;\r\n");
        out.write("}\r\n");
        out.write("</style>\r\n");
        out.write("</head>\r\n");
        out.write("<body>\r\n");
        out.write("\r\n");
        out.write("<ul>\r\n");
        out.write("  <li><a href=\"/admin_dashboard\" class=\"active\">Home</a></li>\r\n");
        out.write("  <li><a href=\"/users_list\">User List</a></li>\r\n");
        out.write("  <li><a href=\"/logout\">Logout</a></li>\r\n");
        out.write("</ul>\r\n");
        out.write("\r\n");
        out.write("</body>\r\n");
        out.write("</html>\r\n");
        out.write("\t\r\n");
        out.write("\t<!-- <b><a href=\"/admin_dashboard\">Home</a> |<a href=\"/users_list\">User\r\n");
        out.write("\t\t\tList</a> |<a href=\"/logout\">Logout</a> </b> -->\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}
