<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<body>
	<f:view>
		<h:form>
			<rich:calendar></rich:calendar>
			<rich:toolBar>
				<rich:dropDownMenu>
					<f:facet name="label">
						<h:outputText value="Arquivo" />
					</f:facet>
					<rich:menuItem value="Novo" />
					<rich:menuItem value="Salvar..." />
					<rich:menuItem value="Fechar" />
				</rich:dropDownMenu>
				<rich:dropDownMenu>
					<f:facet name="label">
						<h:outputText value="Relatorio" />
					</f:facet>
					<rich:menuItem value="Clientes" />
					<rich:menuItem value="Fornecedores" />
					<rich:menuItem value="Lançamentos" />
				</rich:dropDownMenu>
			</rich:toolBar>
			<rich:tabPanel>
				<rich:tab label="Aba 1">
					<h:outputText value="Aba 1" />
				</rich:tab>
				<rich:tab label="Aba 2">
					<h:outputText value="Aba 2" />
				</rich:tab>
				<rich:tab label="Aba 3">
					<h:outputText value="Aba 3" />
				</rich:tab>
				<rich:tab label="Aba 4">
					<h:outputText value="Aba 4" />
				</rich:tab>
			</rich:tabPanel>
		</h:form>
	</f:view>
</body>
</html>