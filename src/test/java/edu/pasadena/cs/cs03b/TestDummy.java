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

    int[] binary1 = {1, 0, 0, 1, 1};
    int iResult = Dummy.binaryToInt(binary1);

    assertEquals(19, iResult);

    int[] binary2 = {0, 1, 1, 1, 1, 0, 0};
    iResult = Dummy.binaryToInt(binary2);

    assertEquals(60, iResult);

  }
}
