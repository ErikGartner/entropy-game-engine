package io.gartner.entropy

case class Goal(val name: String, val conditions: Seq[State])
