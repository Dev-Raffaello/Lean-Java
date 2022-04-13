package collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member mamber) {
		hashSet.add(mamber);
	}

	public boolean removeMember(int memberID) {

		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();
			int tempID = member.getMemverID();
			if (memberID == tempID) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}

	public void showAll() {
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
			
		}
		
	}
}
