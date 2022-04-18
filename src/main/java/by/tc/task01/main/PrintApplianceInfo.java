package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
		public static void print(List<Appliance> appliance) {
			for (Appliance app: appliance) {
				System.out.println(app.toString());
			}
		}
	}
	
	// you may add your own code here

