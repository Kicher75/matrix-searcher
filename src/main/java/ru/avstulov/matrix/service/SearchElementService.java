package ru.avstulov.matrix.service;

import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.List;

import ru.avstulov.matrix.model.Element;
import ru.avstulov.matrix.model.Matrix;

public class SearchElementService
{
  public List<Element> searchNeighbours(Matrix matrix, Element element)
  {
    int xLength = matrix.getXSize();
    int yLength = matrix.getYSize();
    int xCoordinate = element.getXCoordinate();
    int yCoordinate = element.getYCoordinate();

    if (xCoordinate >= xLength || yCoordinate >= yLength ||
            xCoordinate < 0 || yCoordinate < 0) {
      System.out.println("Element not found!");
      return emptyList();
    }
    ArrayList<Element> result = new ArrayList<>();

    boolean upperExist = yCoordinate - 1 >= 0;
    boolean downExist = yCoordinate + 1 < yLength;
    boolean leftExist = xCoordinate - 1 >= 0;
    boolean rightExist = xCoordinate + 1 < xLength;

    if (rightExist) {
      result.add(matrix.getMatrixField()[xCoordinate + 1][yCoordinate]);
    }
    if (leftExist) {
      result.add(matrix.getMatrixField()[xCoordinate - 1][yCoordinate]);
    }
    if (downExist) {
      result.add(matrix.getMatrixField()[xCoordinate][yCoordinate + 1]);
    }
    if (upperExist) {
      result.add(matrix.getMatrixField()[xCoordinate][yCoordinate - 1]);
    }
    if (rightExist && downExist) {
      result.add(matrix.getMatrixField()[xCoordinate + 1][yCoordinate + 1]);
    }
    if (leftExist && upperExist) {
      result.add(matrix.getMatrixField()[xCoordinate - 1][yCoordinate - 1]);
    }
    if (rightExist && upperExist) {
      result.add(matrix.getMatrixField()[xCoordinate + 1][yCoordinate - 1]);
    }
    if (leftExist && downExist) {
      result.add(matrix.getMatrixField()[xCoordinate - 1][yCoordinate + 1]);
    }

    return result;
  }
}
