package ru.avstulov.matrix.model;

public class Element
{
  private final int xCoordinate;
  private final int yCoordinate;
  private final int value;

  public Element(int xCoordinate, int yCoordinate)
  {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.value = xCoordinate + yCoordinate;
  }

  public int getXCoordinate()
  {
    return xCoordinate;
  }

  public int getYCoordinate()
  {
    return yCoordinate;
  }

  public int getValue()
  {
    return value;
  }
}
