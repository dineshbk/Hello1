package lectureq1

object LecQest{
  def main(args: Array[String]): Unit = {
      println(computeShippingCost(31))
      println(computeShippingCost(40))
      println(computeShippingCost(28))
  }

  def computeShippingCost(input: Double): Double = {
      val size: Double = 30.0
      if (input > size){
          5 + (input-size)*.25
      }
      else if(input <= size){
          5.0
      }
  }
}