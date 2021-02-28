import scala.collection.convert.ImplicitConversions.`seq AsJavaList`
class Table {
  def getLength(list:List[Int]): Int = {   //to find length of a list
    var length = 0 //   Initialise with 0
    for (element <- list) {
      {
        length = length + 1 // Increment length by 1
      }
    }
    length
  }
  def multiple(table:List[Int]) = {   //to find table of each element in list
    var mul = 0
    for (j <- 0 to getLength(table) - 1) {     //iterate list of element
      for (i <- 1 to 10) {                     // to find table up to 10
        mul = table.get(j) * i
        print(mul + " ")
      }
      println()
    }
  }
}
object l{
  def main(args: Array[String]): Unit = {
    val table_new = new Table()
    table_new.multiple(List(1,2,3,4,5))
  }
}
