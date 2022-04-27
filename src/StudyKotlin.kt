import animals.Buffalo
import animals.Lion

fun main(args: Array<String>){

    println("Привет новый день")
    getNull()

    lainKillBuffolo()

    addCompanianObjeck()

    useInsertSort(arrayOf(5,8,3,9,4,1,56,9,5,2,4,77))

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
fun addCompanianObjeck(){

    Train.getRaspisanie()
}

fun  useInsertSort(mas:Array<Int>){
    println(" ")
    mas.forEach { print("${it} " ) }

    var n=mas.size-1

    for (top in 1..n){
        var k = top

        while (k>0 && mas[k]<mas[k-1]){
            var per = mas[k]
            mas[k]=mas[k-1]
            mas[k-1]=per
            k--
        }
    }
    println(" ")

    mas.forEach { print("${it} " ) }
}
