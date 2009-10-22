<%@taglib uri="http://richfaces.ajax4jsf.org/rich" prefix="richfaces"%><%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
<a4j:page pageTitle="Bem Vindo ao SysManager" format="html">
  <f:facet name="head">
            <!--...Head Content here-->
            <link href="css/estilo.css" rel="stylesheet" type="text/css" />
        </f:facet>

	<div id="corpo">
	<rich:panel header="Bem Vindo ao SysManager">
		<h:panelGrid width="100%" columns="2">
			<h:graphicImage url="/images/login.jpg" />
			<a4j:form>
			<div align="left">
				<div align="left">Login*:</div>
				<h:inputText  required="true" maxlength="20" size="30" />
					<richfaces:separator lineType="none" height="12"/>
				<div align="left">Senha*:</div> 
				<h:inputSecret required="true" maxlength="8" size="30" />
					<richfaces:separator lineType="none" height="12"/>
				
					<h:commandLink value="Entrar" />
					<richfaces:spacer width="35%"/>
					<h:commandLink value="Esqueci a senha" />
				
			</div>
			</a4j:form>
		</h:panelGrid>
	</rich:panel>
	</div>
</a4j:page>
</f:view>
