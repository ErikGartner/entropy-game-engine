import org.scalatest._
import io.gartner.gameai._

class CharacterSpec extends FlatSpec with Matchers {

  "Characters" should "have a name" in new BorisCharacter {
    assert(boris.name == "Boris the Blade")
  }

}
