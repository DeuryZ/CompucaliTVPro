<p align="center">
    <h1 align="center">CompucaliTVPro</h1>
</p>

<p align="center">
		<em>Desarrollado con estas herramientas.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/badge/JavaScript-F7DF1E.svg?style=flat&logo=JavaScript&logoColor=black" alt="JavaScript">
	<img src="https://img.shields.io/badge/HTML5-E34F26.svg?style=flat&logo=HTML5&logoColor=white" alt="HTML5">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
	<img src="https://img.shields.io/badge/Spring-000000.svg?style=flat&logo=Spring&logoColor=white" alt="Spring">
</p>
<hr>

## Descripcion del proyecto
- CompucaliTVPro inspirada en la famosa pagina web de pirateo es una API REST que busca integrar al usuario con contenido multimedia para disfrutar y calificar.


## Base de datos

![Captura desde 2024-04-01 13-42-27](https://github.com/DeuryZ/CompucaliTVPro/assets/119361476/4716a19c-e3e1-4860-9e10-2f148984afcd)

## Como usar

Para usar el proyecto debes crear una base de datos mysql con el nombre "compucali" seguido de esto debes cambiar el documento properties por tu usuario y contraseña de mysql.
luego con el endpoint:

[endpoind] http://localhost:8080/usuario

nota: recuerda que es un post.

ejemplo de como debe estar el body para la ejecucion del endpoint
{
  "nombre": x,
  "segundo_nombre": x,
  "apellido": x,
  "segundo_apellido": x,
  "correo": "x@gmail.com",
  "contrasenia": "x"
}

Luego de registrar el usuario debes usar el endpoint para iniciar secion este te retornará un token que debes usar para realizar todas las demas consultas

[endpoind] http://localhost:8080/usuario/login

ejemplo: http://localhost:8080/usuario/login?correo=******@gmail.com&contrasenia=******

nota: recuerda usar parametros para realizar esta query, si usas un body no te retornará el token.

Aquí puedes ver los endpoinds que puedes usar:

http://localhost:8080/doc/swagger-ui.html








