<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<body>
	<f:view>
		<h:form>
			<h:panelGrid columns="3">
				<h:outputText value="Salário:" />
				<h:inputText id="salario" value="#{exemploValidador.salario}"
					required="true"
					validatorMessage="O salário deve ser maior que 1,00">
					<f:validateDoubleRange minimum="1" />
					<f:convertNumber pattern="###,##0.00" />
				</h:inputText>
				<h:message for="salario" />
				<h:outputText value="Porcentagem aumento:" />
				<h:inputText id="aumento" value="#{exemploValidador.porcentagem}"
					required="true"
					validatorMessage="A porcentagem deve estar entre 0 e 1">
					<f:validateDoubleRange minimum="0" maximum="1" />
					<f:convertNumber pattern="0.00" />
				</h:inputText>
				<h:message for="aumento" />
				<h:commandButton
					actionListener="#{exemploValidador.calcularAumento}"
					value="calcular" />
				<h:commandButton actionListener="#{exemploValidador.zerarCampos}"
					value="zerar" immediate="true" />
				<h:outputText />
				<h:outputText value="Aumento:" />
				<h:outputText value="#{exemploValidador.aumento}" />
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>