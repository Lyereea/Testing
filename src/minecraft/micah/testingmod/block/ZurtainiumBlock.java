package micah.testingmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZurtainiumBlock extends Block {

	public ZurtainiumBlock(int id, Material material) {
		super(id, material);
			setCreativeTab(CreativeTabs.tabBlock);
			setHardness(3.0f);
			setStepSound(Block.soundStoneFootstep);
	}

}
