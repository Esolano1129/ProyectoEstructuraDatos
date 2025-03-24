<b>Estructura de Datos<br>
Grupo #6<br>
Integrantes:<br>

Link Video Youtube: https://youtu.be/VmvvYFwYd3E <br>

- Abby Camila Chavarría Bolaños
- Camila Da Silva Fallas
- Edgardo Antonio Solano Solera
- Robert Steven Monge Garro</b>

<b>Entrega #1 - Requisitos logrados</b>:

<b>Módulo 1.0: Configuración</b>
  
1. Utilizará como medio de almacenamiento persistente un archivo config.json (o .txt).

<b>AVANCE: 90/100, creamos la estructura de serialización para serializar la Lista</b>

2. Este módulo solo se ejecuta la primera vez que el programa entra en ejecución posterior a esto el programa carga la configuración dada por el usuario almacenada en el config.json. Si este archivo se borra, deberá volver a ingresar la información.

<b>AVANCE: Creamos el código para solicitar la información y un menú iteractivo en JOption Pane.</b>

3. Este módulo permite ingresar el nombre de la sucursal, así como la cantidad de cajas para la atención de clientes. Entre las cajas de atención siempre debe permitir contar con una única caja preferencial, la cual atiende a personas con condiciones preferenciales como
discapacidades, embarazo, empresariales, adultos mayores. De igual forma, entre las cajas de atención siempre debe permitir contar con una única caja para tramites rápidos no preferenciales (un trámite)

<b>AVANCE: Creamos el código para solicitar la información en JOption Pane, tambien creamos la clase Sucursal</b>

4. Las demás cajas de atención aplican para dos o más tramites no preferenciales. 
<b>PENDIENTE.</b>

5. El número total de cajas puede cambiar por cada ejecución no debe ser configurado de forma fija dentro del código. Debe poder ser dinámico sin afectar la funcionalidad del programa (lista de colas).
<b>AVANCE: Creamos la clase Sucursal la cuál usaremos para manejar la cantidad de Cajas</b>

6. Lo anterior debe verse reflejado (serializado) en el archivo config.json (.txt).

<b>AVANCE: Esto lo estamos manejando junto al archivo Config.json, intentamos serializar la cola completa.</b>
   
7. Los usuarios y contraseñas de los usuarios serán almacenados en este archivo. No deben quedar quemados en el código (al menos un usuario por miembro del grupo).
<b>AVANCE: Creamos el archivo JSON de usuarios.json y además creamos la clase Usuario con sus atributos y creamos el login</b>


<b>Módulo 1.1: Creación de tiquetes</b>

1. Utilizará como medio de almacenamiento las Colas de Prioridades según el tipo y el tamaño de la Cola.

<b> AVANCE:Listas de colas de prioridades implementadas.

2. El nodo de la cola debe contemplar como mínimo la siguiente información para cada tiquete: Nombre,Id,Edad,Moneda Cuenta (dólares ó colones), Hora de creación (la obtiene del sistema), Hora de atención (por defecto es -1 hasta que sea atendido), Tramite (Depósitos, Retiros, Cambio de Divisas, Servicios), Tipo Tramite (P: preferencial, A: un solo tramite, B: dos o más tramites)

<b>AVANCE: Completado, creamos la clase tiquete con todos los atributos y métodos necesarios, posterior creamos la clase Nodo que contiene los tiquetes con todos los atributos y la clase Cola que contiene los Nodos.</b>

3. Deberá contemplar cualquier otro atributo dentro del Nodo para que este funcione como una cola.

<b>AVANCE: Completado.</b>

4. Una vez el tiquete es creado con la información del cliente, este imprime la caja en la que debe ser atendido, así mismo, la cantidad de personas que están por delante de él. En caso de no tener a nadie adelante y la caja no está atendiendo a ningún cliente (ocupada) el programa debe indicarle que ya es su turno de atención.
<b>PENDIENTE</b>

5. Lo anterior debe verse reflejado (serializado) en el archivo tiquetes.json (.txt). Y cargarse cuando inicia el sistema si existen registros pendientes de atender.
   
<b>AVANCE: Esto lo estamos manejando junto al archivo Config.json, intentamos serializar la cola completa con todos los tiquetes.</b>



<b>Módulo 1.2: Atencion de Tiquetes</b>


1. La primera es al momento de crear un tiquete si se asigna a una cola vacía, inmediatamente este pasará a ser atendido por el cajero siempre y cuando este esté
desocupado (no se encuentra atendiendo un tiquete).

<b>PENDIENTE:</b>


2. La segunda función es cuando las filas se encuentran llenas, en este escenario, el programa debe contar con una funcionalidad que sea “Tiquete atendido” en el cual se debe identificar el número de caja para proceder a asignar otro cliente de la cola a esta.

<b>PENDIENTE:</b>

3. Cada vez que un tiquete pasa a ser atendido debe cambiar la hora de atención por la del sistema y además debe mandarlo a guardar en la base de datos, en este caso
un archivo llamado atendidos.json (.txt)

<b>PENDIENTEE:</b>

4. Se debe guardar en base de datos en cual caja y de cual sucursal fue atendido.

<b>PENDIENTE:</b>

5. El sistema debe poder mostrar por pantalla esta información con una opción de menú.

<b>AVANCE: Creamos la clase Menú la cuál se mostrará las opciones al usuario.</b>

6. Los tipos de tiquetes deben ser al menos.

<b>PENDIENTE:</b>