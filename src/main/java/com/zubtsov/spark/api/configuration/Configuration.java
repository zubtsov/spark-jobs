package com.zubtsov.spark.api.configuration;

/**
 * The purpose of this class is to parametrize ETL job.
 * It can be useful to support environment-specific configuration or access any other external parameters.
 * Can be added as a parameter to any table reader, writer or builder.
 * @see com.zubtsov.spark.api.reading.TableReader
 * @see com.zubtsov.spark.api.writing.TableWriter
 * @see com.zubtsov.spark.api.Table
 */
public interface Configuration<T> {
    /**
     * @param key - name of a configuration parameter
     * @return configuration parameter value
     */
    T get(String key);
}
