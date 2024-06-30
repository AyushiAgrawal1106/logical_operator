object LB16 {
  def main(args:Array[String]):Unit={
    var sum=0
    for(i<-382 to 582){
      if(i%2==0){
        sum=sum+i
      }
    }
    print(sum)
  }

}
