import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}


object WC01 {
  def main(args: Array[String]):Unit={
    val spark = SparkSession.builder
      .appName("wc1")
      .master("local[*]") // Adjust this for your environment
      .getOrCreate()

    import spark.implicits._

    // Define a list of tuples
    val employees = List(
      (1, "John", 28),
      (2, "Jane", 5),
      (3, "Doe", 22)
    )

    // Convert the list to a DataFrame
    val employeesDF = employees.toDF("id", "name", "age")

    // Show the DataFrame
    employeesDF.select(col("id"),col("name"),col("age"),when(col("age")>=18,true).otherwise(false).alias("is_adult")).show()


  }

}
