package de.th3seb.bettervanilla.init;

import de.th3seb.bettervanilla.objects.blocks.BlockBlackDiamond;
import de.th3seb.bettervanilla.objects.blocks.ore.ruby.RubyEndOre;
import de.th3seb.bettervanilla.objects.blocks.ore.ruby.RubyNetherOre;
import de.th3seb.bettervanilla.objects.blocks.ore.ruby.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_BLACK_DIAMOND = new BlockBlackDiamond("block_black_diamond", Material.IRON);

    //Ore-----------------------------------------------------------------------------------------------------------
    //Overworld
    public static final Block RUBY_ORE = new RubyOre("ore_ruby", Material.IRON);

    //Nether
    public static final Block RUBY_NETHER_ORE = new RubyNetherOre("ore_nether_ruby", Material.IRON);

    //End
    public static final Block RUBY_END_ORE = new RubyEndOre("ore_end_ruby", Material.IRON);

}
