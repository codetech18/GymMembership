public class MultiClubMember extends Member{
    int MembershipPoints;

    public void MultiClubMember(char pMemberType, int pMemberID, String pname, double pfees, int pMembershipPoints) {
        super.Member(pMemberType, pMemberID, pname, pfees);

        MembershipPoints = pMembershipPoints;
    }
    public  void setMembershipPoints(int pMembershipPoints){
        MembershipPoints = pMembershipPoints;
    }

    public int getMembershipPoints() {
        return MembershipPoints;
    }
    @Override
    public String toString(){
        return MemberType + "," + MemberID + ","+ Name +","+ Fees +"," + MembershipPoints ;

    }
}
