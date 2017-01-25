package domain;

public abstract class TreatmentBean {
	protected String treatId, docId, patId, treatDate, treantContents;
	
	public void setTreatId(String treatID){
		this.treatId = treatID;
	}
	public String getTreatId() {
		return treatId;
	}
	public void setDocId(String docId){
		this.docId = docId;
	}
	public String getDocID(){
		return docId;
	}
	public void setPatId(String patId){
		this.patId = patId;
	}
	public String getPatId(){
		return patId;
	}
	public void setTreatDate(String treatDate) {
		this.treatDate = treatDate;
	}
	public String getTreatDate() {
		return treatDate;
	}
	public void setTreantContents(String treantContents) {
		this.treantContents = treantContents;
	}
	public String getTreantContents() {
		return treantContents;
	}
}
