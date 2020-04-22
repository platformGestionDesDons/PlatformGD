<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="__header.jsp" %>
<%-- <%@ include file="menu_1.jsp"%> --%>
<section class="page-section light-bg">
<div class="container">	

 <a href="ajoutBesoin"
			class="btn btn-success">Ajouter besoin</a>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Besoin</th>
      <th scope="col">Quantite totale</th>
      <th scope="col">Quantite restante</th>
      <th scope="col">Etat</th>
      <th scope="col">Date</th>
      <th scope="col">Priorité</th> 
    </tr>
  </thead>
  <tbody>
<c:forEach var="besoin" items="${ListBesoins}">			
    <tr >
      <td><a href="besoin?idBesoin=${besoin.getIdBesoin()}">${besoin.getProduit().getLibelle() } </a> </td>    
      <td><c:out value="${besoin.getQuantiteInitiale()} ${besoin.getProduit().getUniteDeMesure().getIdUnite()}"></c:out></td>
      <td><c:out value="${besoin.getQuantiteRestante()} ${besoin.getProduit().getUniteDeMesure().getIdUnite()}"></c:out></td>
      <td><c:out value="${besoin.getEtat()}"></c:out></td>
      <td><c:out value="${besoin.getDateBesoin()}"></c:out></td>
      <td><c:out value="${besoin.getPriorite()}"></c:out></td>
      <td><a href="besoin?idBesoin=${besoin.getIdBesoin()}" class="btn btn-default btn-sm" role="button" id="consulter">Consulter</a> </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
	</div>

</section>
<%@ include file="__footer.jsp"%>