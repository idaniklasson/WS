<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleWebService1SoapProxyid" scope="session" class="se.lu.ics.grupp14.WebService1SoapProxy" />
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
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
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
        se.lu.ics.grupp14.WebService1Soap getWebService1Soap10mtemp = sampleWebService1SoapProxyid.getWebService1Soap();
if(getWebService1Soap10mtemp == null){
%>
<%=getWebService1Soap10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 17:
        gotMethod = true;
        String fileName_1id=  request.getParameter("fileName20");
            java.lang.String fileName_1idTemp = null;
        if(!fileName_1id.equals("")){
         fileName_1idTemp  = fileName_1id;
        }
        java.lang.String readFile17mtemp = sampleWebService1SoapProxyid.readFile(fileName_1idTemp);
if(readFile17mtemp == null){
%>
<%=readFile17mtemp %>
<%
}else{
        String tempResultreturnp18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(readFile17mtemp));
        %>
        <%= tempResultreturnp18 %>
        <%
}
break;
case 22:
        gotMethod = true;
        java.lang.String[] returnFiles22mtemp = sampleWebService1SoapProxyid.returnFiles();
if(returnFiles22mtemp == null){
%>
<%=returnFiles22mtemp %>
<%
}else{
        String tempreturnp23 = null;
        if(returnFiles22mtemp != null){
        java.util.List listreturnp23= java.util.Arrays.asList(returnFiles22mtemp);
        tempreturnp23 = listreturnp23.toString();
        }
        %>
        <%=tempreturnp23%>
        <%
}
break;
case 25:
        gotMethod = true;
        se.lu.ics.grupp14.GetAstronautsResponseGetAstronautsResult getAstronauts25mtemp = sampleWebService1SoapProxyid.getAstronauts();
if(getAstronauts25mtemp == null){
%>
<%=getAstronauts25mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">_any:</TD>
<TD>
<%
if(getAstronauts25mtemp != null){
org.apache.axis.message.MessageElement[] type_any28 = getAstronauts25mtemp.get_any();
        String temp_any28 = null;
        if(type_any28 != null){
        java.util.List list_any28= java.util.Arrays.asList(type_any28);
        temp_any28 = list_any28.toString();
        }
        %>
        <%=temp_any28%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 30:
        gotMethod = true;
        se.lu.ics.grupp14.Astronaut[] readAstronaut30mtemp = sampleWebService1SoapProxyid.readAstronaut();
if(readAstronaut30mtemp == null){
%>
<%=readAstronaut30mtemp %>
<%
}else{
        String tempreturnp31 = null;
        if(readAstronaut30mtemp != null){
        java.util.List listreturnp31= java.util.Arrays.asList(readAstronaut30mtemp);
        tempreturnp31 = listreturnp31.toString();
        }
        %>
        <%=tempreturnp31%>
        <%
}
break;
case 33:
        gotMethod = true;
        se.lu.ics.grupp14.Spaceship[] readSpaceship33mtemp = sampleWebService1SoapProxyid.readSpaceship();
if(readSpaceship33mtemp == null){
%>
<%=readSpaceship33mtemp %>
<%
}else{
        String tempreturnp34 = null;
        if(readSpaceship33mtemp != null){
        java.util.List listreturnp34= java.util.Arrays.asList(readSpaceship33mtemp);
        tempreturnp34 = listreturnp34.toString();
        }
        %>
        <%=tempreturnp34%>
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