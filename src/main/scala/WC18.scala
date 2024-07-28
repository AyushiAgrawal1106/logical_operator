import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object WC18 {
  def main(args: Array[String]): Unit={

    val sparkconf= new SparkConf()
    sparkconf.set("spark.app.name","WC18")
    sparkconf.set("spark.master","local[*]")

    val spark=SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()

    import spark.implicits._

    val emails = List(
      (1, "user@gmail.com"),
      (2, "admin@yahoo.com"),
      (3, "info@hotmail.com")
    ).toDF("email_id", "email_address")

    emails.select(col("email_id"),col("email_address"),when(col("email_address").contains("gmail"),"Gmail").when(col("email_address").contains("yahoo"),"Yahoo").otherwise("Hotmail").alias("email_domain")).show()
  }

}
