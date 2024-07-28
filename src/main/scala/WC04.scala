import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{when,col}

object WC04 {
  def main(args: Array[String]): Unit={
    val sparkconf = new SparkConf()
     sparkconf.set("spark.app.name","WC04")
      sparkconf.set("spark.master","local[*]")

    val spark= SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()

  import spark.implicits._

    val products = List(
      (1, 30.5),
      (2, 150.75),
      (3, 75.25)
    ).toDF("product_id", "price")

    products.select(col("product_id"),col("price"),
      when(col("price")<50,"Cheap")
        .when(col("price")>=50 && col("price")<100,"Moderate")
        .otherwise("Expensive").alias("details")).show()
  }

}
