// Arreglos

// arrayOf(vararg elements : T)
val array = arrayOf(1, 2, 3, 4, 5)
println(array) // dirección de memoria hash
println(array[0]) // acceder a un elemento
println(array.contentToString())
// arrayOfNulls(size : T)
val nullArray = arrayOfNulls<Int>(5)
println(nullArray.contentToString()) // [null, null, null, null, null]
// emptyArray()
val emptyArray = emptyArray<Int>()
println(emptyArray.contentToString()) // []

array[0] = 10 // setear un elemento
array.set(0, 5) // otra forma de setear
array.get(0) // otra forma de acceder
array.size // obtener el tamanio
println(array.indexOf(5)) //devuelve -1 si no está el número 5


// Listas

// listOf<T>(vararg elements : T)
val list = listOf(1, 2, 3, 4, 5)
println(list) // [1, 2, 3]
// mutableListOf<T>(size : T)
val mutableList = mutableListOf(1, 2, 3)
println(mutableList) // [1, 2, 3]
// emptyList<T>()
val emptyList = emptyList<Int>()
println(emptyList) // []
// listOfNotNull<T>()
val notNullList = listOfNotNull(1, null, 2, null, 3)
println(notNullList) // [1, 2, 3]

// rangos a listas
// Rango de caracteres
val rango5 = 'a'..'z'
println(rango5.toList())  // [a, b, c, d, ..., z]

// Rango de caracteres con un paso específico
val rango6 = 'a'..'z' step 2
println(rango6.toList())  // [a, c, e, g, ..., y]

// Métodos 

// get(i) o [i]
println(list[2])
// indexOf(value)
println(list.indexOf(4))
// first()
println(list.first()) 
// last()
println(list.last())

// Métodos de listas mutables 

// add(element)
mutableList.add(6)
mutableList.add(0, 0) // en un indice espec
// removeAt(i)
mutableList.removeAt(0)
// remove
mutableList.remove(3) // remueve el valor con ese número
// removeIf{ condition }
// Eliminar elementos que cumplen una condición
mutableList.removeIf { it > 4 }
println(mutableList) // [2, 3, 4]

// Métodos de ordenamiento

// sorted()
println(list.sorted()) // [1, 2, 3, 4, 5]
// sortedDescending()
println(list.sortedDescending()) // [5, 4, 3, 2, 1]
// sortedBy { condition }
println(list.sortedBy { -it}) // [5, 4, 3, 2, 1]
// shuffled()
println(list.shuffled())
// shuffle()
// reversed()
println(list.reversed()) // [1, 4, 3, 2, 5]
// Map{ sentences }
println(list.map { it * 2 }) // [10, 4, 6, 8, 2]
// Filter{ condition }
println(list.filter { it % 2 == 0 }) // [2, 4]

// Mapas

// mapOf(vararg pairs : Pair<K, V>)
// Crear un mapa inmutable
val map = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
println(map) // {uno=1, dos=2, tres=3}
// mutableMapOf<K, V>()
// Crear un mapa mutable
val mutableMap = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
println(mutableMap) // {uno=1, dos=2, tres=3}
// emptyMap<K,V>()
// Crear un mapa vacío
val emptyMap = emptyMap<String, Int>()
println(emptyMap) // {}

// Set

// setOf<T>(vararg elements : T)
// Crear un set inmutable
val set = setOf(1, 2, 3, 1, 2)
println(set) // [1, 2, 3]
// mutableSetOf<T>(vararg elements : T)
// Crear un set mutable
val mutableSet = mutableSetOf(1, 2, 3, 1, 2)
println(mutableSet) // [1, 2, 3]
// emptySet<T>()
// Crear un set vacío
val emptySet = emptySet<Int>()
println(emptySet) // []

// Ejercicio list.map
val numbers = (1..10).toList()
val squares = numbers.map { it * it }
println(numbers)
println(squares)

// Rangos

// Rango ascendente
val rango1 = 1..10
println(rango1.toList())  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// Rango descendente
val rango2 = 10 downTo 1
println(rango2.toList())  // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

// Rango con un paso específico
val rango3 = 1..10 step 2
println(rango3.toList())  // [1, 3, 5, 7, 9]

// Rango de números flotantes
val rango4 = 1.0..5.0 step 0.5
println(rango4.toList())  // [1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0]
