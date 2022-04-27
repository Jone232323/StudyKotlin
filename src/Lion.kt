package animals
class Lion(val mass:Int,val speed:Int) {


    fun kill(animal:Buffalo){

        if (!animal.isDaed){
            println("Лев охотится")

            if (animal.speed>speed){
                println("Лев не догнал Буйвала")
            }else{
                animal.isDaed=true
                println("Лев убил буйвала")
            }

        }

    }

}