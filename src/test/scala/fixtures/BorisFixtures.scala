import org.scalatest._
import io.gartner.entropy._

import scala.collection._

trait BorisCharacter {
  var boris = Character("Boris the Blade", mutable.ListBuffer())
}

trait MoneyObject {
  val money = new Object("The Money")
}

trait BorisHasMoneyState extends BorisCharacter with MoneyObject {
  val borisHasTheMoney = new CharacterHasObject(boris, money)
}

trait BorisGetRichGoal extends BorisHasMoneyState {
  val borisGetRich = new Goal("Get the money", Seq(borisHasTheMoney))
}

trait TakeTheMoneyAction {
  val takeTheMoneyAction = new Action("Take The Money", Seq(), Seq())
}
