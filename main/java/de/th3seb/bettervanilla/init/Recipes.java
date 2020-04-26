package de.th3seb.bettervanilla.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
    public static void init(){
        GameRegistry.addSmelting(BlockInit.COPPER_ORE, new ItemStack(ItemInit.COPPER_INGOT, 1), 1F);
        GameRegistry.addSmelting(BlockInit.COPPER_NETHER_ORE, new ItemStack(ItemInit.COPPER_INGOT, 1), 2F);
        GameRegistry.addSmelting(BlockInit.COPPER_END_ORE, new ItemStack(ItemInit.COPPER_INGOT, 2), 3F);
    }
}
