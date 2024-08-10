package kotlin_pro.enumandsealed

sealed class Tile
class Red(val type: String, val points:Int):Tile()
class Blue(val points:Int):Tile()

fun main() {

//    val tile  = Red("Mushroom",25)
//    val tile2  = Red("Fire",30)
//
//    println("${tile.points} - ${tile.type}")
    val tile :Tile = Red("xyz",30)

    val points = when(tile){
        is Blue -> tile.points * 2
        is Red -> tile.points * 2
    }
    println(points)

}