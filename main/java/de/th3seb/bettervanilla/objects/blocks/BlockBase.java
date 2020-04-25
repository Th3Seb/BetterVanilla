package de.th3seb.bettervanilla.objects.blocks;

import de.th3seb.bettervanilla.BetterVanilla;
import de.th3seb.bettervanilla.init.BlockInit;
import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(BetterVanilla.bettervanillablockstab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        BetterVanilla.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
