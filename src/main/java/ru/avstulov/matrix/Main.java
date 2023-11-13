package ru.avstulov.matrix;

import java.util.List;

import ru.avstulov.matrix.model.Element;
import ru.avstulov.matrix.model.Matrix;
import ru.avstulov.matrix.service.SearchElementService;

public class Main
{
  private static final SearchElementService searchElementService = new SearchElementService();

  public static void main(String[] args)
  {
    Matrix matrix = new Matrix(10, 10);
    Element element = new Element(3, 0);
    List<Element> elements = searchElementService.searchNeighbours(matrix, element);

    elements.forEach(el -> System.out.println(el.getValue()));
  }
}
