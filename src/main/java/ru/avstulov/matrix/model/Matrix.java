package ru.avstulov.matrix.model;

public class Matrix
{
  private final Element[][] matrixField;
  private final int xSize;
  private final int ySize;

  public Matrix(int x, int y) {
    this.matrixField = new Element[x][y];
    this.xSize = x;
    this.ySize = y;
    init();
  }

  public void init() {
    for (int i = 0; i < xSize; i++) {
      for (int j = 0; j< ySize; j++) {
        matrixField[i][j] = new Element(i, j);
        System.out.print(matrixField[i][j].getValue() + " ");
      }
      System.out.println("");
    }
  }

  public Element[][] getMatrixField()
  {
    return matrixField;
  }

  public int getXSize()
  {
    return xSize;
  }

  public int getYSize()
  {
    return ySize;
  }
}
