fun main(args: Array<String>) {
    val steven = Player("Steven", 4, 1, 0)

    steven.show()

    val baksteen = Weapon("Baksteen", 15)


    steven.weapon = baksteen

    val rens = Player("Rens", 2, 1, 10)

    val wokpan = Weapon("Wokpan", 18)

    rens.weapon = wokpan
    steven.weapon = rens.weapon

    println(steven)


    val redPotion = Loot("Red Potion", LootType.POTION,7.50)
    steven.inventory.add(redPotion)
    println(steven.inventory)
    val chestArmor = Loot("Chest Armor", LootType.ARMOR, 14.00)
    steven.inventory.add(chestArmor)
    println(steven.showInventory())
}

