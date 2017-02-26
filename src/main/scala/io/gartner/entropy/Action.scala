package io.gartner.entropy

class Action(
    val name: String,
    val worldPreCon: Seq[State],
    val worldPostCon: Seq[State])
