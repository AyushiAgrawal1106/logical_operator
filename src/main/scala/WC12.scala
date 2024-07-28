import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object WC12 {
  def main(args: Array[String]): Unit={
    val sparkconf = new SparkConf()
    sparkconf.set("spark.app.name","WC12")
    sparkconf.set("spark.master","local[*]")

    val spark=SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()

    import spark.implicits._

    val reviews =List(
      (1, 1),
      (2, 4),
      (3, 5)
    ).toDF("review_id", "rating")

    reviews.select (col("review_id"),col("rating"),
          when(col("rating")<3,"Bad").when(col("rating")<=4,"Good").otherwise("Excellent").alias("review"),
         when(col("rating")>=3,true).otherwise(false).alias("abc")).show()
  }

}
