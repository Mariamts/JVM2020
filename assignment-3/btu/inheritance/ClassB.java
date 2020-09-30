package btu.inheritance;

  class ClassB extends ClassA {
      public int b;

      public void method1(int y) {
          b= y;
      }

      public  void sum( int x, int y ) {
          System.out.print(x+y);
      }
  }

