object LB06 {
  def main(args:Array[String]):Unit={
    val num1=65
    val num2=78
    println("select number for the operation needs to be performed:")
    println("1. Addition 2. Substraction 3. Multiplication 4. Division")
    val a = scala.io.StdIn.readInt()
    if(a==1){
      print("Addition of "+num1+" + "+num2+" is "+num1+num2)
    }
    else if(a==2){
      print("Substraction of "+num1+" + "+num2+" is "+(num1-num2))
    }
    else if(a==3){
      print("Multiplication of "+num1+" + "+num2+" is "+num1*num2)
    }
    else if(a==4){
      print("Division of "+num1+" + "+num2+" is "+num1/num2)
    }
    else{
      print("Choose correct option")
    }
  }

}
