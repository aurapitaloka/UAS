import java.util.Scanner;

public class NomorTigaUAS {

    public class UasTiga {
        private int UserID;
        private int UserName;

        public int getUserID() {
            return UserID;
        }

        public void setUserID(int userID) {
            UserID = userID;
        }

        public int getUserName() {
            return UserName;
        }

        public void setUserName(int userName) {
            UserName = userName;
        }

        public static void main(String[] args) {
            int jumPost = 4;
            Scanner sc = new Scanner(System.in);
            UAS1B user1 =  new UAS1B();
            user1.ID("001");
            user1.setUserName("dbgb4a");
            user1.setFullName("Debby Gibson");
            ArrayList<String> myPost =  new ArrayList<>();
            for(int index=0; index<jumPost;index++){
                myPost.add(sc.nextLine());
            }
            user1.setPosted(myPost);
            System.out.println("Total Posted : " + user1.ShowNumberOfPost());

        }
    }

}
