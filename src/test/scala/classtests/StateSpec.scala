import org.scalatest._
import io.gartner.entropy._

class StateSpec extends FlatSpec with Matchers {

  "State" should "be comparable" in new BorisHasMoneyState {
    val state = new CharacterHasObject(boris, money)
    assert(state == borisHasTheMoney)
  }

}
