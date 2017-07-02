package core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OCCUPATION_TYPE")
public class OccupationType implements Serializable {
	
	/** 職種ID */
	@Id
	@Column(name = "occupationTypeId", nullable = false)
	private String occupationTypeId;
	
	/** 職種名 */
	@Column(name = "occupationTypeName", nullable = false)
	private String occupationTypeName;
	
	// デフォルトコンストラクタは必須！
	public OccupationType() {
		
	}

	public String getOccupationTypeId() {
		return occupationTypeId;
	}

	public void setOccupationTypeId(String occupationTypeId) {
		this.occupationTypeId = occupationTypeId;
	}

	public String getOccupationTypeName() {
		return occupationTypeName;
	}

	public void setOccupationTypeName(String occupationTypeName) {
		this.occupationTypeName = occupationTypeName;
	}

}