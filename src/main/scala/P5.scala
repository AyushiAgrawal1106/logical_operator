object P5 {
  def main(args:Array[String]):Unit={
    for(i<- 0 to 5){
      for(j<- 1 to (2*i)+1){
        if(j%2==1){
          print("*")
        }
        else{
          print("_")
        }
        }
      println()
      }
    }
}
