import org.scalatest._
import io.gartner.gameai._

class ObjectSpec extends FlatSpec with Matchers {

  "Objects" should "have a name" in new MoneyObject {
    assert(money.name == "The Money")
  }

}
