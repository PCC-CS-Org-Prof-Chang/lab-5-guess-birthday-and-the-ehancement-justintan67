package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestDummy {

  @Test
  public void testDummy(){

    int[][] set1= { {1} };
    int[][] iResult = Dummy.generateSet(1);

    assertEquals(set1, iResult);

    int[][] set3 = { {1, 3, 5, 7}, {2, 3, 6, 7}, {4, 5, 6, 7}};
    iResult = Dummy.generateSet(3);

    assertEquals(set3, iResult);
  }
}
