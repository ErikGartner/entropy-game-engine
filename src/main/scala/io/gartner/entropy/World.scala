package io.gartner.entropy

import scala.collection._

class World(
    val locations: Seq[Location],
    val characters: Seq[Character],
    val objects: Seq[Object],
    val states: Set[State]) {
}
