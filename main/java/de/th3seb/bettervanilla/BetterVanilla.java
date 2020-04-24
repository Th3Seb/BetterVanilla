package de.th3seb.bettervanilla;

import de.th3seb.bettervanilla.proxy.CommonProxy;
import de.th3seb.bettervanilla.tabs.BetterVanillaTab;
import de.th3seb.bettervanilla.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class BetterVanilla {

    public static final CreativeTabs bettervanillatab = new BetterVanillaTab("bettervanillatab");

    @Mod.Instance
    public static BetterVanilla instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event){

    }

}
