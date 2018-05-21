


object ScalaTutorial{

  def main(args: Array[String]): Unit ={
    //Variable Type Inference - Scala compiler can figure out of the type of the variable based on the value assigned to it
     var num3 = 5
    //Variable Declaration var or val variableName: DataType = Value
    //val is immutable(we can't change) var is mutable
    val name : String = "Shivakoti";
    //Array Declaration
    var b = Array(1,2,3,4,5)
    //name = "Hello";
  //Multiple assignments
    //val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
    for(i<- name.toArray)
      print(" Character ["+i+"] ")
    // Method declaration -> def functionName (param1:dataType, param2:dt) : returnType
    def sumOfNum(num1:Int =2, num2:Int =3): Int = {
      return num1+num2+num3;
    }
    println(" Sum of Numbers with default values ["+ sumOfNum()+"]")
    println("Sum of Numbers with params["+ sumOfNum(4,-5)+"]")
    println("Sum of Numbers and concating the vale ["+ sumOfNum()+num3+"]")
    println("Sum of Numbers adding another value["+ sumOfNum().+(num3)+"]")
    println(" PatternMatch ["+patternMatch(name)+"]")
    forLoop()

    val point = new Point(10,20);
    point.add(30,40);
    val extendClass = new ExtendingClass(20,30,40)
    extendClass.add(50,60,70)
  }
  def patternMatch(value:String) ={
    value match{
      case "Hi" =>  "Welcome"
      case "Shivakoti" => "Human"
    }
  }
  //Unit will not return anything.
  def forLoop(): Unit = {
    var list = List(1, 2, 3, 4, 5)
    list.foreach(print)
  }
}