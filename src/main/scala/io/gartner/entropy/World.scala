package io.gartner.entropy

class World(
    val locations: Seq[Location],
    val characters: Seq[Character],
    val objects: Seq[Object],
    val states: Set[State]) {
}
