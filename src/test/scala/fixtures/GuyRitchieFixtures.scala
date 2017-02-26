import org.scalatest._
import io.gartner.entropy._

import scala.collection._

trait GuyRitchieWorld extends BorisHasMoneyState with BarLocation {

  val vinny = new Character("Vinny", mutable.ListBuffer())

  val vinnyHasTheMoney = new CharacterHasObject(vinny, money)

  val locations = Seq(theBar)
  val characters = Seq(vinny, boris)
  val objects = Seq(money)
  val states: mutable.HashSet[State] = mutable.HashSet(vinnyHasTheMoney)

  val world = new World(locations, characters, objects, states)

}

trait BarLocation {
  val theBar = new Location("The Bar")
}
