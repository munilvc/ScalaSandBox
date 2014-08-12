package com.munilvc.core

object QuickSandBox {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  /** Factorial */
  def factorial(n: Int): Int = {
    if (n == 1) 1 else n * factorial(n - 1)
  }                                               //> factorial: (n: Int)Int
  factorial(5)                                    //> res0: Int = 120
  factorial(6)                                    //> res1: Int = 720

  /** Pascal Triangle*/
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == c) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }                                               //> pascal: (c: Int, r: Int)Int

  pascal(2, 6)                                    //> res2: Int = 15
  pascal(5, 6)                                    //> res3: Int = 6
  pascal(4, 4)                                    //> res4: Int = 1
  pascal(0, 8)                                    //> res5: Int = 1

  /** Fibonacci */
  def fibonacci(n: Int): Int = {
    if (n == 0 | n == 1) 1 else fibonacci(n - 2) + fibonacci(n - 1)
  }                                               //> fibonacci: (n: Int)Int

  fibonacci(10)                                   //> res6: Int = 89
  fibonacci(5)                                    //> res7: Int = 8
  fibonacci(7)                                    //> res8: Int = 21
  
  /** Balance Parenthesis Recursive */

  def balance(chars: List[Char]): Boolean = {

    def evaluarChars(chars: List[Char], v: Int): Int = {
      if (chars.isEmpty || v == -1) {
        v
      } else {
        var char = chars.head
        if (char == '(') evaluarChars(chars.tail, v + 1)
        else if (char == ')') evaluarChars(chars.tail, v - 1)
        else evaluarChars(chars.tail, v)
      }
    }

    val n = evaluarChars(chars, 0)
    if (n != 0) false else true
  }                                               //> balance: (chars: List[Char])Boolean

  balance("(a)".toList)                           //> res9: Boolean = true
  balance("((a)".toList)                          //> res10: Boolean = false
  balance("(a))".toList)                          //> res11: Boolean = false
  balance("(a())((()))".toList)                   //> res12: Boolean = true
  balance("(a))(".toList)                         //> res13: Boolean = false
  balance("(if (zero? x) max (/ 1 x))".toList)    //> res14: Boolean = true
  balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
                                                  //> res15: Boolean = true
  balance(":-)".toList)                           //> res16: Boolean = false
  balance("())(".toList)                          //> res17: Boolean = false

  /** Coins Change */
  /** Basado en la teoria de Knuth: http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-11.html#%_sec_1.2.1
  Todavia estoy tratando de entender el porque de esta llamada "countChange(money-coins.head, coins)":
  */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money==0)1 else
    if((money<0)||(coins.size==0))0
    else
      countChange(money, coins.tail)+countChange(money-coins.head, coins)
  }                                               //> countChange: (money: Int, coins: List[Int])Int
  countChange(4,List(1,2,3))                      //> res18: Int = 4

  /** test on chars */
  def testa(c: Char): Boolean = {
    if (c == '(' || c == ')') true else false
  }                                               //> testa: (c: Char)Boolean
  testa('(')                                      //> res19: Boolean = true
  testa(')')                                      //> res20: Boolean = true
  testa('a')                                      //> res21: Boolean = false
  
  /** Basic tests*/
  def increaseByOne(n: Int) = n + 1               //> increaseByOne: (n: Int)Int
  val x = 15                                      //> x  : Int = 15
  increaseByOne(x)                                //> res22: Int = 16
  if (1 == 1) 13 else 12                          //> res23: Int = 13
}