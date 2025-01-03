mods.pyrotech.kiln.recipeBuilder()
    .input(item('tconstruct:soil'))
    .output(item('tconstruct:materials'))
    .burnTime(1200)
    .failureChance(0.2f)
    .failureOutput(item('minecraft:brick'), item('minecraft:clay'), item('minecraft:gravel'))
    .name('searedtinkerswfail_items')
    .register()

mods.tconstruct.alloying.removeByOutput(fluid('signalum'))
mods.tconstruct.alloying.removeByOutput(fluid('lumium'))
mods.tconstruct.alloying.removeByOutput(fluid('enderium'))
mods.tconstruct.alloying.removeByOutput(fluid('pulsating_iron'))
mods.tconstruct.alloying.removeByOutput(fluid('redstone_alloy'))
mods.tconstruct.alloying.removeByOutput(fluid('dark_steel'))
mods.tconstruct.alloying.removeByOutput(fluid('energetic_alloy'))
mods.tconstruct.alloying.removeByOutput(fluid('energetic_silver'))
mods.tconstruct.alloying.removeByOutput(fluid('vivid_alloy'))
mods.tconstruct.alloying.removeByOutput(fluid('conductive_iron'))