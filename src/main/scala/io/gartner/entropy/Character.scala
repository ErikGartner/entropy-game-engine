package io.gartner.entropy

import scala.collection._

case class Character(
    val name: String,
    val goals: mutable.ListBuffer[Goal]) {
}
