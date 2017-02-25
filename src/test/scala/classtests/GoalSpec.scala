import org.scalatest._
import io.gartner.gameai._

class GoalSpec extends FlatSpec with Matchers {

  "A Goal" should "have a name" in new BorisGetRichGoal {
    assert(goal.name == "Get the money")
  }

  it should "have a list of conditions" in new BorisGetRichGoal {
    assert(goal.conditions == Seq(borisHasTheMoney))
  }

}
