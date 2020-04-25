package de.th3seb.bettervanilla.objects.blocks.ore.ruby;

import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.objects.blocks.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class RubyEndOre extends RubyOre {
    public RubyEndOre(String name, Material mat){
        super(name, mat);
    }

    @Override
    public int quantityDropped(Random random) {
        int max = 6;
        int min = 4;
        return random.nextInt(max) + min;
    }
}
