object P4 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 4) {
      if (i == 1 || i == 4) {
        for (j <- 1 to 5) {
          print("* ")
        }
      }
      else {
        for (j <- 1 to 5) {
          if (j == 1 || j == 5) {
            print("* ")
          }
          else{
            print("  ")
          }
        }
      }
      println()
    }

  }

}
