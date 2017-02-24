package io.gartner.gameai

abstract class State
case class CharacterHasObject(character: Character, obj: Object) extends State
