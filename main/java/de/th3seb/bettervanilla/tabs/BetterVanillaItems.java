package de.th3seb.bettervanilla.tabs;

import de.th3seb.bettervanilla.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterVanillaItems extends CreativeTabs {

    public BetterVanillaItems(String label){
        super("bettervanillaitemstab");
        this.setBackgroundImageName("bettervanilla.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.RUBY);
    }
}

