import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.io.StdIn.readLine
import java.io.PrintWriter

object Main {

  def main(args: Array[String]): Unit = {
    println("Enter the file name!")
    val fileName = readLine()

    val source = Source.fromFile(fileName, "UTF-8")
    var numbers = source.mkString.split("\\s+").map(_.toDouble)
    println(numbers.sum)
    println(numbers.max)
    println(numbers.min)
    println(numbers.sum/numbers.length)

    source.close()
  }
}