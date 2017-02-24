import org.scalatest._
import io.gartner.gameai._

class GoalSpec extends FlatSpec with Matchers {

  trait GetRichGoal {
    val boris = new Character("Boris")
    val money = new Object("Money")
    val hasMoney = new CharacterHasObject(boris, money)
    val goal = new Goal("Get money", Seq(hasMoney))
  }

  "A Goal" should "have a name" in new GetRichGoal {
    assert(goal.name == "Get money")
  }

  it should "have a list of conditions" in new GetRichGoal {
    assert(goal.conditions == Seq(hasMoney))
  }

}
