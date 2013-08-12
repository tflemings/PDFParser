<%-- 
    Document   : index
    Created on : Aug 10, 2013, 11:43:42 PM
    Author     : Tony
--%>

<%@ include file="taglibs.jsp"%>
<s:layout-render name="/layout_main.jsp" title="Home">
    <s:layout-component name="body">
        <s:messages/>
    <div class="body">
        <s:form beanclass="com.pdfparse.action.PdfActionBean">
            <s:file name="pdfName"/>
            <s:submit name="submit" id="submit" value="Parse"/>
        </s:form>
        <p>${actionBean.contents}</p>
    </div>
    </s:layout-component>
</s:layout-render>
