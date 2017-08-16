<%@page import="DAO.mapDAO"%>
<%mapDAO m = new mapDAO();%>
<%String lat = m.getLat();%>
<%String lon = m.getLon();%>
{
  
    "lat": "<%=lat%>",
    "lon": "<%=lon%>"
  
  
}


