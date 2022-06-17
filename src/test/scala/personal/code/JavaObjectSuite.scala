package personal.code

import org.scalatest.FunSuite

class JavaObjectSuite extends FunSuite {

  test("create java object") {
    val holder = ScalaUtils.getJavaObject()
    assert(holder != null)
  }
}
