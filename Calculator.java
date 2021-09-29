import java.util.function.*;

class Calculator {
  
  //private static Supplier<Integer> callback; // создаем статическую переменную (поле) типа Supplier. Функциональный интерфейс Supplier реализует метод get().
  
  //public Calculator(Supplier<Integer> callback) {
    //this.callback = callback; 
  //}
  static Supplier<Calculator> instance = Calculator::new; // создаем статическую переменную (поле) типа Supplier. Функциональный интерфейс Supplier реализует метод get(). В качестве класс выступает Calculator в конструктор которого ничего не передается.

  public Calculator(){}


  BinaryOperator<Integer> plus = (x, y) -> x + y;
  BinaryOperator<Integer> minus = (x, y) -> x - y;
  BinaryOperator<Integer> multiply = (x, y) -> x * y;
  BinaryOperator<Integer> devide = (x, y) -> x / y;

  UnaryOperator<Integer> pow = x -> x * x;
  //UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
  BinaryOperator<Integer> abs = (x, y) -> { 
    if (x != y) {
     return;
    //} else {
      //return; 
    } 
  };

  Predicate<Integer> isPositive = x -> x > 0;

  Consumer<Integer> println = System.out::println;

}