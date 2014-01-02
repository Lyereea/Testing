package micah.testingmod.item.armor;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ZurtaniumArmor extends ItemArmor {

	public ZurtaniumArmor(int id, EnumArmorMaterial zurtainium,
			int par3, int par4) {
		super(id, zurtainium, par3, par4);

	}
	
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par1ItemStack.addEnchantment(Enchantment.fireProtection, 4);
    
    }
	
}
