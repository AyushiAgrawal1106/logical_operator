object FL12 {
  def main(args:Array[String]):Unit={
    var a =1
    var sum=0

    while(a<=20){
      if(a%2==0){
        sum=sum+a
      }
      a=a+1
    }
    print(sum)
  }

}
