enum class LootType {
    POTION, ARMOR, RING
}

class Loot(val name: String, val loot: LootType, val cost: Double) {
    override fun toString(): String {
        return """
            Name: $name
            loot: $loot
            cost: $cost"""
    }
}