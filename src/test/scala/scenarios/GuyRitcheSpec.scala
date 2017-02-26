import org.scalatest._

import io.gartner.entropy._

class GuyRitcheScenario extends FlatSpec with Matchers {

  "Boris" should "be at the bar" in new GuyRitchieWorld with BarLocation {
    world.states should contain (new CharacterAtLocation(boris, theBar))
  }

  it should "not have the money" in new GuyRitchieWorld with BarLocation {
    world.states should not contain (new CharacterHasObject(boris, money))
  }

  "Vinny" should "be at the bar" in new GuyRitchieWorld with BarLocation {
    world.states should contain (new CharacterAtLocation(vinny, theBar))
  }

  it should "have the money" in new GuyRitchieWorld with BarLocation {
    world.states should contain (new CharacterHasObject(vinny, money))
  }

}
