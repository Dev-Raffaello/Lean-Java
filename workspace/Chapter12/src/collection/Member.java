package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{

	private int memverID;
	private String memverName;
	
	public Member() {}
	
	public Member(int memberID, String memberName) {
		this.memverID = memberID;
		this.memverName = memberName;
	}
	
	public int getMemverID() {
		return memverID;
	}
	public void setMemverID(int memverID) {
		this.memverID = memverID;
	}
	public String getMemverName() {
		return memverName;
	}
	public void setMemverName(String memverName) {
		this.memverName = memverName;
	}
	
	@Override
	public String toString() {
		return memverName + "회원님의 아이디는 "+ memverID + "입니다." ;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member memer = (Member)obj;
			
			if(this.memverID == memer.memverID) {
				return true;
			}
			else return false;
		}
		return false ;
		}

	@Override
	public int hashCode() {
		
		return memverID;
		
	}

	@Override
	public int compareTo(Member member) {
		
		return (this.memverName.compareTo( member.memverName));
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memverID - member2.memverID) ;
	}

	
	
}
