object FL16 {
  def main(args:Array[String]):Unit={
    val a= List(1,2,3,4,5,6,7)
    var b = 0
    while(b<a.length){
      println(a(b))
      b=b+1
    }
  }

}
