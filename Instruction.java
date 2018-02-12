/**
 * 
 */
package jpMorganTradeImple;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author mohit
 * 
 */
public class Instruction {

	private String entity;
	private int units;
	private String currency;
	private Date instructionDate;
	private Date settlementDate;
	private BigDecimal pricePerUnit;
	private BigDecimal fxRate;

	public Instruction(String entity, int units, String currency,
			Date instructionDate, Date settlementDate, BigDecimal pricePerUnit,
			BigDecimal fxRate) {
		this.entity = entity;
		this.units = units;
		this.currency = currency;
		this.instructionDate = instructionDate;
		this.settlementDate = settlementDate;
		this.pricePerUnit = pricePerUnit;
		this.fxRate = fxRate;

	}

	/**
	 * @return the entity
	 */
	public String getEntity() {
		return entity;
	}

	/**
	 * @param entity
	 *            the entity to set
	 */
	public void setEntity(String entity) {
		this.entity = entity;
	}

	/**
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}

	/**
	 * @param units
	 *            the units to set
	 */
	public void setUnits(int units) {
		this.units = units;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the instructionDate
	 */
	public Date getInstructionDate() {
		return instructionDate;
	}

	/**
	 * @param instructionDate
	 *            the instructionDate to set
	 */
	public void setInstructionDate(Date instructionDate) {
		this.instructionDate = instructionDate;
	}

	/**
	 * @return the settlementDate
	 */
	public Date getSettlementDate() {
		return settlementDate;
	}

	/**
	 * @param settlementDate
	 *            the settlementDate to set
	 */
	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}

	/**
	 * @return the pricePerUnit
	 */
	public BigDecimal getPricePerUnit() {
		return pricePerUnit;
	}

	/**
	 * @param pricePerUnit
	 *            the pricePerUnit to set
	 */
	public void setPricePerUnit(BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	/**
	 * @return the fxRate
	 */
	public BigDecimal getFxRate() {
		return fxRate;
	}

	/**
	 * @param fxRate
	 *            the fxRate to set
	 */
	public void setFxRate(BigDecimal fxRate) {
		this.fxRate = fxRate;
	}

}
