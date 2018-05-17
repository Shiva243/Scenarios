
class ExtendingClass(override val a: Int,override val b:Int, val c:Int) extends Point(a,b){
  var z:Int = c;
  def add(var1:Int,var2 : Int,var3:Int): Unit ={
    x=x+var1
    y=y+var2
    z=z+var3
    println("Inside add function x value is ["+ x +"] and y value is ["+y+"] and z value is ["+z+"]")
  }

}
class Point(val a : Int, val b:Int){
  //Class variables or Fields and a,b variables avilable entire class
  var (x:Int,y:Int) = Pair(a,b);
   //var x = a;
   //var y = b;
  def add(var1:Int,var2 : Int): Unit = {
    x= x+var1;
    y=y+var2;
    println("\n Inside add function x value is ["+ x +"] and y value is ["+y+"]")
  }
}
