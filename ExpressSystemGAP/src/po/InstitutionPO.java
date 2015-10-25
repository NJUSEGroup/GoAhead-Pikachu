package po;

import java.io.Serializable;

public class InstitutionPO implements Serializable {
	private String insId;
	private String insType;
	private String insName;
	private String insCity;
	private int insMember;

	public InstitutionPO(String id, String type, String name, String city,
			int member) {
		insId = id;
		insType = type;
		insName = name;
		insCity = city;
		insMember = member;
	}

	public InstitutionPO() {

	}

	/**
	 * @return insId
	 */
	public String getInsId() {
		return insId;
	}

	/**
	 * @param insId Ҫ���õ� insId
	 */
	public void setInsId(String insId) {
		this.insId = insId;
	}

	/**
	 * @return insType
	 */
	public String getInsType() {
		return insType;
	}

	/**
	 * @param insType Ҫ���õ� insType
	 */
	public void setInsType(String insType) {
		this.insType = insType;
	}

	/**
	 * @return insName
	 */
	public String getInsName() {
		return insName;
	}

	/**
	 * @param insName Ҫ���õ� insName
	 */
	public void setInsName(String insName) {
		this.insName = insName;
	}

	/**
	 * @return insCity
	 */
	public String getInsCity() {
		return insCity;
	}

	/**
	 * @param insCity Ҫ���õ� insCity
	 */
	public void setInsCity(String insCity) {
		this.insCity = insCity;
	}

	/**
	 * @return insMember
	 */
	public int getInsMember() {
		return insMember;
	}

	/**
	 * @param insMember Ҫ���õ� insMember
	 */
	public void setInsMember(int insMember) {
		this.insMember = insMember;
	}

}
