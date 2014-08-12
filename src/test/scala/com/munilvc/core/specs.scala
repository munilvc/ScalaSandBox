package com.munilvc.core

import org.junit.runner.RunWith
import org.specs2.mutable._
import org.specs2.runner._

@RunWith(classOf[JUnitRunner])
class MySpecTest extends Specification {
  "EchaMuni" should {
    "contain 8 characters" in {
      "EchaMuni" must have size (8)
    }
    "start with 'Echa'" in {
      "EchaMuni" must startWith("Echa")
    }
    "end with 'Muni'" in {
      "EchaMuni" must endWith("Muni")
    }
  }
}
