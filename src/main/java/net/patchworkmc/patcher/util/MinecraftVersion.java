package net.patchworkmc.patcher.util;

public enum MinecraftVersion {
	V1_16_4("1.16.4");

	private final String version;

	MinecraftVersion(String versionIn) {
		this.version = versionIn;
	}

	public String getVersion() {
		return version;
	}
}
