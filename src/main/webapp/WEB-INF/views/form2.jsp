<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h1><spring:message code="super.text"></spring:message></h1>

<form:form modelAttribute="employe">
	<form:input path="nom"/>
	<form:errors path="nom"></form:errors>
	
	<form:input path="prenom"/>
	<form:errors path="prenom"></form:errors>
	
	
	
	<input type="submit" value="Valider">
</form:form>