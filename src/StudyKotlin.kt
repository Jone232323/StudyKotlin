import animals.Buffalo
import animals.Lion

fun main(args: Array<String>){

    println("Привет новый день")
    getNull()

    lainKillBuffolo()

}
fun getNull(){

    var str1:String?="Jone"
    println(str1?.length)

    str1=null

    println(str1?.length)
}
fun lainKillBuffolo(){

    val lion:Lion = Lion(190,90)
    val buffalo: Buffalo = Buffalo(620,60)

    println("Буйвал мёртв ${buffalo.isDaed}")

    lion.kill(buffalo)

    println("Буйвал мёртв ${buffalo.isDaed}")

}
