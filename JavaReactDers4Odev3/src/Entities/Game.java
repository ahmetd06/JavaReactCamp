package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Game extends Product implements IEntity{
	private String developer;
	private LocalDate releaseDate;
	private String operatingSystem;
	private String minimumCpu;
	private String version;
	private String minimumMemory;
	private String minimumStorage;
	private String supportedLanguages;
	private String otherGameDetails;
	
	public Game() {
		
	}

	public Game(int id, String name, int categoryId, double unitPrice, double kdv, String detail,String developer, LocalDate releaseDate, String operatingSystem, String minimumCpu, String version,
			String minimumMemory, String minimumStorage, String supportedLanguages, String otherGameDetails) {
		
		super(id,  name,  categoryId,  unitPrice,  kdv,  detail);
		
		this.developer = developer;
		this.releaseDate = releaseDate;
		this.operatingSystem = operatingSystem;
		this.minimumCpu = minimumCpu;
		this.version = version;
		this.minimumMemory = minimumMemory;
		this.minimumStorage = minimumStorage;
		this.supportedLanguages = supportedLanguages;
		this.otherGameDetails = otherGameDetails;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getMinimumCpu() {
		return minimumCpu;
	}

	public void setMinimumCpu(String minimumCpu) {
		this.minimumCpu = minimumCpu;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String minimumGpu) {
		this.version = minimumGpu;
	}

	public String getMinimumMemory() {
		return minimumMemory;
	}

	public void setMinimumMemory(String minimumMemory) {
		this.minimumMemory = minimumMemory;
	}

	public String getMinimumStorage() {
		return minimumStorage;
	}

	public void setMinimumStorage(String minimumStorage) {
		this.minimumStorage = minimumStorage;
	}

	public String getSupportedLanguages() {
		return supportedLanguages;
	}

	public void setSupportedLanguages(String supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}

	public String getOtherGameDetails() {
		return otherGameDetails;
	}

	public void setOtherGameDetails(String otherGameDetails) {
		this.otherGameDetails = otherGameDetails;
	}
	
	
}
