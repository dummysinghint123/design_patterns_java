package designPatterns.liskovSubstitutionPrincipal;

//We must use a Factory design pattern to solve this conflict
class RectangleFactory
{
  public static Rectangle newSquare(int side)
  {
    return new Rectangle(side, side);
  }

  public static Rectangle newRectangle(int width, int height)
  {
    return new Rectangle(width, height);
  }
}