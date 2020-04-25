package de.th3seb.bettervanilla;

import de.th3seb.bettervanilla.proxy.CommonProxy;
import de.th3seb.bettervanilla.tabs.BetterVanillaArmor;
import de.th3seb.bettervanilla.tabs.BetterVanillaBlocks;
import de.th3seb.bettervanilla.tabs.BetterVanillaItems;
import de.th3seb.bettervanilla.tabs.BetterVanillaWeaponsAndToolsTab;
import de.th3seb.bettervanilla.util.Reference;
import de.th3seb.bettervanilla.world.BetterVanillaWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class BetterVanilla {

    public static final CreativeTabs bettervanillaweaponandtoolstab = new BetterVanillaWeaponsAndToolsTab("bettervanillaweaponandtoolstab");
    public static final CreativeTabs bettervanillaarmortab = new BetterVanillaArmor("bettervanillaarmortab");
    public static final CreativeTabs bettervanillaitemstab = new BetterVanillaItems("bettervanillaitemstab");
    public static final CreativeTabs bettervanillablockstab = new BetterVanillaBlocks("bettervanillablockstab");


    @Mod.Instance
    public static BetterVanilla instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event){
        GameRegistry.registerWorldGenerator(new BetterVanillaWorldGen(), 0);
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }

}
