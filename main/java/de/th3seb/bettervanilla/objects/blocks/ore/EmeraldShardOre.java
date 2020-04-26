package de.th3seb.bettervanilla.objects.blocks.ore;

import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.objects.blocks.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class EmeraldShardOre extends BlockBase {
    public EmeraldShardOre(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(2.0F);
        setHarvestLevel("pickaxe",2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return ItemInit.EMERALD_SHARD;
    }

    @Override
    public int quantityDropped(Random random) {
        int max = 4;
        int min = 1;
        return random.nextInt(max) + min;
    }
}
