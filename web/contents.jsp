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
        <p>${actionBean.report.runNumber}</p>
    </div>
    </s:layout-component>
</s:layout-render>
