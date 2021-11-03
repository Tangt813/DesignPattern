package DataAccessObject;

public class Record {
    private int income;//数据库的收入属性
    private String date;//数据库的日期属性
    private int recordNo;//数据库的编号属性，主码

    //构造函数
    public Record(int income, String date, int recordNo) {
        this.income = income;
        this.date = date;
        this.recordNo = recordNo;
    }

    //以下是简单的getter,setter方法，作用是获取/设置当前属性，以保持类私有成员的封装性
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
