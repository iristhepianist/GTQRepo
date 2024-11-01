
// listen to gregtech material event

mods.gregtech.materialEvent {

 materialBuilder(32160,'demetarite')
    .color(0xb0f542)
    ..ore(true)
    .flags()
    .components(material('caesium'), material('germanium'))
    .separatedInto(material('gallium'), material('demetarium'))
.build()

 materialBuilder(31900,'aridium')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('schrabidium'), material('oxygen') * 4)
    .separatedInto(material('vibranium'), material('schrabidium'))
.build()

materialBuilder(31901, 'cryoxite')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('oxygen'), material('neon') * 2)
    .addOreByproducts(material('helium'), material('water'))
    .build()

materialBuilder(31902, 'zephyrite')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('silicon'), material('chlorine') * 2)
    .addOreByproducts(material('calcium'), material('sodium'))
    .build()

materialBuilder(31903, 'tundrite')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('magnetite'), material('oxygen') * 3)
    .separatedInto(material('pyrite'), material('magnetite'))
    .addOreByproducts(material('nickel'), material('chromium_trioxide'))
    .build()

materialBuilder(31904, 'aetherium')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('helium'), material('neodymium') * 3)
    .addOreByproducts(material('yttrium'), material('cerium'))
    .build()

materialBuilder(31905, 'ignium')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('sulfur'), material('pyrite') * 2)
    .addOreByproducts(material('lead'), material('silver'))
    .build()

materialBuilder(31906, 'ferritium')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('iron'), material('carbon') * 2)
    .separatedInto(material('steel'), material('carbon'))
    .addOreByproducts(material('nickel'), material('manganese'))
    .build()

materialBuilder(31907, 'luminite')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('phosphorus'), material('aluminium') * 2)
    .separatedInto(material('glowstone'), material('phosphorus'))
    .addOreByproducts(material('calcium'), material('silicon'))
    .build()

materialBuilder(31908, 'thermite')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('aluminium'), material('iron') * 3)
    .separatedInto(material('pyrite'), material('aluminium'))
    .addOreByproducts(material('magnesium'), material('silicon'))
    .build()

materialBuilder(31909, 'nebulium')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('neon'), material('helium') * 2)
    .addOreByproducts(material('argon'), material('xenon'))
    .build()

materialBuilder(31910, 'rubidite')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('rubidium'), material('silicon') * 2)
    .separatedInto(material('quartzite'))
    .addOreByproducts(material('potassium'), material('silicon'))
    .build()

materialBuilder(31911, 'xenotite')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('xenon'), material('titanium') * 3)
    .separatedInto(material('rutile'))
    .addOreByproducts(material('argon'), material('chromium'))
    .build()

materialBuilder(31912, 'aerium')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('aluminium'), material('oxygen') * 3)
    .separatedInto(material('bauxite'))
    .addOreByproducts(material('nitrogen'), material('silicon'))
    .build()

materialBuilder(31913, 'stellarium')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('iron'), material('nickel') * 2)
    .separatedInto(material('nickel'), material('iron'))
    .addOreByproducts(material('cobalt'), material('manganese'))
    .build()

materialBuilder(31914, 'polarite')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('magnetite'), material('carbon') * 2)
    .separatedInto(material('iron'))
    .addOreByproducts(material('nickel'), material('magnesium'))
    .build()

materialBuilder(31915, 'voltium')
    .colorAverage()
    ..ore(true)
    .flags()
    .components(material('sulfur'), material('vanadium') * 2)
    .separatedInto(material('vanadium'), material('sulfur'))
    .addOreByproducts(material('lead'), material('copper'))
    .build()



}