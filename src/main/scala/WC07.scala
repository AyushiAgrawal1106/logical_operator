import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object WC07 {
  def main(args: Array[String]):Unit={
    val sparkconf= new SparkConf()
        sparkconf.set("spark.app.name","WC08")
        sparkconf.set("spark.master","local[*]")

    val spark=SparkSession.builder()
      .config(sparkconf).getOrCreate()

    import spark.implicits._

    val customers = List(
      (1, "john@gmail.com"),
      (2, "jane@yahoo.com"),
      (3, "doe@hotmail.com")
    ).toDF("customer_id", "email")

    customers.select(col("customer_id"),col("email"),
      when(col("email").contains("gmail"),"gmail").
        when(col("email").contains("yahoo"),"yahoo").otherwise("others").alias("email_provider")).show()


  }

}
