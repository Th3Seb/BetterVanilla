package de.th3seb.bettervanilla.world;

import de.th3seb.bettervanilla.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class BetterVanillaWorldGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()){
            case -1:
                generateNetherOre(BlockInit.RUBY_NETHER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 250, random.nextInt(8) + 1, 25);
                generateNetherOre(BlockInit.COPPER_NETHER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 250, random.nextInt(5) + 1, 20);
                break;
            case 0:
                generateOre(BlockInit.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 30, random.nextInt(5) + 1, 15);
                generateOre(BlockInit.EMERALD_SHARD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 50, random.nextInt(5) + 1, 25);
                generateOre(BlockInit.COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 100, random.nextInt(7) + 1, 35);
                break;
            case 1:
                generateEndOre(BlockInit.RUBY_END_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 250, random.nextInt(11 - 3) + 3, 30);
                generateEndOre(BlockInit.COPPER_END_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 250, random.nextInt(10 - 2) + 2, 40);
                break;
        }
    }


    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances){
        int deltaY = maxY -minY;

        for (int i = 0; i < chances; i++){
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.STONE));
            generator.generate(world, random, pos);
        }
    }

    private void generateNetherOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances){
        int deltaY = maxY -minY;

        for (int i = 0; i < chances; i++){
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.NETHERRACK));
            generator.generate(world, random, pos);
        }
    }

    private void generateEndOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances){
        int deltaY = maxY -minY;

        for (int i = 0; i < chances; i++){
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.END_STONE));
            generator.generate(world, random, pos);
        }
    }
}
