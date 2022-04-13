package collection.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}

	public void addMember(Member mamber) {
		treeSet.add(mamber);
	}

	public boolean removeMember(int memberID) {

		Iterator<Member> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();
			int tempID = member.getMemverID();
			if (memberID == tempID) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}

	public void showAll() {
		Iterator<Member> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
			
		}
		
	}
}
