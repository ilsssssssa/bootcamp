public class Demo {

  public static void main(String[] args) {
    DemoStaticNestedClass d = new DemoStaticNestedClass();

    DemoStaticNestedClass.Calculator cc = new DemoStaticNestedClass.Calculator(100);
    cc.add(5);
    System.out.println(cc.getX()); // 105

    Calculator calculator = new Calculator();
  }

}