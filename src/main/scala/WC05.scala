import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object WC05 {
  def main(args: Array[String]):Unit={
    val sparkconf=new SparkConf()
      sparkconf.set("spark.app.name","WC05")
      sparkconf.set("spark.master","local[*]")

    val spark=SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()

    import spark.implicits._

    val events = List(
      (1, "2024-07-27"),
      (2, "2024-12-25"),
      (3, "2025-01-01")
    ).toDF("event_id", "date")

    events.select(col("event_id"),col("date"),
      when(col("date")>"2024-12-25"  && col("date")<="2025-01-01",true).otherwise(false).alias("is_holiday")).show()



  }

}
