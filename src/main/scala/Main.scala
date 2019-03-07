import scala.util.Try

object Main {
  def main(args: Array[String]): Unit ={
    println("Hello, world!" + args.mkString(","))

    val xs = List(1,2,3,4)
    val ys = Map("a"->1, "b"->2, "c"->3)
    val zs = Set(1,1,2,2,3,3)
    println("xs=$xs, ys = $ys, zs = $zs")

    val xss = for{
      x<- 1 to 2
      y<-2 to 3
    }yield x + y

    val z = for {
      a <- Try(1)
      b <- Try(2)
    }yield a + b

    println("x=$xss, y = $z")

    val addOne = (_: Int) + 1
    val addV = addOne(10)
    println(s"addV = $addV")

    val xOp: Option[Int] = Option.empty[Int]
    println(xOp.fold("empty")(_.toString))
  }

}

/*
@native.extern
object libc{
  def malloc(size: native.CSize): native.Ptr[Byte] = native.extern
}
*/
