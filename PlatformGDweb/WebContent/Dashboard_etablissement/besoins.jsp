<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="__header.jsp" %>

<%@ include file="menu_etablissement.jsp"%>
<section class="page-section light-bg">
<div class="container">	
	<h1>Liste des besoins</h1>
 <a href="ajoutBesoin"
			class="btn btn-success">Ajouter besoin</a>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Besoin</th>
      <th scope="col">Quantit� totale</th>
      <th scope="col">Quantit� restante</th>
      <th scope="col">Etat</th>
      <th scope="col">Date cr�ation</th>
      <th scope="col">Priorit�</th> 
    </tr>
  </thead>
  <tbody>
<c:forEach var="besoin" items="${ListBesoins}">			
    <tr >
      <td><c:out value="${besoin.getProduit().getLibelle()}"></c:out></td>    
      <td><c:out value="${besoin.getQuantiteInitiale()} ${besoin.getProduit().getUniteDeMesure().getIdUnite()}"></c:out></td>
      <td><c:out value="${besoin.getQuantiteRestante()} ${besoin.getProduit().getUniteDeMesure().getIdUnite()}"></c:out></td>
      <td><c:out value="${besoin.getEtat()}"></c:out></td>
      <td><fmt:formatDate type = "both"  value = "${besoin.getDateBesoin()}"/></td>
      
      <td><c:out value="${besoin.getPriorite()}"></c:out></td>
      <td><a href="besoin?idBesoin=${besoin.getIdBesoin()}" class="btn btn-default btn-sm" role="button" id="consulter">Consulter</a> </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
	</div>

</section>
<%@ include file="__footer.jsp"%>