object LB12 {
  def main(args:Array[String]):Unit={
    var a = 0
    for(i<- 1 to 100){
      if(i%2==0){
        a+=1
      }
    }
    print(a)
  }

}
