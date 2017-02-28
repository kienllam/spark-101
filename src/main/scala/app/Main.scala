package app

import scala.collection.mutable.ArrayBuffer

/**
  * Created by ken on 2/27/17.
  */
object Main {

  def main(args: Array[String]): Unit = println("Hello world!")

  //Strings are Sea (scala list abstraction)

  //find the common character
  println("Hello".intersect("world"))
  println("aabbccc".distinct)
  println("abdcde".head)
  println("abcde".size)
  println("abcde".reverse)
  println("abcDE".filter(x => x.isUpper))

  //Variable length arrays
  val b2 = ArrayBuffer[Int]()
  b2 += 1
  println(b2)

  b2 += (1,2,3,4)
  println(b2)

  b2 ++= Array(8, 13, 21)
  println(b2)

  b2.trimEnd(5)
  println(b2)

  b2.insert(2, 6)
  println(b2)

  b2.insert(2, 7,8,9)
  println(b2)

  b2.remove(2)
  println(b2)

  b2.remove(2, 3)
  println(b2)

  var c2 = b2.toArray
  println(c2(0))


}
