object Q2 {
    def countLetterOccurrences(words: List[String]): Int = {
      val characters = words.map(word => word.length)
      val total = characters.reduce((a, b) => a + b)
      total
    }

    def main(args: Array[String]): Unit = {
      println("Enter words separated by spaces:")
      val input = scala.io.StdIn.readLine()
      val words = input.split(" ").toList

      val charCount = countLetterOccurrences(words)
      println(s"Total count of letter occurrences: $charCount")
    }
}
