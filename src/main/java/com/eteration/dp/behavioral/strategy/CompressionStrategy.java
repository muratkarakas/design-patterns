package com.eteration.dp.behavioral.strategy;

import java.io.File;
import java.util.List;

public interface CompressionStrategy {
  public void compressFiles(List<File> files);
}