// If
val number = 10
if (number > 5) {
    println("$number es mayor que 5")
}

// If como expresión
val number = 10
val result = if (number > 5) "mayor que 5" else "menor o igual a 5"

val resultado = if (numero > 5) "mayor que 5" else if (numero == 0) "igual a cero" else "menor o igual que 5"
println("El numero $numero es $resultado")
println("El número es $result")

// When (switch)
val number = 3
when (number) {
    1 -> println("Uno")
    2 -> println("Dos")
    3 -> println("Tres")
    else -> println("Otro número")
}

// while
var i = 1
while (i <= 5) {
    println(i)
    i++
}

// do while
var i = 1
do {
    println(i)
    i++
} while (i <= 5)

// for
for (i in 1..5) {
    println(i)
}

// for each
// El bucle for each (o for en Kotlin) se usa para iterar sobre una colección o una matriz.
val numbers = listOf(1, 2, 3, 4, 5)
for (number in numbers) {
    println(number)
}
// for each como método
val numbers = listOf(1, 2, 3, 4, 5)

numbers.forEach { number ->
    println(number)
}

// ejercicio for each
val numbers = listOf(1, 2, 3, 4, 5)
for (number in numbers) {
    println(number * number)
}
