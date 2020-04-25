package de.th3seb.bettervanilla.objects.armor;

import de.th3seb.bettervanilla.BetterVanilla;
import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorEmerald extends ItemArmor implements IHasModel {
    public ArmorEmerald(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(BetterVanilla.bettervanillaarmortab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        BetterVanilla.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
