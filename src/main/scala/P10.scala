object P10 {
  def main(args:Array[String]):Unit={
    for(i<- 0 to 4){
      for(j<-i to 3){
        print(" ")
      }
      for(k<- 1 to (2*i)+1){
        print("*")
      }
      println()
    }
  }

}
