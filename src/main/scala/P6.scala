object P6 {
  def main(args:Array[String]):Unit={
    for (i<- 0 to 4){
      for(j<-4 to i by -1){
        print(" ")
      }
      for(k<-1 to (2*i)+1){
        print("*")
      }
      println()
    }
    for(i<- 3 to 0 by -1){
      for(j<-i to 4 ){
        print(" ")
      }
      for(k<-2*i+1 to 1 by -1){
        print("*")
      }
      println()
    }
  }

}
