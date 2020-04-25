package de.th3seb.bettervanilla.util.handlers;

import de.th3seb.bettervanilla.init.BlockInit;
import de.th3seb.bettervanilla.init.ItemInit;
import de.th3seb.bettervanilla.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onBLockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for (Item item : ItemInit.ITEMS){
            if (item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }

        }

        for (Block block : BlockInit.BLOCKS){
            if (block instanceof  IHasModel){
                ((IHasModel)block).registerModels();
            }
        }
    }

}
