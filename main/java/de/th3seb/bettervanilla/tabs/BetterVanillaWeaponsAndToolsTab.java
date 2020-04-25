package de.th3seb.bettervanilla.tabs;

import de.th3seb.bettervanilla.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterVanillaWeaponsAndToolsTab extends CreativeTabs {

    public BetterVanillaWeaponsAndToolsTab(String label) {
        super("bettervanillaweaponandtoolstab");
        this.setBackgroundImageName("bettervanilla.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.SWORD_EMERALD);
    }
}
