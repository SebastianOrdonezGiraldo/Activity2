package PrestamoLibro;

public class loan {
    private String loanCode;
    private String loanDate;
    private String bookName;
    private String userCode;
    private int loanDays;
    private String loanStatus;

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public loan() {

    }

    public loan(String loanCode, String loanDate,
                String bookName, String userCode,
                int loanDays, String loanStatus) {
        this.loanCode = loanCode;
        this.loanDate = loanDate;
        this.bookName = bookName;
        this.userCode = userCode;
        this.loanDays = loanDays;
        this.loanStatus = loanStatus;
    }

    public String checkData() {
        return "Loan Code: " + getLoanCode() +
                "\nLoan Date: " + getLoanDate() +
                "\nBook Name: " + getBookName() +
                "\nUser Code: " + getUserCode() +
                "\nLoan Days: " + getLoanDays();
    }

    public String checkLoanStatus() {
        return "Loan Status: " + getLoanStatus();
    }
}

