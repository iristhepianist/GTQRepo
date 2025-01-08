

mods.thaumcraft.crucible.recipeBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .catalyst(item('minecraft:clay'))
    .output(item('embers:blend_caminite'))
    .aspect(aspect('machina') * 25)
    .aspect(aspect('auram') * 40)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .mainInput(ore('stoneMarble'))
    .output(item('astralsorcery:blockblackmarble'))
    .aspect(aspect('perditio') * 200)
    .aspect('praecantatio', 150)
    .input(item('bloodmagic:ritual_stone', 4))
    .input(item('thaumcraft:ingot', 1))
    .input(ore('nuggetMithrillium'))
    .input(item('thaumcraft:metal_alchemical_advanced'))
    .input(item('thaumicrestoration:item_ingot', 5))
    .instability(5)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('EBTHAUMIUM')
    .mainInput(ore('ingotThaumium'))
    .output(item('gregtech:meta_ingot', 32001))
    .aspect(aspect('perditio') * 200)
    .aspect('vitium', 150)
    .input(item('thaumcraft:curio'))
    .input(ore('ingotThaumiumPerditio'))
    .input(ore('nuggetMithrillium'))
    .instability(5)
    .register()

mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .mainInput(item('bloodarsenal:base_item', 5))
    .output(item('gt_aurora:botathaumahaemic_sentient_hivemind_cell'))
    .aspect(aspect('perditio') * 120)
    .aspect('mortuus', 50)
    .input(item('bloodmagic:demon_crystal'))
    .input(ore('ingotThaumiumPerditio'))
    .input(item('bloodarsenal:base_item', 4))
    .input(item('bloodmagic:slate', 1))
    .input(ore('ingotManasteel'))
    .instability(20)
    .register()

mods.thaumcraft.dust_trigger.triggerBuilder()
    .researchKey('WITCHINGTOOLS')
    .target(block('thaumcraft:crucible'))
    .output(item('bewitchment:witches_oven'))
    .register()

mods.thaumcraft.dust_trigger.triggerBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .target(block('thaumcraft:smelter_basic'))
    .output(item('bewitchment:witches_cauldron'))
    .register()


mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('VITALIUM')
    .mainInput(item('bloodarsenal:blood_diamond', 3))
    .output(item('gregtech:meta_dust_tiny', 32107))
    .aspect('mortuus', 150)
    .aspect('victus', 150)
    .input(item('bewitchment:contract'))
    .input(item('bewitchment:demon_heart'))
    .input(item('bewitchment:demonic_elixir'))
    .input(ore('ingotDreadium'))
    .input(ore('ingotBloodInfusedIron'))
    .instability(40)
    .register()
    

mods.thaumcraft.arcane_workbench.shapedBuilder()
    .researchKey('UNLOCKALCHEMY@3')
    .output(item('industrialforegoing:enchantment_refiner'))
    .matrix('EEE',
            'MSM',
            'EXE')
    .key('S', item('gregtech:machine', 988))
    .key('E', ore('plateStainlessSteel'))
    .key('M', ore('circuitHv'))
    .key('X', item('gregtech:meta_item_1', 129))
    .aspect(aspect('ignis'))
    .aspect(aspect('terra'))
    .vis(200)
    .register()

mods.thaumcraft.arcane_workbench.shapedBuilder()
    .researchKey('MANALENS')
    .output(item('botania:lens'))
    .matrix('EEE',
            'ESE',
            'EEE')
    .key('S', ore('blockGlass'))
    .key('E', ore('plateManasteel'))
    .aspect(aspect('ignis'))
    .aspect(aspect('terra'))
    .vis(40)
    .register()


mods.thaumcraft.infusion_crafting.recipeBuilder()
    .researchKey('MANALENS')
    .mainInput(ore('ringManasteel'))
    .output(item('botania:lens'))
    .aspect('praecantatio', 10)
    .aspect('terra', 20)
    .input(item('botania:managlass'))
    .instability(2)
    .register()

mods.thaumcraft.crucible.recipeBuilder()
    .researchKey('FIRSTSTEPS')
    .catalyst(ore('gemFluix'))
    .output(item('gregtech:meta_gem', 31750))
    .aspect(aspect('aqua') * 2)
    .register()