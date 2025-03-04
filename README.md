 API RESTful con Spring Boot, WebFlux e Internacionalización

Este proyecto implementa una API RESTful con Spring Boot 3+, Spring WebFlux e internacionalización para manejar pedidos y productos de forma reactiva.

🚀 Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

Java 17

Maven

Postman (Opcional, para pruebas)

Spring Boot CLI (opcional)

⚙️ Instalación y Ejecución del Proyecto

1️⃣ Clonar el Repositorio

git clone https://github.com/tuusuario/api-webflux.git
cd api-webflux

2️⃣ Construir el Proyecto

mvn clean install

3️⃣ Ejecutar la Aplicación

mvn spring-boot:run

La API estará disponible en http://localhost:8080.

📌 Configuración de Internacionalización

El proyecto permite respuestas en español, inglés y francés. Para cambiar el idioma, se debe enviar Accept-Language en la cabecera de la solicitud o agregar ?lang=xx en la URL.

🛠️ Endpoints Disponibles

1️⃣ Productos

✅ Listar Productos

GET http://localhost:8080/api/productos

📌 Respuesta:

[
  {"id": "1", "nombre": "Laptop", "precio": 1200.0},
  {"id": "2", "nombre": "Mouse", "precio": 25.0}
]

2️⃣ Pedidos

✅ Crear Pedido

POST http://localhost:8080/api/pedidos

📌 Body (JSON):

{
  "descripcion": "Compra de una laptop",
  "total": 1200.50
}

📌 Cabecera:

Accept-Language: es

📌 Respuesta:

"Pedido creado exitosamente! ID: 1a2b3c4d"

✅ Listar Pedidos

GET http://localhost:8080/api/pedidos

📌 Respuesta:

[
  {"id": "1a2b3c4d", "descripcion": "Compra de una laptop", "total": 1200.50}
]

📝 Notas

Para cambiar el idioma, usa Accept-Language o agrega ?lang=es/en/fr a la URL.

Puedes modificar los mensajes en src/main/resources/messages/messages_xx.properties.

Implementado con Spring Boot 3+ y Spring WebFlux para manejo reactivo.
text



