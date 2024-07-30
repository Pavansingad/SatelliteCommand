package model;

import Enum.Orientation;
import Enum.SolarPanelStatus;
import util.EnumUtils;
import util.Logger;

public class Satellite {
	    private Orientation orientation;
	    private SolarPanelStatus solarPanels;
	    private int dataCollected;

	    public Satellite() {
	        this.orientation = Orientation.NORTH;
	        this.solarPanels = SolarPanelStatus.INACTIVE;
	        this.dataCollected = 0;
	    }

	    public void rotate(Orientation direction) {
	        if (EnumUtils.isValidEnum(direction)) {
	            this.orientation = direction;
	        } else {
	            Logger.logError("Invalid direction");
	        }
	    }

	    public void activatePanels() {
	        this.solarPanels = SolarPanelStatus.ACTIVE;
	    }

	    public void deactivatePanels() {
	        this.solarPanels = SolarPanelStatus.INACTIVE;
	    }

	    public void collectData() {
	        if (this.solarPanels == SolarPanelStatus.ACTIVE) {
	            this.dataCollected += 10;
	        } else {
	            Logger.logError("Solar panels are not active");
	        }
	    }

	    public void printState() {
	        Logger.logInfo("Orientation: " + this.orientation);
	        Logger.logInfo("Solar Panels: " + this.solarPanels);
	        Logger.logInfo("Data Collected: " + this.dataCollected);
	    }
	}
