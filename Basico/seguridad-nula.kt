val pi: Float by lazy {3.1416f}


fun main(args: Array<Float>) {
	var radio = 3
	var area = pi*radio*radio
	println(area)
	radio =5
	area = pi*radio*radio
	println(area)
    var nombre: String? = "Hola"
    println(nombre?.length)
    nombre = null
    println(nombre?.length)
    //nombre = null
    //println(nombre)
    var nombre: String? = null
    println(nombre!!.length)
        
    var cantante: String? = null
    val tamanodestring = cantante?.length?:3  
    println("El triste interpretado por $cantante y el nombre tiene $tamanodestring de caracteres")
    val nombre: String? = "Hola" 
    nombre?.let { println(it.toUpperCase()) }

}