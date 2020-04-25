package de.th3seb.bettervanilla.objects.tools.rubytools;

import de.th3seb.bettervanilla.BetterVanilla;
import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class RubyAxe extends ItemAxe implements IHasModel {
    public RubyAxe(String name, ToolMaterial material) {
        super(material, 11.0F, -3.0F);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(BetterVanilla.bettervanillaweaponandtoolstab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        BetterVanilla.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
