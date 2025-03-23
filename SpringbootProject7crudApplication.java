package in.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.UserDao;
import in.sp.main.entity.User;

@SpringBootApplication
public class SpringbootProject7crudApplication implements CommandLineRunner
{
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringbootProject7crudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
//----------------------------Insertion------------------------------------------
		
//		//User user1 = new User("Sanket", "sanket@gmail.com", "Male", "Satara");
//		User user2 = new User("Bob", "bob@gmail.com", "Male", "Mumbai");
//		boolean status = userDao.insertUser(user2);
//		if(status)
//		{
//			System.out.println("User inserted successfully");
//		}
//		else 
//		{
//			System.out.println("User not inserted due to error");
//			
//		}
		
//----------------------------------------------------------------------------------------	

//-----------------------------Updation---------------------------------------------------
		
//		User user = new User("Sanket", "sanket@gmail.com", "Male", "Pune");
//		boolean status = userDao.updateUser(user);
//		if(status)
//		{
//			System.out.println("User updated successfully");
//		}
//		else 
//		{
//			System.out.println("User not updated due to error");
//			
//		}
		
//----------------------------------------------------------------------------------------------------------
		
//-----------------------------Deletion------------------------------------------------------------------
		
//		boolean status = userDao.deleteUserByEmail("bob@gmail.com");
//		if(status)
//		{
//			System.out.println("Deleted");
//		}
//		else 
//		{
//		   System.out.println("Not Deleted");	
//		}
		
//-------------------------------------------------------------------------------------------------------
		
//----------------------------SELECT ONE USER--------------------------------------
//		User user = userDao.getUserByEmail("sanket@gmail.com");
//		System.out.println("Name : "+user.getName());
//		System.out.println("Email : "+user.getEmail());
//		System.out.println("Gender : "+user.getGender());
//		System.out.println("City : "+user.getCity());
		
//-----------------------------------------------------------------------

//----------------select all user------------------------------------------
		List<User> list = userDao.getAllUsers();
		for(User user : list)
		{
			System.out.println("Name : "+user.getName());
			System.out.println("Email : "+user.getEmail());
			System.out.println("Gender : "+user.getGender());
			System.out.println("City : "+user.getCity());
		}
	}

}
