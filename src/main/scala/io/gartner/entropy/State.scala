package io.gartner.entropy

abstract class State
case class CharacterHasObject(character: Character, obj: Object) extends State
