package micah.testingmod;
 
import micah.testingmod.block.BlairzariumBlock;
import micah.testingmod.block.BloodBlock;
import micah.testingmod.block.EldaricBlock;
import micah.testingmod.block.ZurtainiumBlock;
import micah.testingmod.item.BlairzariumAxe;
import micah.testingmod.item.BlairzariumItem;
import micah.testingmod.item.BlairzariumPickaxe;
import micah.testingmod.item.BlairzariumSpade;
import micah.testingmod.item.BlairzariumSword;
import micah.testingmod.item.EldaricAxe;
import micah.testingmod.item.EldaricHoe;
import micah.testingmod.item.EldaricItem;
import micah.testingmod.item.EldaricPickaxe;
import micah.testingmod.item.EldaricSpade;
import micah.testingmod.item.EldaricSword;
import micah.testingmod.item.ZurtainiumAxe;
import micah.testingmod.item.ZurtainiumHoe;
import micah.testingmod.item.ZurtainiumItem;
import micah.testingmod.item.ZurtainiumPickaxe;
import micah.testingmod.item.ZurtainiumSpade;
import micah.testingmod.item.armor.ZurtaniumArmor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid=TestingModInfo.ID, name=TestingModInfo.NAME, version=TestingModInfo.VERS)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class TestingMod {
		
	public EnumToolMaterial blairzar = EnumHelper.addToolMaterial("Blairzarium", 1, 475, 5.0f, 2.0f, 20);
	public EnumToolMaterial zurtain = EnumHelper.addToolMaterial("Zurtainium", 1, 1635, 9.0f, 2.0f, 27);
	public EnumToolMaterial eldar = EnumHelper.addToolMaterial("Eldaric", 3, 893, 4.0f, 3.0f, 38);
	
	public EnumArmorMaterial blairzarium = EnumHelper.addArmorMaterial("Blairzarium", 201, new int[]{0, 7, 0, 3}, 20);
	public EnumArmorMaterial zurtainium = EnumHelper.addArmorMaterial("Zurtainium", 764, new int[]{4, 7, 6, 3}, 27);
	public EnumArmorMaterial eldaric = EnumHelper.addArmorMaterial("Eldaric", 469, new int[]{0, 7, 0, 3}, 20);
	
	// Blarzarium tools, W00t!
	public final Item blairzariumSword =  new BlairzariumSword(2440, blairzar).setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1).setUnlocalizedName("blairzariumSword").setTextureName(TestingModInfo.NAME.toLowerCase() + ":blairzariumsword");
	public final Item blairzariumAxe =  new BlairzariumAxe(2441, blairzar).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("blairzariumAxe").setTextureName(TestingModInfo.NAME.toLowerCase() + ":blairzariumhatchet");
	public final Item blairzariumPickaxe =  new BlairzariumPickaxe(2442, blairzar).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("blairzariumPickaxe").setTextureName(TestingModInfo.NAME.toLowerCase() + ":blairzariumpickaxe");
	public final Item blairzariumSpade =  new BlairzariumSpade(2443, blairzar).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("blairzariumSpade").setTextureName(TestingModInfo.NAME.toLowerCase() + ":blairzariumspade");
	
	// Zurtainium tools, W00t! 
	public final Item zurtainiumAxe =  new ZurtainiumAxe(2446, zurtain).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("zurtainiumAxe").setTextureName(TestingModInfo.NAME.toLowerCase() + ":zurtainiumaxe");
	public final Item zurtainiumPickaxe =  new ZurtainiumPickaxe(2447, zurtain).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("zurtainiumPickaxe").setTextureName(TestingModInfo.NAME.toLowerCase() + ":zurtainiumpickaxe");
	public final Item zurtainiumSpade =  new ZurtainiumSpade(2448, zurtain).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("zurtainiumSpade").setTextureName(TestingModInfo.NAME.toLowerCase() + ":zurtainiumspade");
	public final Item zurtainiumHoe =  new ZurtainiumHoe(2449, zurtain).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("zurtainiumHoe").setTextureName(TestingModInfo.NAME.toLowerCase() + ":zurtainiumhoe");
	
	//Eldaric tools, W00t!
	public final Item eldaricSword = new EldaricSword(2454, eldar).setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1).setUnlocalizedName("eldaricSword").setTextureName(TestingModInfo.NAME.toLowerCase() + ":eldaricsword");
	public final Item eldaricAxe = new EldaricAxe(2455, eldar).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("eldaricAxe").setTextureName(TestingModInfo.NAME.toLowerCase() + ":eldaricaxe");
	public final Item eldaricHoe = new EldaricHoe(2456, eldar).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("eldaricHoe").setTextureName(TestingModInfo.NAME.toLowerCase() + ":eldarichoe");
	public final Item eldaricPickaxe = new EldaricPickaxe(2457, eldar).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("eldaricPickaxe").setTextureName(TestingModInfo.NAME.toLowerCase() + ":eldaricpickaxe");
	public final Item eldaricSpade = new EldaricSpade(2458, eldar).setCreativeTab(CreativeTabs.tabTools).setMaxStackSize(1).setUnlocalizedName("eldaricSpade").setTextureName(TestingModInfo.NAME.toLowerCase() + ":eldaricspade");
	
	// Zurtainium Armor!
	public final Item zurtainiumHelmet = new ZurtaniumArmor(2450, zurtainium, 0, 0).setMaxStackSize(1).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("zurtainiumHelmet").setTextureName(TestingModInfo.NAME.toLowerCase() + ":zurtainiumhelmet");
	
	public final static Block blairzariumBlock = new BlairzariumBlock(2651, Material.rock).setUnlocalizedName("blairzariumBlock").setTextureName(TestingModInfo.NAME.toLowerCase() + ":blairzariumblock");
	
	public final static Block blairzariumOre = new BlairzariumBlock(2650, Material.rock).setUnlocalizedName("blairzariumOre").setTextureName(TestingModInfo.NAME.toLowerCase() + ":blairzariumore"); // Tryout ore for modding, to make sure I know how to do it.	
	public final static Block zurtainiumOre = new ZurtainiumBlock(2652, Material.rock).setUnlocalizedName("zurtainiumOre").setTextureName(TestingModInfo.NAME.toLowerCase() + ":zurtainiumore");
	public final static Block eldaricOre = new EldaricBlock(2655, Material.rock).setUnlocalizedName("eldaricOre").setTextureName(TestingModInfo.NAME.toLowerCase() + ":eldaricore");
	
	public final static Item blairzariumIngot = new BlairzariumItem(2433).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("blairzariumIngot").setTextureName(TestingModInfo.NAME.toLowerCase() + ":blairzariumingot" ); // Tryout item for modding, to make sure I know how to do it.
	public final static Item zurtainiumIngot = new ZurtainiumItem(2435).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("zurtainiumIngot").setTextureName(TestingModInfo.NAME.toLowerCase() + ":zurtainiumingot");
	public final static Item eldaricIngot = new EldaricItem(2437).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("eldaricIngot").setTextureName(TestingModInfo.NAME.toLowerCase() + ":eldaricingot");

	public final static Item blairzariumNugget = new BlairzariumItem(2434).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("blairzariumNugget").setTextureName(TestingModInfo.NAME.toLowerCase() + ":blairzariumnugget"); // Code for my blairzarium nugget.
	public final static Item zurtainiumNugget = new ZurtainiumItem(2436).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("zurtainiumNugget").setTextureName(TestingModInfo.NAME.toLowerCase() + ":zurtainiumnugget");
	public final static Item eldaricNugget = new EldaricItem(2438).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("eldaricNugget").setTextureName(TestingModInfo.NAME.toLowerCase() + ":eldaricnugget");

	//Blood tree blocks
	public final static Block bloodLeaf = new BloodBlock(2649, Material.leaves).setUnlocalizedName("bloodLeaf").setTextureName(TestingModInfo.NAME.toLowerCase() + ":bloodleaf").setLightOpacity(1).setLightValue(1.5f);
	public final static Block bloodWood = new BloodBlock(2648, Material.wood).setUnlocalizedName("bloodWood").setTextureName(TestingModInfo.NAME.toLowerCase() + ":bloodwood").setLightOpacity(1).setLightValue(1.5f);	
	
	EventManager oreManager = new EventManager();
	TreeManager treeManager = new TreeManager();
	
        // The instance of your mod that Forge uses.
        @Instance(TestingModInfo.NAME)
        public static TestingMod instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide=TestingModInfo.CLIENTPROXY + "ClientProxy", serverSide=TestingModInfo.COMMONPROXY + "CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                ItemStack ironIngot = new ItemStack(Item.ingotIron);
                ItemStack blazePowder = new ItemStack(Item.blazePowder);
                ItemStack stick = new ItemStack(Item.stick);
                ItemStack diamond = new ItemStack(Item.diamond);


                
                // The code below will be for my Mod stuff.

                // Code for ore, can change things later on. 
                GameRegistry.registerBlock(blairzariumOre, "blairzariumOre");
                LanguageRegistry.addName(blairzariumOre, "Blairzarium Ore");
                MinecraftForge.setBlockHarvestLevel(blairzariumOre, "pickaxe", 2); // Harvesting levels: 0=wood/gold, 1=stone, 2=iron, 3=diamond
              
                GameRegistry.registerBlock(blairzariumBlock, "blairzariumBlock"); // Blairzarium block
                LanguageRegistry.addName(blairzariumBlock, "Blairzarium Block");
                MinecraftForge.setBlockHarvestLevel(blairzariumBlock, "pickaxe", 2); 
                
                GameRegistry.registerBlock(zurtainiumOre, "zurtainiumOre");
                LanguageRegistry.addName(zurtainiumOre, "Zurtainium Ore");
                MinecraftForge.setBlockHarvestLevel(zurtainiumOre, "pickaxe", 2);
                
                GameRegistry.registerBlock(eldaricOre, "eldaricOre");
                LanguageRegistry.addName(eldaricOre, "Eldaric Ore");
                MinecraftForge.setBlockHarvestLevel(eldaricOre, "pickaxe", 3);
                
                // My tools, pain in the butt to make them work, but it's a step ahead
                // Blairzarium tools
                GameRegistry.registerItem(blairzariumSword, "blairzariumSword");
                LanguageRegistry.addName(blairzariumSword, "Blairzarium Sword");
                
                GameRegistry.registerItem(blairzariumAxe, "blairzariumAxe");
                LanguageRegistry.addName(blairzariumAxe, "Blairzarium Axe");
                
                GameRegistry.registerItem(blairzariumPickaxe, "blairzariumPickaxe");
                LanguageRegistry.addName(blairzariumPickaxe, "Blairzarium Pickaxe");
                
                GameRegistry.registerItem(blairzariumSpade, "blairzariumSpade");
                LanguageRegistry.addName(blairzariumSpade, "Blairzarium Shovel");
                
                // Zurtainium tools & armor
                GameRegistry.registerItem(zurtainiumAxe, "zurtainiumAxe");
                LanguageRegistry.addName(zurtainiumAxe, "Zurtainium Axe");

                GameRegistry.registerItem(zurtainiumHoe, "zurtainiumHoe");
                LanguageRegistry.addName(zurtainiumHoe, "Zurtainium Hoe");

                GameRegistry.registerItem(zurtainiumPickaxe, "zurtainiumPickaxe");
                LanguageRegistry.addName(zurtainiumPickaxe, "Zurtainium Pickaxe");

                GameRegistry.registerItem(zurtainiumSpade, "zurtainiumSpade");
                LanguageRegistry.addName(zurtainiumSpade, "Zurtainium Shovel");
                
                GameRegistry.registerItem(zurtainiumHelmet, "zurtainiumHelmet");
                LanguageRegistry.addName(zurtainiumHelmet, "Zurtainium Helmet");
                
                // Eldaric tools
                GameRegistry.registerItem(eldaricAxe, "eldaricAxe");
                LanguageRegistry.addName(eldaricAxe, "Eldaric Axe");

                GameRegistry.registerItem(eldaricHoe, "eldaricHoe");
                LanguageRegistry.addName(eldaricHoe, "Eldaric Hoe");

                GameRegistry.registerItem(eldaricPickaxe, "eldaricPickaxe");
                LanguageRegistry.addName(eldaricPickaxe, "Eldaric Pickaxe");

                GameRegistry.registerItem(eldaricSpade, "eldaricSpade");
                LanguageRegistry.addName(eldaricSpade, "Eldaric Shovel");

                GameRegistry.registerItem(eldaricSword, "eldaricSword");
                LanguageRegistry.addName(eldaricSword, "Eldaric Sword");
           
                //For my blood trees, may keep or scrap
                GameRegistry.registerBlock(bloodLeaf, "bloodLeaf");
                LanguageRegistry.addName(bloodLeaf, "Blood Leaf");
                
                GameRegistry.registerBlock(bloodWood, "bloodWood");
                LanguageRegistry.addName(bloodWood, "Blood Wood");

                GameRegistry.registerItem(blairzariumNugget, "blairzariumNugget");
                LanguageRegistry.addName(blairzariumNugget, "Blairzarium Nugget");
                
                GameRegistry.registerItem(blairzariumIngot, "blairzariumIngot");
                LanguageRegistry.addName(blairzariumIngot, "Blairzarium Ingot");
                
                GameRegistry.registerItem(zurtainiumNugget, "zurtainiumNugget");
                LanguageRegistry.addName(zurtainiumNugget, "Zurtainium Nugget");
                
                GameRegistry.registerItem(zurtainiumIngot, "zurtainiumIngot");
                LanguageRegistry.addName(zurtainiumIngot, "Zurtainium Ingot");
                
                GameRegistry.registerItem(eldaricIngot, "eldaricIngot");
                LanguageRegistry.addName(eldaricIngot, "Eldaric Ingot");
                
                GameRegistry.registerItem(eldaricNugget, "eldaricNugget");
                LanguageRegistry.addName(eldaricNugget, "Eldaric Nugget");
                
                ItemStack blairzariumBlock = new ItemStack(TestingMod.blairzariumBlock);
                ItemStack blairzariumOre = new ItemStack(TestingMod.blairzariumOre);
                ItemStack zurtainiumOre = new ItemStack(TestingMod.zurtainiumOre);                
                ItemStack blairzariumNugget = new ItemStack(TestingMod.blairzariumNugget);
                ItemStack blairzariumNuggetTwo = new ItemStack(TestingMod.blairzariumNugget, 2);
                ItemStack blairzariumIngotMore = new ItemStack(TestingMod.blairzariumIngot, 9);
                ItemStack blairzariumIngot = new ItemStack(TestingMod.blairzariumIngot); // Blairzarium Ingot!!!!
                ItemStack zurtainiumIngot = new ItemStack(TestingMod.zurtainiumIngot); // Zurtainium Ingot!!!!
                ItemStack zurtainiumNugget = new ItemStack(TestingMod.zurtainiumNugget);
                ItemStack zurtainiumNuggetTwo = new ItemStack(TestingMod.zurtainiumNugget, 2);
                ItemStack eldaricIngot = new ItemStack(TestingMod.eldaricIngot);
                ItemStack eldaricNugget = new ItemStack(TestingMod.eldaricNugget);
                ItemStack eldaricNuggetTwo = new ItemStack(TestingMod.eldaricNugget, 2);
                
                GameRegistry.addRecipe(blairzariumIngot, "xxx", "xyx", "xxx",
                		'x', blairzariumNugget, 'y', ironIngot);
                GameRegistry.addShapelessRecipe(blairzariumIngotMore, blairzariumBlock);
                GameRegistry.addRecipe(blairzariumBlock, "xxx", "xxx", "xxx",
                		'x', blairzariumIngot);
                GameRegistry.addRecipe(eldaricIngot, "eze", "bib", "eze",
                		'e', eldaricNugget, 'i', ironIngot, 'b', blairzariumIngot, 'z', zurtainiumIngot);
                GameRegistry.addRecipe(eldaricIngot, "ebe", "ziz", "ebe",
                		'e', eldaricNugget, 'i', ironIngot, 'b', blairzariumIngot, 'z', zurtainiumIngot);
                GameRegistry.addRecipe(zurtainiumIngot, "xxx", "xyx", "xxx",
                		'x', zurtainiumNugget, 'y', ironIngot);
                
                GameRegistry.addSmelting(TestingMod.blairzariumOre.blockID, blairzariumNuggetTwo, 16.0f);
                GameRegistry.addSmelting(TestingMod.zurtainiumOre.blockID, zurtainiumNuggetTwo, 16.0f);
                GameRegistry.addSmelting(TestingMod.eldaricOre.blockID, eldaricNuggetTwo, 32.0f);
                
                // World Gen code
                GameRegistry.registerWorldGenerator(oreManager);
                GameRegistry.registerWorldGenerator(treeManager);
                
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}