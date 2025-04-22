package com.stonurd.testmod;

import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;


import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidInteractionRegistry;
import net.minecraftforge.fluids.FluidInteractionRegistry.InteractionInformation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class Fluidinteraction {

      public static final DeferredRegister<Fluid> FLUIDS =
      DeferredRegister.create(ForgeRegistries.FLUIDS, testmod.MODID);

        
        public static void postInit() {

                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.BLOCK_OF_SCARLET_NEODYMIUM.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.GALENA.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.BLOCK_OF_AZURE_NEODYMIUM.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.GALENA.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.DRAIN.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.ABYSSMARINE.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.AMBER.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.LIMESTONE.get().defaultBlockState()
        ));
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(ACBlockRegistry.PRIMAL_MAGMA.get()) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.FLOOD_BASALT.get().defaultBlockState()
        ));
        //test with vanilla block
                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(Blocks.NETHERRACK) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        Blocks.NETHERRACK.defaultBlockState()
        ));

                FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
                        (level, currentPos, relativePos, currentState) -> level.getBlockState(currentPos.below()).is(Blocks.NETHERITE_BLOCK) && level.getBlockState(relativePos).is(Blocks.BLUE_ICE),
                        ACBlockRegistry.FLOOD_BASALT.get().defaultBlockState()
        ));


}

public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
 }
}

