package micah.testingmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BloodBlock extends Block {

	public BloodBlock(int id, Material material) {
		super(id, material);
		setCreativeTab(CreativeTabs.tabBlock);
	}

}
