API RESTful Reactiva con Internacionalización




Este proyecto implementa una API RESTful usando Spring Boot 3+ con Spring WebFlux para programación reactiva y soporte para internacionalización (i18n). Incluye endpoints para saludos, productos y pedidos, con respuestas en español, inglés y francés.

Características
API reactiva con Mono y Flux.
Soporte multilenguaje (es, en, fr) mediante MessageSource.
Validaciones de entrada con Jakarta Validation.
Pruebas con Postman.
Requisitos Previos
Java 17: Descargar
Maven: Descargar o usa el wrapper (mvnw)
Git: Para clonar el repositorio
Postman: Descargar para probar la API
Instalación
Clonar el Repositorio
bash

Contraer

Ajuste

Copiar
git clone https://github.com/<TU_USUARIO>/<NOMBRE_DEL_REPOSITORIO>.git
cd <NOMBRE_DEL_REPOSITORIO>
Verificar Dependencias
El archivo pom.xml incluye:
xml

Contraer

Ajuste

Copiar
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-webflux</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
Actualiza las dependencias:
bash

Contraer

Ajuste

Copiar
mvn clean install
Configurar Propiedades
Edita src/main/resources/application.properties si necesitas cambiar el puerto:
properties

Contraer

Ajuste

Copiar
spring.messages.basename=messages
spring.messages.encoding=UTF-8
server.port=8080
Ejecución
Usando Maven
Navega al directorio del proyecto:
bash

Contraer

Ajuste

Copiar
cd <NOMBRE_DEL_REPOSITORIO>
Ejecuta la aplicación:
bash

Contraer

Ajuste

Copiar
mvn spring-boot:run
La API estará disponible en http://localhost:8080.
Usando un IDE
Importa el proyecto:
IntelliJ IDEA: File > Open > Selecciona la carpeta.
Eclipse: File > Import > Maven > Existing Maven Projects.
Ejecuta DemoApplication.java como aplicación Java.
Accede a http://localhost:8080.
Uso de la API
Prueba los endpoints con Postman:

1. Saludo
Método: GET
URL: http://localhost:8080/api/saludo?lang=<IDIOMA>
Ejemplos:
?lang=es: "Hola, bienvenido a nuestra API Reactiva!"
?lang=en: "Hello, welcome to our Reactive API!"
?lang=fr: "Bonjour, bienvenue sur notre API réactive!"
2. Productos
Método: GET
URL: http://localhost:8080/api/productos
Respuesta:
json

Contraer

Ajuste

Copiar
[
    {"id": "1", "nombre": "Laptop", "precio": 1200.0},
    {"id": "2", "nombre": "Mouse", "precio": 25.0},
    {"id": "3", "nombre": "Teclado", "precio": 45.0}
]
3. Pedidos
Crear Pedido:
Método: POST
URL: http://localhost:8080/api/pedidos?lang=<IDIOMA>
Cuerpo (JSON):
json

Contraer

Ajuste

Copiar
{
    "productoId": "1",
    "cantidad": 2
}
Respuestas:
?lang=es: "Pedido creado con éxito en español"
?lang=fr: "Commande créée avec succès en français"
Listar Pedidos:
Método: GET
URL: http://localhost:8080/api/pedidos
Respuesta:
json

Contraer

Ajuste

Copiar
[
    {"id": "uuid-generado", "productoId": "1", "cantidad": 2}
]
Estructura del Proyecto
text



