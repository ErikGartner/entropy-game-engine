import org.scalatest._
import io.gartner.gameai._

class StateSpec extends FlatSpec with Matchers {

  trait SimpleStates {
    val character = new Character("Boris")
    val money = new Object("Money")
    val characterHasMoney = new CharacterHasObject(character, money)
  }

  "State" should "be comparable" in new SimpleStates {
    val state = new CharacterHasObject(character, money)
    assert(state == characterHasMoney)
  }

}
