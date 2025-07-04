mods.pyrotech.kiln.recipeBuilder()
    .input(item('tconstruct:soil'))
    .output(item('tconstruct:materials'))
    .burnTime(1200)
    .failureChance(0.2f)
    .failureOutput(item('minecraft:brick'), item('minecraft:clay'), item('minecraft:gravel'))
    .name('searedtinkerswfail_items')
    .register()

mods.pyrotech.anvil.recipeBuilder()
    .input(ore('oreDiamond'))
    .output(item('gregtech:meta_crushed', 276))
    .hits(12)
    .typePickaxe()
    .tierIronclad()
    .name('diamond_oreproc1')
    .register()

mods.tconstruct.alloying.removeByOutput(fluid('signalum'))
mods.tconstruct.alloying.removeByOutput(fluid('lumium'))
mods.tconstruct.alloying.removeByOutput(fluid('enderium'))
mods.tconstruct.alloying.removeByOutput(fluid('pulsating_iron'))
mods.tconstruct.alloying.removeByOutput(fluid('redstone_alloy'))
mods.tconstruct.alloying.removeByOutput(fluid('dark_steel'))
mods.tconstruct.alloying.removeByOutput(fluid('energetic_alloy'))
mods.tconstruct.alloying.removeByOutput(fluid('vivid_alloy'))
mods.tconstruct.alloying.removeByOutput(fluid('conductive_iron'))
mods.tconstruct.alloying.removeByOutput(fluid('energetic_silver'))

mods.pyrotech.soaking_pot.recipeBuilder()
    .input(item('gregtech:meta_crushed', 276))
    .fluidInput(fluid('water') * 100)
    .output(item('gregtech:meta_crushed_purified', 276))
    .time(400)
    .campfireRequired(true)
    .name('diamond_oreproc2')
    .register()

mods.pyrotech.kiln.recipeBuilder()
    .input(ore('dustDiamond'))
    .output(item('minecraft:diamond'))
    .burnTime(12000)
    .failureChance(0.6f)
    .failureOutput(item('pyrotech:material', 18), item('gregtech:meta_dust_impure', 276))
    .name('diamond_oreprocfinal')
    .register()
