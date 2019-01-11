<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
	<h:form>
		<h:panelGrid columns="2">
			<h:outputText value="Data inicial:" />
			<h:inputText value="#{exemploConversor.data1}">
				<f:convertDateTime pattern="dd/MM/yyyy" />
			</h:inputText>
			<h:outputText value="Data Final:" />
			<h:inputText value="#{exemploConversor.data2}">
				<f:convertDateTime pattern="dd/MM/yyyy" />
			</h:inputText>
			<h:commandButton
				actionListener="#{exemploConversor.calcularDiferenca}"
				value="calcular" />
			<h:outputText 
				value="Diferença:
				#{exemploConversor.diferenca}" />
		</h:panelGrid>
	</h:form>
</f:view>