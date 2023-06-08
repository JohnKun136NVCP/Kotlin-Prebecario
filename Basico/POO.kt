fun main() {
    println("Hello, world!")
    var pikachu = Pokemon("Fray Gordofredo","Electrico",10)
    var charizard = Pokemon("Charizard")
    //println(charizard.vivo)
    charizard.mostrarSiVivo()
    charizard.atacar()
    pikachu.perderVida()
    //println(pikachu.vida)
    //println(pikachu.vivo)
    pikachu.mostrarSiVivo()
    var articuno = PokemonesLegendarios("Articuno","Hielo",300,"Fuego")
    articuno.perderVida()
    articuno.atacar()
    pikachu.hablar()
}

open class Pokemon(var nombre:String,var tipo:String,var vida:Int):Personaje(){
    private var vivo=true
    init{
        println("Se creo el pokemon con nombre $nombre")
    }
    constructor(nombre:String):this(nombre,"fuego",100)
    fun atacar(){
        println("El pokemon $nombre ha atacado")
    }
    open fun perderVida(){
        println("El pokemon $nombre ha perdido vida")
        vida=vida-10
        println("El pokemon $nombre ahora tiene una vida de $vida")
        if (vida<=0){
           vivo=false
           println("El pokemon $nombre se ha debilitado")
        }
    }
    fun mostrarSiVivo(){
        println(vivo)
    }
    override fun hablar(){
        println("El pokemon $nombre intenta decirte algo")
    }
}

class PokemonesLegendarios(nombre:String,tipo:String,vida:Int, var debilidad:String):Pokemon(nombre,tipo,vida){
    override fun perderVida(){
        println("El pokemon es legendario y no se puede morir")
    }
}

abstract class Personaje{
    abstract fun hablar()
}

interface Legendario{
    fun sacarChispitas()
}
