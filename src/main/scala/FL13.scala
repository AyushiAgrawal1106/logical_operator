object FL13 {
  def main(args:Array[String]):Unit={
    val a ="AsdsA"
    var b =""
    for (i<- a.length-1 to 0 by -1){
      b=b+a(i)
    }
    if(a==b){
      print("Palindrome")
    }
  }

}
