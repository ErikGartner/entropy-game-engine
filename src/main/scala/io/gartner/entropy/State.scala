package io.gartner.entropy

abstract class State
class RelationTriple(subject: Any, relation: String, obj: Any) extends State

case class CharacterHasObject(character: Character, obj: Object) extends RelationTriple(character, "has object", obj)
