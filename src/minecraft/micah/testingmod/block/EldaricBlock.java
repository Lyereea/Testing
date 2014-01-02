package micah.testingmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EldaricBlock extends Block {

	public EldaricBlock(int id, Material material) {
		super(id, material);
			setCreativeTab(CreativeTabs.tabBlock);
			setHardness(5.0f);
			setStepSound(Block.soundStoneFootstep);
	}

}
