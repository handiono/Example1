package com.escurity.test1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;



//@NamedNativeQueries({
//    @NamedNativeQuery(
//            name = "sptest",
//            query = "CALL getBarang()",
//            resultClass = BarangCp.class
//    )
// })

@Entity
//@NamedStoredProcedureQuery(name = "sp", procedureName="getBarang", resultClasses = BarangCp.class)
//@NamedStoredProcedureQuery(name = "", procedureName="", parameter={@StoredProcedureParameter(mode = ParameterMode.) 
@NamedStoredProcedureQuery(name = "BarangCp.get", procedureName = "getBarang", resultClasses = BarangCp.class)
public class BarangCp {
	
	@Id
	@GeneratedValue
	private Long barang_id;
	
	@Column
	private String partno;
	
	@Column
	private String partname;

	public BarangCp() {

	}

	public BarangCp(String partno, String partname) {
		super();
		this.partno = partno;
		this.partname = partname;
	}

	public Long getBarang_id() {
		return barang_id;
	}

	public void setBarang_id(Long barang_id) {
		this.barang_id = barang_id;
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getPartname() {
		return partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

	@Override
	public String toString() {
		return "BarangCp [barang_id=" + barang_id + ", partno=" + partno
				+ ", partname=" + partname + "]";
	}
	
	

	

}
