class Weapon(val name: String, var damage: Int) {
    override fun toString(): String {
        return """
            Weapon: Name: $name Damage: $damage     
        """
    }
}