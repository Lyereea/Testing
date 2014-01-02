package micah.testingmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlairzariumBlock extends Block {

	public BlairzariumBlock(int id, Material material) {
		super(id, material);
			setCreativeTab(CreativeTabs.tabBlock);
			setHardness(3.0f);
			setStepSound(Block.soundStoneFootstep);
	}

}
