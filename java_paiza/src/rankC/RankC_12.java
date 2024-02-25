package rankC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RankC_12 {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			int count = sc.nextInt();
			
			User11[] users = new User11[count];
			
			for(int i = 0; i < count; i++) {
				String userName = sc.next();
				int userId = Integer.parseInt(userName.replaceAll("[^0-9]", ""));
				users[i] = new User11();
				users[i].setName(userName);
				users[i].setId(userId);
			}
			
      Arrays.sort(users, new Comparator<User11>() {
        @Override
        public int compare(User11 user1, User11 user2) {
          return Integer.compare(user1.getId(), user2.getId());
        }
      });
      
      for(User11 user : users) {
      	System.out.println(user.getName());
      }

			
		}
		catch(Exception e) {
			System.out.println("入力が不適切です");
		}
		
	}
}


//		try(Scanner sc = new Scanner(System.in)){
//			int count = sc.nextInt();
//			
//			String[] users = new String[count];
//			int[] usersID = new int[count];
//			int[] index = new int[count];
//			
//			for(int i = 0; i < count; i++) {
//				users[i] = sc.next();
//				usersID[i] = Integer.parseInt(users[i].replaceAll("[^0-9]", ""));
//				index[i] = i;
//			}
//			
//			for(int i = 0; i < count - 1; i++) {
//				for(int j = i + 1; j < count; j++) {
//					if(usersID[i] > usersID[j]) {
//						int tempId = usersID[i];
//						int temp = index[i];
//						usersID[i] = usersID[j];
//						usersID[j] = tempId;
//						index[i] = index[j];
//						index[j] = temp;
//					}
//				}
//			}
//			
//			for(int i : index ) {
//				System.out.println(users[i]);
//			}
//			
//		}
//		catch(Exception e) {
//			System.out.println("入力が不適切です");
//		}
//	}
//}
