object LB03 {
  def main(args:Array[String]):Unit={
    val a=23
    val b=35
    val c=98
    if(a>b && a>c){
      print("a is the biggest number")
    }
    else if(b>a && b>c){
      print("b is the biggest number")
    }
    else{
      print("c is the biggest number")
    }
  }

}
