import org.scalatest._
import io.gartner.entropy._

class ActionSpec extends FlatSpec with Matchers {

  "An Action" should "have a name" in new TakeTheMoneyAction {
    assert(takeTheMoneyAction.name == "Take The Money")
  }


}
