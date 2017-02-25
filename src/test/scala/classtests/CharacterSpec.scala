import org.scalatest._
import io.gartner.gameai._

class CharacterSpec extends FlatSpec with Matchers {

  "Characters" should "have names" in new BorisCharacter {
    assert(boris.name == "Boris the Blade")
  }

  it should "have have goal" in new BorisGetRichGoal {
    boris.goals += borisGetRich
    assert(boris.goals.contains(borisGetRich))
  }


}
