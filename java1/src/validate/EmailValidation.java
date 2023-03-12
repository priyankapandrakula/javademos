package validate;

	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class EmailValidation { //will ignore quoted email
		
		private final String [] VALIDEMAILS = {
				"admin@thecant.com",
				"User_1@thecant.com",
				"general.crew@thecant.com",
				"captain@thecant.com"
		};
		
		public boolean validateEmail(String emailToValidate) {
			String regexDoublePoint = ".*[.]{2}.*";
			String emailPattern ="[a-zA-Z0-9!#$&'*+-/=?^_`{|}~]*@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9][.][a-zA-Z]*"; // email construction rulles from wikipedia
					
			Pattern pattern = Pattern.compile(regexDoublePoint);
			Matcher matcher = pattern.matcher(emailToValidate);
			if(matcher.matches()) {
				System.out.println("Invalid email format , email with consecutive '.'");
				return false;
			}
			else {
				pattern = Pattern.compile(emailPattern);
				matcher = pattern.matcher(emailToValidate);
				if(matcher.matches()) {
					for (int i=0;i<VALIDEMAILS.length;i++) {
						if (VALIDEMAILS[i].toLowerCase().equals(emailToValidate.toLowerCase())) { // email servers are not case sensitive
							System.out.println("Email recognized... welcome");
							return true;
						}
					}
						
					{System.out.println("Email not recognized");
					return false;}
				}
				else
				{   System.out.println("Invalid email format");
					return false;}
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			EmailValidation email = new EmailValidation();
			Scanner sc = new Scanner(System.in);
			String userInput;
			do {
				System.out.println("Enter your email:");
			userInput = sc.next();
			}
			while(!email.validateEmail(userInput));
			//System.out.println("Terminating after email validation... bye");
			sc.close();
		}

	}

