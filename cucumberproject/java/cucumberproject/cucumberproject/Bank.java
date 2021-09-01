package cucumberproject.cucumberproject;

public class Bank {
	int balance;
public	Bank(int b){
		balance=b;
	}
public void depost(int t) {
	balance=balance+t;
}
public void withdrow(int t) {
	balance=balance-t;

}
public int getBalance() {
	return balance;
}
}
