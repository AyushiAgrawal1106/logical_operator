object LB05 {
  def main(args:Array[String]):Unit={
    val a = 78
    if(a>0 && a<100){
      if(a>90 && a<=100){
        print("SuperSmart")
      }
      else if(a>80 && a<=90){
        print("Smmart")
      }
      else if(a>70 && a<=80){
        print("Smart Enough")
      }
      else if(a>60 && a<=70){
        print("Just Smart")
      }
      else if(a>35 && a<=60){
        print("No Smart")
      }
      else{
        print("Dumb")
      }
    }
    else{
      print("Invalid Number")
    }
  }

}
