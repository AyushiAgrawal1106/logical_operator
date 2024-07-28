import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, lit, unix_timestamp, when}

object WC10 {
  def main(agrs: Array[String]):Unit={

    val sparkconf=new SparkConf()
    sparkconf.set("spark.app.name","WC09")
    sparkconf.set("spark.master","local[*]")

    val spark=SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()

    import spark.implicits._

    val logins = List(
      (1, "09:00"),
      (2, "18:30"),
      (3, "14:00")
    ).toDF("login_id", "login_time")

    logins.select(col("login_id"),col("login_time"),when(unix_timestamp(col("login_time"), "HH:mm") < unix_timestamp(lit("12:00"), "HH:mm"),true).otherwise("false").alias("is_morning")).show()
  }

}
