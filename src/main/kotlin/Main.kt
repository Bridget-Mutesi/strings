fun main(){
    placename()
    println(details("Bridget",20))
    length("")
    checkoutname("RITA")

}

fun placename(){
    val place = "akirachix"
    println(place[0])
    println(place[2])
    println(place[3])


}
fun details(name:String,age:Int):String{
    var detail = "Hi, my name is $name and i am $age"
    return detail
}
fun length(text: String):Int{
    val text = "Am bridget"
    return text.length
}

fun checkoutname(name:String){
    if (name=="BRIDGET"){
    println("That's me")}
    else{
        println("I don't know who that is") }
}






