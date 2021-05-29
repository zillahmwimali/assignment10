import java.time.temporal.TemporalAmount

fun main() {
    library()
    squares()
    var myAccount=CurrentAccount(35243542,"Zillah Mwimali",150056.678)
    println(myAccount.deposit(3000.00))
    println(myAccount.withdraw(6048.897))
    println(myAccount.details())
}
data class Book(var title:String,var author:String,var pages:Int)
fun library() {
    var bookList = listOf(
        Book("Born a Crime", "Trevor Noah", 213),
        Book("Change", "Robin Sharma", 373),
        Book("Grit", "Margaret Marker", 344),
        Book("Healing power", "Faith Oyedepo", 123)
    )
    var sortedBooks=bookList.sortedByDescending { x->x.title }
    println(sortedBooks)
}
fun squares(){
    var t=-1
    do{
        println(t*t)
        t--
    }
    while(t*t<=3000)
}

 class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount: Double):Double{
        var balance1=balance+amount
        return balance1
    }
fun withdraw(amount: Double):Double{
    var balance2=balance-amount
    return balance2
}
  fun  details():String{
      return "Account number $accountNumber with balance $balance is operated by $accountName "

  }
}


