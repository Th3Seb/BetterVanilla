package de.th3seb.bettervanilla.objects.blocks.ore.copper;

import de.th3seb.bettervanilla.objects.blocks.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperOre extends BlockBase {
    public CopperOre(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(2.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 1);
    }
}
