package DataAccessObject;

public class Record {
    private int income;
    private String date;
    private int recordNo;

    public Record(int income, String date, int recordNo) {
        this.income = income;
        this.date = date;
        this.recordNo = recordNo;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(int recordNo) {
        this.recordNo = recordNo;
    }
}
