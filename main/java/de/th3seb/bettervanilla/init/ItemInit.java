package de.th3seb.bettervanilla.init;

import de.th3seb.bettervanilla.objects.armor.ArmorBase;
import de.th3seb.bettervanilla.objects.items.ItemBase;
import de.th3seb.bettervanilla.objects.tools.*;
import de.th3seb.bettervanilla.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Material
    public static final Item.ToolMaterial TOOL_BLACK_DIAMOND = EnumHelper.addToolMaterial("tool_black_diamond", 4,2000, 10.0F, 5.0F, 20);
    public static final ItemArmor.ArmorMaterial ARMOR_BLACK_DIAMOND = EnumHelper.addArmorMaterial("armor_black_diamond", Reference.MODID + ":black_diamond", 40, new int[]{5, 9, 11, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5F);

    //Items
    public static final Item BLACK_DIAMOND = new ItemBase("black_diamond");

    //Tools
    public static final Item SWORD_BLACK_DIAMOND = new ToolSword("sword_black_diamond", TOOL_BLACK_DIAMOND);
    public static final Item PICKAXE_BLACK_DIAMOND = new ToolPickaxe("pickaxe_black_diamond", TOOL_BLACK_DIAMOND);
    public static final Item AXE_BLACK_DIAMOND = new ToolAxe("axe_black_diamond", TOOL_BLACK_DIAMOND);
    public static final Item SHOVEL_BLACK_DIAMOND = new ToolShovel("shovel_black_diamond", TOOL_BLACK_DIAMOND);
    public static final Item HOE_BLACK_DIAMOND = new ToolHoe("hoe_black_diamond", TOOL_BLACK_DIAMOND);

    //Armor
    public static final Item HELMET_BLACK_DIAMOND = new ArmorBase("helmet_black_diamond", ARMOR_BLACK_DIAMOND, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_BLACK_DIAMOND = new ArmorBase("chestplate_black_diamond", ARMOR_BLACK_DIAMOND, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_BLACK_DIAMOND = new ArmorBase("leggings_black_diamond", ARMOR_BLACK_DIAMOND, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_BLACK_DIAMOND = new ArmorBase("boots_black_diamond", ARMOR_BLACK_DIAMOND, 1, EntityEquipmentSlot.FEET);
}
