class Player(val name: String, var life: Int = 3, var level: Int = 1, var score: Int = 0) {

    var weapon = Weapon("Fists", 10)

    val inventory = ArrayList<Loot>()

    fun show() {

        if (life < 0){
            println("$name is dead")
        } else {
            println("$name is alive")

        }

    }

    override fun toString(): String {
        return """
            name:  $name
            life:  $life
            level: $level
            score: $score
            weapon: $weapon
            """
    }


    fun showInventory() {
        println("$name's inventory")
        println("Name | Type | Value")
        for(item in inventory) {
            println("${item.name} | ${item.loot} | ${item.cost}")
        }
    }
}