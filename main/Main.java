package main;

import Enum.Orientation;
import model.Satellite;

public class Main {

	public static void main(String[] args) {
		Satellite satellite = new Satellite();
        satellite.rotate(Orientation.NORTH);
        satellite.activatePanels();
        satellite.collectData();
        satellite.printState();
    }
		// TODO Auto-generated method stub

	}
