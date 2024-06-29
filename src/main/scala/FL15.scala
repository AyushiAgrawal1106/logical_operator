object FL15 {
  def main(args:Array[String]):Unit={
    val a ="ayushi"
    val b =List('a','e','i','o','u')
    var c=0
    for (i<- 0 until a.length){
      if(b.contains(a(i)) ){
        c=c+1
      }
    }
    print(c)
  }

}
