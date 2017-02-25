import org.scalatest._
import io.gartner.gameai._

trait BorisCharacter {
  val boris = new Character("Boris the Blade")
}

trait MoneyObject {
  val money = new Object("The Money")
}

trait BorisHasMoneyState extends BorisCharacter with MoneyObject{
  val borisHasTheMoney = new CharacterHasObject(boris, money)
}

trait BorisGetRichGoal extends BorisHasMoneyState{
  val goal = new Goal("Get the money", Seq(borisHasTheMoney))
}
