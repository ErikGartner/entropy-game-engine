package io.gartner.entropy

abstract class State
class RelationTriple(subject: Any, relation: String, obj: Any) extends State {
  override def toString(): String = s"$subject $relation $obj"
}

case class CharacterHasObject(character: Character, obj: Object) extends RelationTriple(character, "has object", obj)
case class CharacterAtLocation(character: Character, loc: Location) extends RelationTriple(character, "at location", loc)
