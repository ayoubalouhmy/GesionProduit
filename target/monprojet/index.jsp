

<%@ page import="com.example.entity.Entity.Produit" %>

<html>
<body>

    <h2>Gestion produit</h2>

    <%
        Produit produit =
            (Produit) request.getAttribute("produit");
    %>

    Nom : <%= produit.getName()  %>
    Prix : <%= produit.getPrix() %>


</body>
</html>
