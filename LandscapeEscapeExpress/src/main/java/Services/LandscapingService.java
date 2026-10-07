/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

/**
 *
 * @author nmagongo
 */
public abstract class LandscapingService
{
    private String serviceName;

    protected double labourCost;
    protected double materialCost;

    public LandscapingService(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getLabourCost() {
        return labourCost;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public abstract double calculateCost()
            throws InvalidDimensionException;

    public void displayServiceDetails() {

        System.out.println("Service: " + serviceName);
        System.out.println("Labour: R" + labourCost);
        System.out.println("Materials: R" + materialCost);
    }
    
}
