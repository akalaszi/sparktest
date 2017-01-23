import org.apache.spark.sql.SparkSession

object Test {
 def main(args: Array[String]) {
 val spark = SparkSession
      .builder
      .appName("Test")
      .config("spark.executor.cores", "4")
      .config("spark.executor.memory", "7g")
      .getOrCreate()

  val sc = spark.sparkContext
  sc.setLogLevel("INFO")
  
  println(sc.getConf.getAll)

 sc.stop()
 
  }
}
