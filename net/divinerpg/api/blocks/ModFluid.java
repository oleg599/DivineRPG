package net.divinerpg.api.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluid extends Fluid {

	public ModFluid(String fluidName) {
		super(fluidName);
		setDensity(10);
		setViscosity(5000);
		FluidRegistry.registerFluid(this);
	}
}