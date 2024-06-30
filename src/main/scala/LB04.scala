object LB04 {
  def main(args:Array[String]):Unit={
    val a=108
    if(a>100 && a<1000){
      if(a%2==0){
        print(a%3)
      }
      else{
        print(a%2)
      }
    }
    else{
      print("Please select a number from 100 to 1000")
    }
  }

}
