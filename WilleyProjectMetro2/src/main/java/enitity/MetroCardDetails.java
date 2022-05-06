package enitity;

public class MetroCardDetails {

	@Override
	public String toString() {
		return "MetroCardDetails [metroId=" + metroId + ", startValidity=" + startValidity + ", endValidity="
				+ endValidity + ", metroBalance=" + metroBalance + "]";
	}
	private int metroId;
	private String startValidity;
	private String endValidity;
	private int metroBalance;
	public MetroCardDetails(int metroId, String startValidity, String endValidity, int metroBalance) {
		super();
		this.metroId = metroId;
		this.startValidity = startValidity;
		this.endValidity = endValidity;
		this.metroBalance = metroBalance;
	}
	public int getMetroId() {
		return metroId;
	}
	public String getStartValidity() {
		return startValidity;
	}
	public String getEndValidity() {
		return endValidity;
	}
	public int getMetroBalance() {
		return metroBalance;
	}
	
}
