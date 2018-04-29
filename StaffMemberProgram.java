import java.util.*;
public class StaffMemberProgram {
	public static void main(String[] args) {
		Staff staff = new Staff();
		ArrayList<StaffMember> employeeLst = new ArrayList<StaffMember>();
		for (int i = 0; i < staff.getSize(); i++){ //adds staff members
			employeeLst.add(staff.getStaff(i));
		}
		for (int i =0; i < employeeLst.size(); i++){ //prints all staff and information
			System.out.println("\n"+employeeLst.get(i));
			System.out.println(employeeLst.get(i).pay());
			if (employeeLst.get(i) instanceof Employee){ //checks what class they're from
				if (employeeLst.get(i) instanceof Executive){
					System.out.println("Executive");
				}
				else if (employeeLst.get(i) instanceof Hourly){
					System.out.println("Hourly");
				}
				else{
					System.out.println("Employee");
				}
			}	
			else{
				System.out.println("Volunteer");
			}
		}
		Scanner stdin = new Scanner(System.in);
		while (employeeLst.size() != 0){ //loop for deleting a person and information
			System.out.print("Input a person to delete or 'close' to terminate: ");
			String p = stdin.next();
			if (p.equals("close")){ //way to terminate this part
				System.out.println("Terminating...");
				break;
			}
			for (int i = 0; i < employeeLst.size(); i++){	
				if (p.equals(employeeLst.get(i).name)){
					if (employeeLst.get(i) instanceof Executive){ //checks if its a executive
						System.out.println("Not allowed to delete Executives");
						break;
					}
					employeeLst.remove(i); //remove that found person
					System.out.println(p+" has been deleted.");
					for (int i1 =0; i1 < employeeLst.size(); i1++){
						System.out.println("\n"+employeeLst.get(i1));
						System.out.println(employeeLst.get(i1).pay());
						if (employeeLst.get(i1) instanceof Employee){
							if (employeeLst.get(i1) instanceof Executive){
								System.out.println("Executive");
							}
							else if (employeeLst.get(i1) instanceof Hourly){
								System.out.println("Hourly");
							}
							else{
								System.out.println("Employee");
							}
						}	
						else{
							System.out.println("Volunteer");
						}
					}
					break; 
				}
				else{
					if (i == employeeLst.size()-1){ //if its at the end of ArrayList and not found, say its not found
						System.out.println("Not found.");
					}
				}
			}
		}
		Scanner newScn = new Scanner(System.in);
		while (0 == 0){ //loop for changing someone's address
			System.out.println("Input a person to change their address or 'close' to terminate: ");
			String p = stdin.next(); //finds person's address they want to change through their name
			if (p.equals("close")){ //way of terminating the loop
				System.out.println("Terminating...");
				break;
			}
			for (int i = 0; i < employeeLst.size(); i++){ //loop for finding the person said
				if (p.equals(employeeLst.get(i).name)){ 
					System.out.print("What is "+employeeLst.get(i).name+"'s new address?: ");
					String nAddress = newScn.nextLine(); //takes the entire line of input to change their address with
					staff.getStaff(i).address = nAddress;
					employeeLst.set(i, staff.getStaff(i));
					System.out.println("Address changed to: "+employeeLst.get(i).address); //confirmation and shows it
					for (int i1 =0; i1 < employeeLst.size(); i1++){ 
						System.out.println("\n"+employeeLst.get(i1));
						System.out.println(employeeLst.get(i1).pay());
						if (employeeLst.get(i1) instanceof Employee){
							if (employeeLst.get(i1) instanceof Executive){
								System.out.println("Executive");
							}
							else if (employeeLst.get(i1) instanceof Hourly){
								System.out.println("Hourly");
							}
							else{
								System.out.println("Employee");
							}
						}	
						else{
							System.out.println("Volunteer");
						}
					}
				}
				else{
					if (i == employeeLst.size()-1){ //if doesn't find name and is at end of list, says its not found
						System.out.println("Not found.");
					}
				}
			}	
		}
		System.out.println("\nFinal List: "); 
		for (int i =0; i < employeeLst.size(); i++){
			System.out.println("\n"+employeeLst.get(i));
			System.out.println(employeeLst.get(i).pay());
			if (employeeLst.get(i) instanceof Employee){
				if (employeeLst.get(i) instanceof Executive){
					System.out.println("Executive");
				}
				else if (employeeLst.get(i) instanceof Hourly){
					System.out.println("Hourly");
				}
				else{
					System.out.println("Employee");
				}
			}	
			else{
				System.out.println("Volunteer");
			}
		}
	}
}