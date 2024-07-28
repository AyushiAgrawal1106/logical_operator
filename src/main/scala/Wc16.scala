import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object Wc16 {
  def main(args: Array[String]): Unit={
    val sparkconf=new SparkConf()
    sparkconf.set("spark.app.name","WC16")
    sparkconf.set("spark.master","local[*]")

    val spark = SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()

    import spark.implicits._

    val weather = Seq(
      (1, 25, 60),
      (2, 35, 40),
      (3, 15, 80)
    ).toDF("day_id", "temperature", "humidity")

    weather.select(col("day_id"),col("temperature"),col("humidity"),when(col("temperature")>30,true).otherwise(false).alias("is_hot")).show()
  }

}
