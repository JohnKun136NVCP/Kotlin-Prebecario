# Kotlin básico 🔖🐶📱

## Variables y constantes

Las **variables** como su propio nombre lo dice estas varian a lo largo del código y puden tener cambios durante su misma ejecución. Para Kotlin está la palabra reservada ***var***.

Las **constantes** son las que no van a cambiar su valor respecto al tiempo de ejecución en el código. Para Kotlin está la palabra reservada ***val***.

La **inferencia de dato** se refiere a que una variable podemos asignar el valor que sea y Kotlin automáticamente lo detecta. Sin embargo, la mejor práctica para estos casos es especificar el tipo de dato que se sigue de la siguiente sintaxis:

```
<var o val> <nombre> : <tipoDeDato>  = <Valor>
```

Por ejemplo:

```kotlin
var edad: Int  = 24

```

## Tipos de datos. 📕

De los principales se pueden resumir en los siguientes:


|Tipo de dato de Kotlin| Qué contiene|
|:--------------------:|:-----------:|
|**String**| Texto|
|**Int**| Número entero|
|**Double**|Número decimal|
|**Float**|Número decimal (que es menos preciso que un **Double**). Tiene un *f* o *F* al final del número|
|**Boolean**|**true** o **false**. Usa este tipo de datos cuadno haya dos valores posibles|

Hablando de la inferencia de tipo en este caso en los float se encuentra con una *f* al final:

```kotlin
fun main(){
    var total = 35.4f //Es una forma 
    total = 520.2F //Otra forma
}
```
Podemos imprimir el valor de la función arriba de diferentes formas, por ejemplo:

```kotlin
fun main(){
    var total = 35.4f //Es una forma 
    total = 520.2F //Otra forma
    println(total) //Imprime la variable
    println("El total es de: $total") //Otra forma
    println("El total es de: "+total) //Otra forma
}
```
# Seguridad Nula. 🔓

# Arreglos 💐

# Listas 📝

# Mapas 🗺️

# Set 💿
