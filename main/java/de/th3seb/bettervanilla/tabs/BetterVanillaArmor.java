package de.th3seb.bettervanilla.tabs;

import de.th3seb.bettervanilla.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterVanillaArmor extends CreativeTabs {

    public BetterVanillaArmor(String label){
        super("bettervanillaarmortab");
        this.setBackgroundImageName("bettervanilla.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.HELMET_EMERALD);
    }
}
