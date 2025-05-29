package hw;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {

  public String getMessage() {
    return "hello world";
  }

  public int getYear() {
    return 2025;
  }

  public static List<HelloWorld> getSampleList() {
    return Arrays.asList(
            new HelloWorld(), 
            new HelloWorld()
    );
  }
}

