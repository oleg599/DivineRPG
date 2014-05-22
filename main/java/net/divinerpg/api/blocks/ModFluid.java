package net.divinerpg.api.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class ModFluid extends Fluid {

    //TODO: Will modify once someone explains why a class for this is even needed, and how its a block...
	public ModFluid(String fluidName, int density, int viscosity) {
		super(fluidName);
		setDensity(density);
		setViscosity(viscosity);
		FluidRegistry.registerFluid(this);
	}
}