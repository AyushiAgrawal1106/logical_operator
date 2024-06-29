object FL11 {
  def main(args:Array[String]):Unit={
    val a= List(1,2,3,4,5)
    for(i<- a.length-1 to 0 by -1){
      println(a(i))
    }
  }

}
