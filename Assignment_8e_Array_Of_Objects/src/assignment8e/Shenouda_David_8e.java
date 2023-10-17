package assignment8e;

public class Shenouda_David_8e {
//David Shenouda CSIS 162-03 5/1/20
	public static void main(String[] args) {
		
		//Two array of objects that are a Construct of friendClass
		friendClass friendArray1[] = new friendClass[6];
		friendClass friendArray2[] = new friendClass[6];
		
		//Populating the objects in friendClass with a last Name,
		//First name, and age
		friendArray1[0] = new friendClass("Osborn", "Norman", 21);
		friendArray1[1] = new friendClass("Parker","Peter",20);
		friendArray1[2] = new friendClass("Wayne","Bruce",26);
		friendArray1[3] = new friendClass("Napier","Jack",30);
		friendArray1[4] = new friendClass("Kent","Clark",33);
		friendArray1[5] = new friendClass("Luther","Lex",53);
		
		
		//Loop to print all objects in friendArray1 using method printFriend
		for(int idx =0; idx < friendArray1.length; idx++) {
			int idxf= idx;
			System.out.println("Friend" + (idxf + 1));
			friendArray1[idx].printFriend();
		}
		System.out.println("\nfriendArray2 which is a copy of friendArray1\n");
		//Loop to get and set all objects in friendArray2 equal to friendArray1
		for(int idx =0; idx < friendArray2.length; idx++) {
			int idxf= idx;
			friendArray2[idx] = new friendClass();
			friendArray2[idx].applyLastName(friendArray1[idx].retrieveLastName());
			friendArray2[idx].applyFirstName(friendArray1[idx].retrieveFirstName());
			friendArray2[idx].applyAge(friendArray1[idx].retrieveAge());
			System.out.println("Friend" + (idxf + 1));
			friendArray2[idx].printFriend();
		}
		//Loop to call both applyAge and retrieveAge methods which will add
		//10 to the age of each object (friend) in friendArray2
		for(int idx =0; idx < friendArray2.length; idx++) {
			friendArray2[idx].applyAge(friendArray2[idx].retrieveAge()+ 10);
		}
		//Loop to print out friendArray1 and friendArray2
		for(int idx =0; idx < friendArray2.length; idx++) {
			int idxf= idx;
			System.out.println("\nFriendArray1\n");
			System.out.println("Friend" + (idxf + 1));
			friendArray1[idx].printFriend();
			System.out.println("\nFriendArray2\n");
			System.out.println("Friend" + (idxf + 1));
			friendArray2[idx].printFriend();
		}
}
}

	

