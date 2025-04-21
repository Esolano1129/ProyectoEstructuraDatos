<b>Estructura de Datos<br>
Grupo #6<br>
Integrantes:<br>

Link Video Youtube: https://youtu.be/VmvvYFwYd3E <br>

Link Video Youtube #2: https://youtu.be/xZWcEnxGpoI?si=qOovmO4OibRoMJTD <br>

Link Video Youtube #3: https://youtu.be/GYLbPvQkGSw <br>

- Abby Camila Chavarría Bolaños </b>
- Edgardo Antonio Solano Solera</b>

<b>Entrega #3 - Requisitos logrados</b>:

<b>Módulo 1.0: Configuración</b>
  
1. Utilizará como medio de almacenamiento persistente un archivo config.json (o .txt).

<b>AVANCE:Completado</b>

2. Este módulo solo se ejecuta la primera vez que el programa entra en ejecución posterior a esto el programa carga la 
configuración dada por el usuario almacenada en el config.json. Si este archivo se borra, deberá volver a ingresar la información.

<b>AVANCE: Creamos Método que deserealizar que carga el archivo Config.json al iniciar el programa y además creamos el código para solicitar la información.</b>

3. Este módulo permite ingresar el nombre de la sucursal, así como la cantidad de cajas para la atención de clientes. Entre las cajas de atención siempre debe permitir contar con una única caja preferencial, la cual atiende a personas con condiciones preferenciales como
discapacidades, embarazo, empresariales, adultos mayores. De igual forma, entre las cajas de atención siempre debe permitir contar con una única caja para tramites rápidos no preferenciales (un trámite)

<b>AVANCE: Completado</b>

4. Las demás cajas de atención aplican para dos o más tramites no preferenciales. 
<b>AVANCE: Completado</b>

5. El número total de cajas puede cambiar por cada ejecución no debe ser configurado de forma fija dentro del código. Debe poder ser dinámico sin afectar la funcionalidad del programa (lista de colas).

<b>AVANCE: Tenemos la estructura para generar las cajas, si generamos 1 la crea correctamente, tenemos pendiente que pueda generar más de 1 caja</b>

6. Lo anterior debe verse reflejado (serializado) en el archivo config.json (.txt).

<b>AVANCE:Completado</b>
   
7. Los usuarios y contraseñas de los usuarios serán almacenados en este archivo. No deben quedar quemados en el código (al menos un usuario por miembro del grupo).
<b>AVANCE:Completado</b> 


<b>Módulo 1.1: Creación de tiquetes</b>

1. Utilizará como medio de almacenamiento las Colas de Prioridades según el tipo y el tamaño de la Cola.

<b> AVANCE:Completado</b> 

2. El nodo de la cola debe contemplar como mínimo la siguiente información para cada tiquete: Nombre,Id,Edad,Moneda Cuenta (dólares ó colones), Hora de creación (la obtiene del sistema), Hora de atención (por defecto es -1 hasta que sea atendido), Tramite (Depósitos, Retiros, Cambio de Divisas, Servicios), Tipo Tramite (P: preferencial, A: un solo tramite, B: dos o más tramites)

<b>AVANCE: Completado</b> 

3. Deberá contemplar cualquier otro atributo dentro del Nodo para que este funcione como una cola.

<b>AVANCE:Completado</b> 

4. Una vez el tiquete es creado con la información del cliente, este imprime la caja en la que debe ser atendido, así mismo, la cantidad de personas que están por delante de él. En caso de no tener a nadie adelante y la caja no está atendiendo a ningún cliente (ocupada) el programa debe indicarle que ya es su turno de atención.
<b>Avance: Intentamos realizar la implementación de este punto por medio del método desencolar en las colas.</b>

5. Lo anterior debe verse reflejado (serializado) en el archivo tiquetes.json (.txt). Y cargarse cuando inicia el sistema si existen registros pendientes de atender.
   
<b>AVANCE:</b> Esto lo estamos manejando junto al archivo Config.json, intentamos serializar la cola completa con todos los tiquetes.



<b>Módulo 1.2: Atencion de Tiquetes</b>


1. La primera es al momento de crear un tiquete si se asigna a una cola vacía, inmediatamente este pasará a ser atendido por el cajero siempre y cuando este esté
desocupado (no se encuentra atendiendo un tiquete).

<b>AVANCE: Intentamos implementarlo dinámicamente pero no nos funcionó por lo que tuvimos que realizarlo con datos quemados</b>


2. La segunda función es cuando las filas se encuentran llenas, en este escenario, el programa debe contar con una funcionalidad que sea “Tiquete atendido” en el cual se debe identificar el número de caja para proceder a asignar otro cliente de la cola a esta.

<b>AVANCE:Intentamos implementarlo dinámicamente pero no nos funcionó por lo que tuvimos que realizarlo con datos quemados</b>

3. Cada vez que un tiquete pasa a ser atendido debe cambiar la hora de atención por la del sistema y además debe mandarlo a guardar en la base de datos, en este caso
un archivo llamado atendidos.json (.txt)

<b>AVANCE:Intentamos implementarlo dinámicamente pero no nos funcionó por lo que tuvimos que realizarlo con datos quemados</b>

4. Se debe guardar en base de datos en cual caja y de cual sucursal fue atendido.

<b>AVANCE:Intentamos implementarlo dinámicamente pero no nos funcionó por lo que tuvimos que realizarlo con datos quemados</b>

5. El sistema debe poder mostrar por pantalla esta información con una opción de menú.

<b>AVANCE:Completado</b> 

6. Los tipos de tiquetes deben ser al menos.

<b>AVANCE:Completado</b>



<b>Módulo 1.3: : Llenado de las colas </b>

Las colas se llenarán conforme las personas soliciten tiquetes, además, debe considerar
el tamaño de la cola para la caja, es decir:

Caja 1 | tiene 5 personas en fila
Caja 5 | tiene 3 personas en fila
Caja 7 | tiene 4 personas en fila
En este caso se asignaría a la caja 5 porque tiene menos personas en espera a ser
atendidas, en caso de empate, se puede asignar a cualquiera.

<b>AVANCE:Completado</b> 


Cabe resaltar que para los tiquetes de Caja Rápida o Caja Preferencial serán asignados
a conforme se crean ya que estos tiquetes no se atienden en las otras cajas y los
tiquetes de dos o más tramites no se atienden en estas cajas especiales.

<b>AVANCE:Completado</b> 


Lo anterior debe verse reflejado (serializado) en el archivo colas.json (.txt). Y cargarse
cuando inicia el sistema si existen registros pendientes de atender.

<b>Avance: Intentamos realizar la serialización por medio de la clase serialización</b>



<b>Módulo 1.4: Atencion de Tiquetes</b>

<b>Completado</b>


<b>Módulo 1.5: Atencion de Tiquetes</b>

El sistema debe permitir en una de las opciones conocer el tipo de cambio del dólar en línea, al día de la presentación, 
(tiquete de Cambio de Divisas), por esta razón, dicha consulta debe ser implementada utilizando el Web Service del Banco 
Central de Costa Rica.

<b>AVANCE:</b> Completado