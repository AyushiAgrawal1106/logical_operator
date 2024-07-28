import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object WC09 {
  def main(args: Array[String]):Unit={

    val sparkconf=new SparkConf()
    sparkconf.set("spark.app.name","WC09")
    sparkconf.set("spark.master","local[*]")

    val spark=SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()

    import spark.implicits._

    val sales = List(
      (1, 100),
      (2, 1500),
      (3, 300)
    ).toDF("sale_id", "amount")

    sales.select(col("sale_id"),col("amount"),when(col("amount")<200,"0")
      .when(col("amount")>=200 && col("amount")<1000,"10").otherwise("20").alias("discount")).show()
  }

}
