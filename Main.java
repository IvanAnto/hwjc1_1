import java.util.function.*;

class Main {
  public static void main(String[] args) {
    
    Calculator calc = Calculator.instance.get(); // создаем экземпляр класса Calculator через вызов статической переменной instance

    //System.out.println(Calculator.instance.get());
    //System.out.println(calc);

    int a = calc.plus.apply(1, 2);
    int b = calc.minus.apply(1, 1);
    int c = calc.devide.apply(a, b);
    calc.println.accept(c);

    // plus.apply(2, 1);
    // System.out.println(plus.apply(2, 1));
    // minus.apply(2, 1);
    // System.out.println(minus.apply(2, 1));
    // multiply.apply(2, 1);
    // System.out.println(multiply.apply(2, 1));
    // devide.apply(2, 1);
    // System.out.println(devide.apply(2, 1));    
  }
}