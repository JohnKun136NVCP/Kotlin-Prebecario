// funciones normales
fun sum(a: Int, b: Int): Int {
    return a + b
}

println(sum(5, 3))  // Imprime 8

// funciones como expresiones
fun sum(a: Int, b: Int) = a + b

println(sum(5, 3))  // Imprime 8

// función por extensión
fun String.greet(): String {
    return "Hola, $this"
}

println("Juan".greet())  // Imprime "Hola, Juan"

fun Int.esPar(): Boolean = this % 2 == 0

println(4.esPar())  // Imprime "true"
println(5.esPar())  // Imprime "false"




// lambda
// Una lambda es una función anónima que puedes tratar como un valor: puedes asignarla a una variable, pasarla como argumento, o retornarla como resultado de otra función. Aquí tienes un ejemplo de una lambda que suma dos números:
val sum = { a: Int, b: Int -> a + b }

println(sum(5, 3))  // Imprime 8


// funciones de oden superior
// Una función de orden superior es una función que toma funciones como parámetros, o devuelve una función. Aquí tienes un ejemplo de una función de orden superior que toma una función como parámetro:

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val sum = { a: Int, b: Int -> a + b }
println(calculate(5, 3, sum))  // Imprime 8

// este devuelve una función
fun multiplyBy(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}

val multiplyBy2 = multiplyBy(2)
println(multiplyBy2(4))  // Imprime 8
