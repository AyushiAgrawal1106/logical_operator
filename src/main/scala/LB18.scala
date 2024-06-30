object LB18 {
  def main(args:Array[String]):Unit={
    var sum =0
    var count=0
    for (i<- 24 to 100 by 2){
      sum=sum+i
      count=count+1
    }
    val avg = sum/count
    print(avg)
  }

}
