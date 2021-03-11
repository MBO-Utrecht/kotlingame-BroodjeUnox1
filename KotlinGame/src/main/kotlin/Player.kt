class Player(val name: String, var life: Int = 3, var level: Int = 1, var score: Int = 0) {

    var Weapon = Weapon("Fists", 10)

    fun show() {
        println("""
            name:  $name
            life:  $life
            level: $level
            score: $score
            weapon: ${Weapon.name} Damage: ${Weapon.damage}
            """)
    }
}