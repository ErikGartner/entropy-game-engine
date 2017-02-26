import org.scalatest._
import io.gartner.entropy._

class CharacterSpec extends FlatSpec with Matchers {

  "Characters" should "have names" in new BorisCharacter {
    assert(boris.name == "Boris the Blade")
  }

  it should "have have goal" in new BorisGetRichGoal {
    boris = Character(boris.name, boris.uid, Seq(borisGetRich))
    assert(boris.goals.contains(borisGetRich))
  }

  it should "not be equal to each other" in new GuyRitchieWorld {
    assert(boris != vinny)
  }

  it should "equal if same uid" in new BorisCharacter {
    boris should equal (Character("Boritta", boris.uid, Seq()))
  }

}
