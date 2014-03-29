package net.divinerpg.api.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class ModFluid extends Fluid {

	public ModFluid(String fluidName, int density, int viscosity) {
		super(fluidName);
		setDensity(density);
		setViscosity(viscosity);
		FluidRegistry.registerFluid(this);
	}
}