package com.interview.SOLIDPrinciples.DependencyInversion;

import java.util.List;

interface DataSource {
  List<String> getData();
}

class FileDataSource implements DataSource {
  private String filePath;
  
  public FileDataSource(String filePath) {
    this.filePath = filePath;
  }
  
  @Override
  public List<String> getData() {
    List<String> dataList = null;
    return dataList;
    // Implementation to retrieve data from file
  }
}

class DatabaseDataSource implements DataSource {
  private String connectionString;
  
  public DatabaseDataSource(String connectionString) {
    this.connectionString = connectionString;
  }
  
  @Override
  public List<String> getData() {
    List<String> dataList = null;
    return dataList;
    // Implementation to retrieve data from database
  }
}

class DataProcessor {
  private DataSource dataSource;
  
  public DataProcessor(DataSource dataSource) {
    this.dataSource = dataSource;
  }
  
  public void processData() {
    List<String> data = dataSource.getData();
    // Implementation to process data
  }
}
