object P7 {
  def main(args:Array[String]):Unit={
    for(i<-3 to 0 by -1){
      for(j<-i+1 to 4){
        print(" ")
      }
      for(k<-1 to 2*i+1){
        print("*")
      }
      println()
    }
    for(i<-0 to 3){
      for(j<-i to 3){
        print(" ")
      }
      for(k<-1 to 2*i+1){
        print("*")
      }
      println()
    }
  }

}
