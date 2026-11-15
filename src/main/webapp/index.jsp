

<%@ page import="com.example.entity.Entity.Produit" %>
<%@ page import="java.util.List" %>

<html>
<body>

    <h2>Gestion produit</h2>

    <%
        List<Produit> produits =(List<Produit>) request.getAttribute("produit");
        for(Produit p : produits){

    %>
        id : <%= p.getId() %>
        nom : <%= p.getName() %>
    <%
    }
    %>




</body>
</html>
