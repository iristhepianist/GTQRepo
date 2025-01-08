
recipemap('mixer').recipeBuilder()
        .inputs(ore('dustGold'))
        .inputs(ore('dustRedstone') * 4)
        .inputs(ore('dustEnderPearl') * 2)
        .inputs(ore('dustIron') * 4)
        .fluidInputs(fluid('mercury') * 277 )
        .outputs(item('gregtech:meta_dust', 32110))
        .duration(120).EUt(220).buildAndRegister()

recipemap('mixer').recipeBuilder()
        .inputs(ore('dustIron'))
        .inputs(ore('dustRedstone') * 4)
        .outputs(item('gregtech:meta_dust', 32146))
        .duration(120).EUt(220).buildAndRegister()

recipemap('mixer').recipeBuilder()
        .inputs(ore('dustIron'))
        .inputs(ore('dustenergeticAlloy'))
        .outputs(item('gregtech:meta_dust', 32114) * 2)
        .duration(120).EUt(220).buildAndRegister()