import org.scalatest._
import io.gartner.entropy._

import scala.collection._

trait BorisCharacter {
  val boris = new Character("Boris the Blade", mutable.ListBuffer())
}

trait MoneyObject {
  val money = new Object("The Money")
}

trait BorisHasMoneyState extends BorisCharacter with MoneyObject{
  val borisHasTheMoney = new CharacterHasObject(boris, money)
}

trait BorisGetRichGoal extends BorisHasMoneyState{
  val borisGetRich = new Goal("Get the money", Seq(borisHasTheMoney))
}
