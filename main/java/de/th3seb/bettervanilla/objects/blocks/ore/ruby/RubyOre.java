package de.th3seb.bettervanilla.objects.blocks.ore.ruby;

import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.objects.blocks.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class RubyOre extends BlockBase {
    public RubyOre(String name, Material mat){
        super(name, mat);
        setSoundType(SoundType.METAL);
        setHardness(3.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return ItemInit.RUBY;
    }

    @Override
    public int quantityDropped(Random random) {
        int max = 4;
        int min = 1;
        return random.nextInt(max) + min;
    }
}
