package ru.avstulov.matrix.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ru.avstulov.matrix.model.Element;
import ru.avstulov.matrix.model.Matrix;

class SearchElementServiceTest
{

  private static final int X_SIZE = 10;
  private static final int Y_SIZE = 10;
  private static Matrix matrix;
  private final SearchElementService searchElementService = new SearchElementService();

  @BeforeAll
  static void init()
  {
    matrix = new Matrix(X_SIZE, Y_SIZE);
  }

  @Test
  void foundNineNeighboursForMiddleElement() {
    Element element = new Element(3, 6);

    List<Element> elements = searchElementService.searchNeighbours(matrix, element);

    assertEquals(elements.size(), 8);
  }

  @Test
  void foundThreeNeighboursForCornerElement() {
    Element element = new Element(9, 0);

    List<Element> elements = searchElementService.searchNeighbours(matrix, element);

    assertEquals(elements.size(), 3);
  }

  @Test
  void foundFiveNeighboursForSideElement() {
    Element element = new Element(4, 0);

    List<Element> elements = searchElementService.searchNeighbours(matrix, element);

    assertEquals(elements.size(), 5);
  }

  @Test
  void emptyForIncorrectElementCoordinates() {
    Element element = new Element(-1, 12);

    List<Element> elements = searchElementService.searchNeighbours(matrix, element);

    assertEquals(elements.size(), 0);
  }
}
