import org.scalatest._
import io.gartner.gameai._

class CharacterSpec extends FlatSpec with Matchers {

  "Characters" should "have a name" in {
    val c = new Character("Erik", List())

    assert(c.name == "Erik")
  }

}
