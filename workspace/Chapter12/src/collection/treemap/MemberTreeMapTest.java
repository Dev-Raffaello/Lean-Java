package collection.treemap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberTreehMap = new MemberTreeMap();

		Member memberLee = new Member(102, "�̼���");
		Member memberKim = new Member(101, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");

		memberTreehMap.addMember(memberLee);
		memberTreehMap.addMember(memberKim);
		memberTreehMap.addMember(memberShin);

		memberTreehMap.showAllMember();

	}
}
