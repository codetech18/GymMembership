public class SingleClubMember extends Member{
    private int club;

    public void SingleClubMember(char pMemberType, int pMemberID, String pname, double pfees, int pclub){
        super.Member( pMemberType, pMemberID, pname, pfees);
        club = pclub;
    }
    public void setClub(int pclub){
        club=pclub;
    }

    public int getClub() {
        return club;
    }
    @Override
    public String toString(){
        return MemberType + "," + MemberID + ","+ Name +","+ Fees +"," + club ;

    }
}
