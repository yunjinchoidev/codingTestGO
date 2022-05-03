package codingTest.main.month05.week01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P92234 {
	public static String[] main(String[] record) {
		//String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
		//		"Change uid4567 Ryan" };
		ArrayList<String> newArray = new ArrayList<String>();
		HashMap<String, String> hashMap = new HashMap<String, String>();

		for (int k = 0; k < record.length; k++) {

			StringTokenizer st = new StringTokenizer(record[k]);
			String command = st.nextToken();
			String userId = st.nextToken();
			String nickname = "";

			if (command.equals("Enter") || command.equals("Change")) {
				nickname = st.nextToken();
			}

			if (command.equals("Enter")) {
				hashMap.put(userId, nickname);
				newArray.add(userId + "님이 들어왔습니다.");
			}

			if (command.equals("Change")) {
				hashMap.put(userId, nickname);
			}

			if (command.equals("Leave")) {
				newArray.add(userId + "님이 나갔습니다.");
			}
		}
		//System.out.println(hashMap.size());
		String[] OArray = new String[newArray.size()];
		for (int i = 0; i < newArray.size(); i++) {
			int A = newArray.get(i).indexOf("님");
			String K = newArray.get(i).substring(0, A);
			// System.out.println(K);
			newArray.get(i).replace(newArray.get(i).substring(0, A), hashMap.get(K));
			OArray[i] = newArray.get(i).replace(newArray.get(i).substring(0, A), hashMap.get(K));
		}

		for (int i = 0; i < newArray.size(); i++) {
			System.out.println(OArray[i]);
		}
		
		return OArray;

	}
}
