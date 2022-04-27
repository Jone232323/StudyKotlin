fun main(args: Array<String>){

    println("Привет новый день")


    getNull()

}
fun getNull(){

    var str1:String?="Jone"
    println(str1?.length)

    str1=null

    println(str1?.length)



}
