# Integración en proyecto java

#### Para proyecto maven

Es necesario añadir el siguiente repositorio

`````
<repository>
	<id>viavansi-repo</id>
	<name>Viavansi Maven Repository</name>
	<url>http://repositorio.viavansi.com/repo</url>
</repository>
`````
Añadir la siguiente dependencia

`````
<dependency>
	<groupId>com.viafirma</groupId>
	<artifactId>documents-sdk-java</artifactId>
	<version>3.X.X</version>
</dependency>
`````

#### Descargar

También puede descargar directamente el jar de la versión correspondiente desde el siguiente enlace http://repositorio.viavansi.com/artifactory/libs-releases/com/viafirma/documents-sdk-java/3.X.X/documents-sdk-java-2.X.X.jar y añadirlo directamente a su proyecto 