package in.ashokit.binding;

import java.time.LocalDateTime;

public class AppExInfo {

	private String exCode;
	private String exMsg;
	private LocalDateTime exDate;
	
	public void setExCode(String exCode) {
		this.exCode = exCode;
	}
	public void setExMsg(String exMsg) {
		this.exMsg = exMsg;
	}
	public void setExDate(LocalDateTime exDate) {
		this.exDate = exDate;
	}
	public String getExCode() {
		return exCode;
	}
	public String getExMsg() {
		return exMsg;
	}
	public LocalDateTime getExDate() {
		return exDate;
	}
	
	
}
