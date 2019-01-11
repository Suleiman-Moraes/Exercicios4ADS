<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h:form>
Parcela 1: <h:inputText value="#{exemplo.numero1}" />
Parcela 2: <h:inputText value="#{exemplo.numero2}" />
			<h:commandButton actionListener="#{exemplo.somar}" value="Somar" />
Soma: <h:inputText value="#{exemplo.soma}" />
		</h:form>
	</f:view>
</body>
</html>