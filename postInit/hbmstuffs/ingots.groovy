

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustSchrabidium'))
        .inputs(ore('dustTungsten') * 2)
        .fluidInputs(fluid('neodymium') * 250 )
        .outputs(item('hbm:ingot_magnetized_tungsten'))
        .property("temperature", 2400)
        .duration(1200).EUt(512).buildAndRegister()

recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(ore('dustSchrabidium'))
        .inputs(ore('dustTungsten') * 2)
        .fluidInputs(fluid('neodymium') * 250 )
        .outputs(item('hbm:ingot_magnetized_tungsten'))
        .property("temperature", 2400)
        .duration(1200).EUt(512).buildAndRegister()