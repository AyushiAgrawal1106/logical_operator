object LO11 {
  def main(args:Array[String]):Unit={
    val a =17
    var b=0
    for (i<- 1 to a){
      if(a%i==0){
        b=b+1
      }
    }
    if(b==2 && a%2==1){
      print("Number is prime and odd")
    }
  }

}
