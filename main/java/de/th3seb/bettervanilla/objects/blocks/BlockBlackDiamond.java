package de.th3seb.bettervanilla.objects.blocks;

import de.th3seb.bettervanilla.BetterVanilla;
import de.th3seb.bettervanilla.init.BlockInit;
import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBlackDiamond extends BlockBase {


    public BlockBlackDiamond(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(2.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
    }
}
