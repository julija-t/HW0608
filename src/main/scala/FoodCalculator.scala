object FoodCalculator extends App{
  val food = "potatoes"
  val price = 0.37
  val quantity = 20
  val foodCosts = price * quantity

  //println how much will it cost to buy the food
  //It will cost XXXX to buy XX kilos of XXXX
  println(s"It will cost $foodCosts to buy $quantity kilos of $food")

}
