package fpinscala.gettingstarted

import fpinscala.gettingstarted.*
import org.scalatest.funsuite.AnyFunSuite

class GettingStartedSpec extends AnyFunSuite {

  test("fib should return the fibonacci number for the nth term") {
    val fibonacci = List(0, 1, 1, 2, 3, 5, 8)
    assert(List(0, 1, 2, 3, 4, 5, 6).map(MyProgram.fib(_)) == fibonacci)
  }

  test("tailRecursiveFib should return the fibonacci number for the nth term") {
    val fibonacci = List(0, 1, 1, 2, 3, 5, 8)
    assert(List(0, 1, 2, 3, 4, 5, 6).map(MyProgram.tailRecursiveFib(_)) == fibonacci)
  }

  test("isSorted should check if the array is sorted according to a given comparison function") {
    val func = (a: Int, b: Int) => if a < b then true else false
    val actual = PolymorphicFunctions.isSorted(Array(1, 2, 3, 4), func)
    val expected = true
    assert(actual == expected)
  }
}