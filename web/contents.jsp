<%-- 
    Document   : contents
    Created on : Aug 13, 2013, 9:54:32 AM
    Author     : Tony
--%>

<%@ include file="taglibs.jsp"%>
<s:layout-render name="/layout_main.jsp" title="Home">
    <s:layout-component name="body">
        <s:messages/>
    <div class="body">
        <c:forEach var="line" items="${actionBean.lines}">
            <p>${line}</p>
        </c:forEach>
    </div>
    </s:layout-component>
</s:layout-render>
