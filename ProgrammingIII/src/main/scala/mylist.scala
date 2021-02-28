import scala.collection.convert.ImplicitConversions.`seq AsJavaList`
class mylist {
  // Function for finding length
 def getLength(list:List[Any]): Any ={
   var length = 0    //   Initialise with 0
   for(element <- list) {
     {
       length = length+1   // Increment length by 1
     }
   }
   list.get(length-1)
 }
}
object length{
  def main(args: Array[String]): Unit = {
    val l = new mylist()
    print(l.getLength(List(1,2,3,5,7,7,8,9)))
  }
}
