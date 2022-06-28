public class Member {
    char MemberType;
    int MemberID;
    String Name;
    double Fees;

    public  void Member(char pMemberType, int pMemberID, String pname, double pfees ){
        MemberType = pMemberType;
        MemberID = pMemberID;
        Name = pname;
        Fees = pfees;


    }
    public void setMemberType(char pMemberType){
        MemberType = pMemberType;
    }

    public char getMemberType() {
        return MemberType;
    }

    public void setMemberID(int pMemberID){
        MemberID = pMemberID;
    }

    public int getMemberID() {
        return MemberID;
    }
    public void setName (String pname){
        Name = pname;
    }

    public String getName() {
        return Name;
    }
    public void setFees(double pfees){
        Fees = pfees;
    }

    public double getFees() {
        return Fees;
    }

    @Override
    public String toString(){
        return MemberType + "," + MemberID + ","+ Name +","+ Fees ;
    }
}
