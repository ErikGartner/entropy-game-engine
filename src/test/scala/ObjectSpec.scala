import org.scalatest._
import io.gartner.gameai._

class ObjectSpec extends FlatSpec with Matchers {

  trait MoneyObject {
    val obj = new Object("The Money")
  }

  "Objects" should "have a name" in new MoneyObject {
    assert(obj.name == "The Money")
  }

}
