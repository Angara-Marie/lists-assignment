fun main(){
    Words(listOf("Nigeria", "Ghana", "Algeria", "Kenya", "Egypt", "South Africa", "Uganda", "Zimbabwe", "Zambia", "Mozambique"))
    peopleHeight(listOf(1.2,1.5,1.7,1.3,1.6,1.4))
    var tessa= Person("Tessa", 25,1.76, 67)
    var cudra= Person("Cudra", 20,1.73,62 )
    var munde= Person( "Munde", 22,1.74, 69)
    var persons= listOf(tessa,cudra,munde)
    var ages= persons.sortedByDescending { x -> x.age }
    println(ages)
    var num1=Person("Tessa",23,1.0,62)
    var num2=Person("Frank",43,2.4,50)
    var add= listOf(num1,num2)
     println( add.plus(persons))
    var toyota= Car("kBG 929U", 180)
    var subaru= Car("KAU 929U", 160)
    var ford= Car("KBT 465T", 150)
    var magari= listOf(toyota,subaru,ford)
    println(avgmileage(magari))
}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6
fun Words(countries:List<String>):List<String>{
    countries.forEachIndexed { index, s ->
        if (index%2==0){
            println(s)
        }
    }
    return countries
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peopleHeight(height:List<Double>):String{
    var hgt = height.sum()
    var avg = height.average()
    var result = "$hgt,$avg"
    println(result)
    return result

}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String, var age:Int, var height:Double, var weight:Int)

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun people(second:List<Any>):List<Any>{
    return listOf()

}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list
data class Car(var registartion:String, var mileage:Int)
fun avgmileage(mile:List<Car>):Int{
    var t=0
    mile.forEach { cars->cars.mileage
    t+=cars.mileage
    }
    var total= t/mile.count()
    return total

}


