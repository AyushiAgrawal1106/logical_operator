object LB28 {
  def main(args:Array[String]):Unit={
    for(i<- 1 to 25 by 2){
      if(i%5==0){
        println("divisible by 5")
      }
      else{
        println(i)
      }
    }
  }

}
