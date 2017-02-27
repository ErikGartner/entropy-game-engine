package io.gartner.entropy

import scala.collection._

object Character {

  def apply(name: String, uid: String, goals: Seq[Goal]):Character = {
    new Character(name, uid, goals)
  }

  def apply(name: String, goals: Seq[Goal]): Character = {
    new Character(name, java.util.UUID.randomUUID.toString, goals)
  }

}

class Character(
    val name: String,
    val uid: String,
    val goals: Seq[Goal]) {

  override def equals(other: Any): Boolean = {
    other match {
      case c: Character => uid == c.uid
      case _ => false
    }
  }

  override def hashCode(): Int = {
    uid.hashCode()
  }

}
