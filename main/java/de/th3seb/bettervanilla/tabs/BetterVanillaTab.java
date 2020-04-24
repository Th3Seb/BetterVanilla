package de.th3seb.bettervanilla.tabs;

import de.th3seb.bettervanilla.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterVanillaTab extends CreativeTabs {

    public BetterVanillaTab(String label) {
        super("bettervanillatab");
        this.setBackgroundImageName("bettervanilla.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.BLACK_DIAMOND);
    }
}
