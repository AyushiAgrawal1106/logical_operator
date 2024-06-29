object LO27 {
  def main(args:Array[String]):Unit={
    val a=11
    var b=0
    for (i<- 1 to a){
      if(a%i==0){
        b=b+1
      }
    }
    if(a%2!=0 || b==2){
      print(a)
    }
  }

}
