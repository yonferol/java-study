package com.yonferol.java.web;
import javax.servlet.*;
import javax.security.sasl.SaslException;
import javax.xml.soap.SOAPPart;
import java.io.IOException;

/**
 * Created by wangy on 2016/10/27.
 */
public class Test1 implements Servlet {
    //初始化Servlet,把Servlet装载到内存中，只被调用一次
    public void init(ServletConfig config)
        throws ServletException{

    }

    //得到ServletConfig对象
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //服务函数，业务逻辑代码写在里边，该函数每次都会被调用
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       System.out.println("aaa");
    }

    //得到配置信息
    @Override
    public String getServletInfo() {
        return null;
    }

    //销毁该Servlet
    @Override
    public void destroy() {

    }
}
