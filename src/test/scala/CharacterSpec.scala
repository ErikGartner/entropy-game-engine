import org.scalatest._
import io.gartner.gameai._

class CharacterSpec extends FlatSpec with Matchers {

  trait BorisCharacter {
    val boris = new Character("Boris the Blade", List())
  }

  "Characters" should "have a name" in new BorisCharacter {
    assert(boris.name == "Boris the Blade")
  }

}
