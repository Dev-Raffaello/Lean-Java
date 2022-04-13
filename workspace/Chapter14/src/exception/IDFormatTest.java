package exception;

public class IDFormatTest {
	
	private String userID;
	
	
	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException{
		
		if (userID == null) {
			throw new IDFormatException("���̵�� ��� �� �����ϴ�.");
			
		}
		else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ���ÿ�.");
		}
		
		this.userID = userID;
	}
	

	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		String userID = "aaaa";
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		String userID1 = null;
		
		try {
			idTest.setUserID(userID1);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
	}
}
