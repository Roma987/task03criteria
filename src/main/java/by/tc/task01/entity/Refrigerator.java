package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance{
    // POWER_CONSUMPTION,
    // WEIGHT,
    // FREEZER_CAPACITY,
    // OVERALL_CAPACITY,
    // HEIGHT,
    // WIDTH
    private int powerConsumption;
    private int freezerCapacity;
    private double overallCapacity;

    public Refrigerator() {
    }

    public Refrigerator(Map<String, String> paramsMap) {
        this.powerConsumption = Integer.parseInt(paramsMap.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()));
        this.setWeight(Double.parseDouble(paramsMap.get(SearchCriteria.Refrigerator.WEIGHT.toString())));
        this.freezerCapacity = Integer.parseInt(paramsMap.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()));
        this.overallCapacity = Double.parseDouble(paramsMap.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
        this.setHeight(Double.parseDouble(paramsMap.get(SearchCriteria.Refrigerator.HEIGHT.toString())));
        this.setWidth(Double.parseDouble(paramsMap.get(SearchCriteria.Refrigerator.WIDTH.toString())));
    }

    public Refrigerator(double width, double height, double weight, int powerConsumption, int freezerCapacity, double overallCapacity) {
        super(width, 0, height, weight);
        this.powerConsumption = powerConsumption;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption && freezerCapacity == that.freezerCapacity && overallCapacity == that.overallCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, freezerCapacity, overallCapacity);
    }

    @Override
    public String toString() {
        return Refrigerator.class.getName() + "{" +
                "powerConsumption=" + powerConsumption +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                super.toString() + "} ";
    }
}

