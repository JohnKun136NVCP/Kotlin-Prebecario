//Variables y Constantes
//Declaracion
var edad: Int = 24
val cuenta:Int = 2
println(cuenta)
var dinero:Int = 100
println("Usted tiene: $dinero")
dinero = dinero + 100
println("Ahora usted tiene: $dinero")
val fotostomadas:Int = 45
val fotoscamara:Int = 100
println("Sobra este espacio ${fotoscamara - fotostomadas}")
println("Mi edad es de: "+edad)
//Union de strings
val reunion = "Hoy hay clase de: "
val lenguaje = "Kotlin "
val frase = reunion + lenguaje + "y Java"
println("El profe dijo que: \"Android es facil\"")
val notificacion: Boolean = false
println("Las notificaciones estan activas? "+notificacion)
//Comentarios    
//val valor: Double = .29 Una sola linea
/* Varias lineas
var mascota =  "Perrito"
val suma =  1 + 3
*/
//Aumento y disminucion de parametros.
var descuento = 10
descuento-- 
println(descuento)