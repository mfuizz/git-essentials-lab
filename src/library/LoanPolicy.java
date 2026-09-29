package library;

public class LoanPolicy {
    public int maxBooks(MemberType type) { return type == MemberType.STUDENT ? 3 : 5; }
>>>>>>> lab-v1/final/faculty
    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return daysLate * 100; }
}
