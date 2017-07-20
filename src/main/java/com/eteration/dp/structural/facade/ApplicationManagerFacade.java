package com.eteration.dp.structural.facade;

public class ApplicationManagerFacade {
	
	private DBSubSystem dbSubSystem;
	private InstallerSubSystem installerSubSystem;
	private ServerRuntimeSubSystem runtimeSubSystem;
	public ApplicationManagerFacade() {
		dbSubSystem = new DBSubSystem();
		installerSubSystem = new InstallerSubSystem();
		runtimeSubSystem = new ServerRuntimeSubSystem();
	}
	
	
	public void prepare(){
		dbSubSystem.populateData();
		runtimeSubSystem.bootServer();
		installerSubSystem.installApp();
	}
	
	public void rallback(){
		installerSubSystem.unInstallApp();
		runtimeSubSystem.shutdownServer();
		dbSubSystem.clearData();

	}

}
