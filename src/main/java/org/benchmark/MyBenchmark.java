package org.benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(value = Scope.Thread)
public class MyBenchmark {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Warmup(iterations = 1, time = 2, timeUnit = TimeUnit.SECONDS)
    @Measurement(iterations = 2, time = 5, timeUnit = TimeUnit.SECONDS)
    @Fork(1)
    public void millisTest() {
        System.currentTimeMillis();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Warmup(iterations = 1, time = 2, timeUnit = TimeUnit.SECONDS)
    @Measurement(iterations = 2, time = 5, timeUnit = TimeUnit.SECONDS)
    @Fork(1)
    public void nanosTest() {
        System.nanoTime();
    }
}