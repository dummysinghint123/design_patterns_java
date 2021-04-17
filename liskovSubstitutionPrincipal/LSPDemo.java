package designPatterns.liskovSubstitutionPrincipal;

class LSPDemo
{
  // maybe conform to ++
  static void useIt(Rectangle r)
  {
    int width = r.getWidth();
    r.setHeight(10);
    System.out.println("Expected area of " + (width*10) + ", got " + r.getArea());
  }

  public static void main(String[] args) {
    Rectangle rc = new Rectangle(2, 3);
    useIt(rc);
    
    Rectangle sq = new Square();
    sq.setHeight(5);
    //useIt(sq); 
    sq.setWidth(10);
    useIt(sq);
  }
  //Currently the way it is implemented it breaks the implementation of the useIt methoda whcih uses the REactangle class if we
  //pass square in it it gives unexpected output becuase we have not written the square and reactangle class properly and not set rules for initializations like factory design pattern
}