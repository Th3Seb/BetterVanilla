package de.th3seb.bettervanilla.tabs;

import de.th3seb.bettervanilla.init.BlockInit;
import de.th3seb.bettervanilla.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterVanillaBlocks extends CreativeTabs {

    public BetterVanillaBlocks(String label){
        super("bettervanillablockstab");
        this.setBackgroundImageName("bettervanilla.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BlockInit.RUBY_ORE);
    }
}
