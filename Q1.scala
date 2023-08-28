object Q1 {
    def calculateAverage(temp: List[Double]): Double = {
      val f_temp = temp.map(celsius => (celsius * 9 / 5) + 32)
      val f_temp_total = f_temp.reduce((a, b) => a + b)
      val f_temp_average = f_temp_total / f_temp.length
      f_temp_average
    }

    def main(args: Array[String]): Unit = {
      println("Enter temperatures separated by spaces:")
      val input = scala.io.StdIn.readLine()
      val temperatures = input.split(" ").map(_.toDouble).toList

      val averageFahrenheit = calculateAverage(temperatures)
      println(s"Average Fahrenheit temperature: $averageFahrenheit")
    }

}
