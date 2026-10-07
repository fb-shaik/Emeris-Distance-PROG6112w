/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import com.landscaping.PricingCalculations.Pricing;
import com.landscaping.exceptions.InvalidDimensionException;
import com.landscaping.interfaces.EquipmentService;
import com.landscaping.model.Rectangle;

/**
 *
 * @author nmagongo
 */
public class PoolPainting extends extends LandscapingService
        implements EquipmentService
{
     private Rectangle pool;
    private double depth;

    public PoolPainting(Rectangle pool, double depth) {

        super("Swimming Pool Painting");

        this.pool = pool;
        this.depth = depth;
    }

    @Override
    public double calculateCost()
            throws InvalidDimensionException {

        if (depth <= 0) {
            throw new InvalidDimensionException(
                    "Pool depth must be greater than zero."
            );
        }

        double paintingArea =
                (pool.getLength() * pool.getWidth())
                + (2 * pool.getLength() * depth)
                + (2 * pool.getWidth() * depth);

        materialCost =
                paintingArea * Pricing.PAINT_MATERIAL_PER_M2;
         labourCost =
                paintingArea * Pricing.PAINT_LABOUR_PER_M2;

        return materialCost
                + labourCost
                + calculateEquipmentCost();
    }

    @Override
    public double calculateEquipmentCost() {
        return Pricing.PAINT_EQUIPMENT;
    }
    
}
