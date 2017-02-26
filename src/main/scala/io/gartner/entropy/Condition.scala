package io.gartner.entropy

abstract class Condition {
  def isTrue(world: World): Boolean
}
abstract class WorldCondition extends Condition

class CharacterAtLocation extends WorldCondition{

  override def isTrue(world: World): Boolean = {
    ???
  }

}
