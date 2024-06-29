object FL10 {
  def main(args:Array[String]):Unit={
    val a= 19
    var b=0
    var c =1
    while(c<=a){
      if(a%c==0){
        b+=1
      }
      c+=1
    }
    if(b==2){
      print(a)
    }
  }

}
