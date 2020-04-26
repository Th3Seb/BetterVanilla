package de.th3seb.bettervanilla.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedObsidianBlock extends BlockBase{
    public ReinforcedObsidianBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 3);
        setHardness(5.0F);
        setResistance(10.0F);
    }
}
