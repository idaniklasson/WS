<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleWebService1SoapProxyid" scope="session" class="grupp14.ics.lu.se.WebService1SoapProxy" />
<%
	if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleWebService1SoapProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
	String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleWebService1SoapProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp%>
<%
	}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
%>
        <%=tempResultreturnp3%>
        <%
        	}
        break;
        case 5:
                gotMethod = true;
                String endpoint_0id=  request.getParameter("endpoint8");
                    java.lang.String endpoint_0idTemp = null;
                if(!endpoint_0id.equals("")){
                 endpoint_0idTemp  = endpoint_0id;
                }
                sampleWebService1SoapProxyid.setEndpoint(endpoint_0idTemp);
        break;
        case 10:
                gotMethod = true;
                grupp14.ics.lu.se.WebService1Soap getWebService1Soap10mtemp = sampleWebService1SoapProxyid.getWebService1Soap();
        if(getWebService1Soap10mtemp == null){
        %>
<%=getWebService1Soap10mtemp %>
<%
}else{
        if(getWebService1Soap10mtemp!= null){
        String tempreturnp11 = getWebService1Soap10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String fileName_1id=  request.getParameter("fileName16");
            java.lang.String fileName_1idTemp = null;
        if(!fileName_1id.equals("")){
         fileName_1idTemp  = fileName_1id;
        }
        java.lang.String readFile13mtemp = sampleWebService1SoapProxyid.readFile(fileName_1idTemp);
if(readFile13mtemp == null){
%>
<%=readFile13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(readFile13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>