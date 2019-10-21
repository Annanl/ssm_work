package work1.com.zut.ioc;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void say() {
		userDao.say();
		System.out.println("userService say Hello World");
	}

}
