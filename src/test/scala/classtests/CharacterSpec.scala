import org.scalatest._
import io.gartner.entropy._

class CharacterSpec extends FlatSpec with Matchers {

  "Characters" should "have names" in new BorisCharacter {
    assert(boris.name == "Boris the Blade")
  }

  it should "have have goal" in new BorisGetRichGoal {
    val newBoris = boris.setGoals(Seq(borisGetRich))
    newBoris.goals should contain (borisGetRich)
  }

  it should "not be equal to each other" in new GuyRitchieWorld {
    boris should not equal (vinny)
  }

  it should "equal if same uid" in new BorisCharacter {
    boris should equal (new Character("Boritta", boris.uid, Seq()))
  }

}
