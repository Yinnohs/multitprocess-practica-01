# Multi Process Practica Nº 1 <hr>
## Apartado 1
Desarrolla una aplicación en Java que abra el número de ventanas del navegador de tu elección
que indique el usuario. Puede indicarlo como entrada de teclado o como argumento del ejecutable.
El proceso debe terminar cuando todas las ventanas del navegador se cierren. (3 puntos)

## Apartado 2
Desarrolla una segunda aplicación en Java que abra el número de ventanas del navegador de tu
elección que indique el usuario. Puede indicarlo como entrada de teclado o como argumento del
ejecutable. Los procesos deben terminar 500 ms después de arrancar. Cada proceso debe indicar la
hora de inicio y la hora de finalización. (3 puntos)

## Apartado 3
Desarrolla una tercera aplicación en Java que reciba como entrada una ruta a un fichero del
sistema. Tu programa debe abrir el fichero, si existe, utilizando el comando cat y enviar la salida a la
entrada del comando wc, que se utiliza para contar las líneas de un fichero. (4 puntos)



# Decisiones tomadas<hr>
## Generales
* Al process builder en la manera de lo posible se le pasaban los commandos por String[] dado a que los lee de mejor manera.
* Crear un paquete por cada apartado de la practica para ver a modo de mono repo.
* Crear un MD con la bibliografía usada en cada parte por ser extensa

## Apartado 1 
* Se usó el comando  de CMD start para general el proceso, dado a que el mismo habre un navegador por defecto del OS Windows.
* Se uso Un array para manejar a los hijos del proceso dado a que este array guardaba la referencia,
dejando de esa manera los objetos vivos.
* Uso del metodo decendants dado a que era necesario entrar a los procesos nietos del proceso original.

## Apartado 2 
* Usado comando sleep para esperar una catidad de segundos.
* Usado Calendar para enseñar el formato de tiempo necesario horas:minutos

## Apartado 3
* Solucionado usando el operador " | " de manera estratégica.
* Despues se usa un buffer Reader para poder leer el output del commando.
