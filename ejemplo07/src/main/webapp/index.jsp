<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Java jsp ejemplo 07</title>
    <link rel="stylesheet" href="resources/css/main.css" type="text/css">
</head>
<body>
    <header>
        <h1>Convertidor de grados Centigrados a fahrenheit</h1>
    </header>
    <section>
        <p>Ingrese la canidad de grados centigrados a convertir a fahrenheit</p>
    </section>
    <br>
    <section>
        <form action="lista" method="post">
            <input type="hidden" name="action" value="agregar">
            <label for="cen">Centigrado a fahrenheit:</label>
            <input type="text" id="cen" name="cen"><br>
            <label for="enviar">&nbsp;</label>
            <input type="submit" id="enviar" value="Convertir">
        </form>
    </section>

</body>
</html>