import org.scalatest._
import io.gartner.entropy._

import scala.collection.mutable

trait GuyRitchieWorld extends BorisHasMoneyState with BarLocation {

  val vinny = new Character("Vinny", mutable.ListBuffer())

  val vinnyHasTheMoney = new CharacterHasObject(vinny, money)
  val vinnyAtTheBar = new CharacterAtLocation(vinny, theBar)
  val borisAtTheBar = new CharacterAtLocation(boris, theBar)

  val locations = Seq(theBar)
  val characters = Seq(vinny, boris)
  val objects = Seq(money)

  val states = Set[State](vinnyHasTheMoney, vinnyAtTheBar, borisAtTheBar)

  val world = new World(locations, characters, objects, states)

}

trait BarLocation {
  val theBar = new Location("The Bar")
}
