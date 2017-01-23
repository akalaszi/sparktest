# sparktest
example maven project for Spark 2.0.0 apps

It uses Spark2.0 dependencies from Cloudera. Tested with: CDH 5.8.2, CM 5.9.0

## usage

```
mvn package
spark2-submit --executor-memory 600m --driver-memory 600m --class Test /home/guest/workspace/test/target/test-1.0-SNAPSHOT-jar-with-dependencies.jar
```
May output the followings as the executor memory is set from the source code to 7g and maybe it is not allowed from yarn side:
```
17/01/23 08:39:50 INFO spark.SparkContext: Successfully stopped SparkContext
Exception in thread "main" java.lang.IllegalArgumentException: Required executor memory (7168+716 MB) is above the max threshold (1024 MB) of this cluster! Please check the values of 'yarn.scheduler.maximum-allocation-mb' and/or 'yarn.nodemanager.resource.memory-mb'.
```
