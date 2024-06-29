object FL15 {
  def main(args:Array[String]):Unit={
    val a ="ayushi"
    val b =List('a','e','i','o','u')
    var c=0
    for (i<- 0 to a.length-1){
      if(b.contains(a(i)) ){
        c=c+1
      }
    }
    print(c)
  }

}
