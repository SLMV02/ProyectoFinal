# Usa una versión específica de Amazon Corretto para mayor estabilidad
FROM amazoncorretto:17-alpine

# Crea y define un directorio de trabajo
WORKDIR /app

# Copia el archivo JAR al contenedor
COPY ./target/demo-0.0.1-SNAPSHOT.jar app.jar

# Define la entrada del contenedor
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
