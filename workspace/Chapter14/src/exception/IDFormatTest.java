package exception;

public class IDFormatTest {
	
	private String userID;
	
	
	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException{
		
		if (userID == null) {
			throw new IDFormatException("아이디는 비울 수 없습니다.");
			
		}
		else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰시오.");
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
