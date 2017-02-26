import org.scalatest._
import io.gartner.entropy._

class CharacterSpec extends FlatSpec with Matchers {

  "Characters" should "have names" in new BorisCharacter {
    assert(boris.name == "Boris the Blade")
  }

  it should "have have goal" in new BorisGetRichGoal {
    boris.goals += borisGetRich
    assert(boris.goals.contains(borisGetRich))
  }

  it should "not be equal to each other" in new GuyRitchieWorld {
    assert(boris != vinny)
  }

}
