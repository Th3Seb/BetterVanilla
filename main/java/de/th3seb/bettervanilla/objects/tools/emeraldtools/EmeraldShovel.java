package de.th3seb.bettervanilla.objects.tools.emeraldtools;

import de.th3seb.bettervanilla.BetterVanilla;
import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class EmeraldShovel extends ItemSpade implements IHasModel {
    public EmeraldShovel(String name, ToolMaterial material) {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
        setCreativeTab(BetterVanilla.bettervanillaweaponandtoolstab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        BetterVanilla.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
