Practica de Spark
-----------------
En esta practica se quiere simular un sistema de recepción de eventos, cada registro contiene la información de un día, 
representada como una sucesión de letras. Cada letra representa el estado en el que se encontraba el sistema en una hora
en particular. Nuestro objetivo es crear un proyecto que se encargue de sacar estadisticas básicas de los diferentes 
tipos de eventos utilizando un sistema de procesamiento distribuido como Spark. Para ello se ha creado la clase 
EventAggregation en donde se van implementar el calculo de las diferentes estadisticas.

## Objetivo de la practica

La finalidad de esta practica es completar la clase EventAggregation que no tiene los 
metodos implementados, en la documentación de cada metodo se explica que es lo que tiene que hacer cada método. Para 
comprobar que el resultado es correcto se provee una clase de test EventAggregationTest, que permite validar si el 
resultado es correcto.

El entregable de la practica será el fichero EventAggregation.scala, este fichero deberá pasar todos los test y debera 
estar completamente documentado utilizando scaladoc. Este fichero deberá esta subido en el blackboard antes de la 
finalización del plazo de la práctica.

## Comandos utiles

Para hacer una instalación del software se debe ejecutar el comando mvn clean install desde la carpeta donde este 
contenido el pom.xml, lanzando este comando se ejecutarán tambien los test de la aplicación si se desea instalar el 
proyecto sin pasar los test se debe añadir el parametro -DskipTests. Desde el propio IntelliJ si marca con el botón 
derecho el proyecto y desde ahí se pulsa Run ‘All tests’, se pueden ejecutar todos los tests desde el IDE.

## Notas

* Se pueden incluir tantas clases o metodos auxiliares como se deseen pero deben estar todos contenidos en la clase 
EventAggregation.scala.
* Se pueden añadir más test para comprobar el funcionamiento de la aplicacion. 
* La clase GenerateFile es una aplicación que permite la creacion de ficheros con el formato de entrada establecido en
la practica, si quereis genera nuevos fichero o cambiar algun parametro sentiros libres a hacerlo.
* Cualquier duda sobre la practica no dudeis en poneros en contacto conmigo por correo.
 

