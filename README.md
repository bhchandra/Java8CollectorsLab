# Java8CollectorsLab
Experimenting with custom collectors by creating statistics on Employees.


--------------------------

Java 8 Streams provide many reduction operations:

- [sum](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#sum--)
- [average](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#average--)
- [max](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#max--)
- [min](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#min--)


But these are terminal operations and to perform such aggregates, the source needs to be Streamed repeatedly for each operation.



Stats collector is a good example to collect various statistics about any subject{Twitter Feed, Employees...etc} in a single iteration using Streams.

