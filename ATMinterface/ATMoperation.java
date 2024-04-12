package ATMinterface;

import java.util.HashMap;
import java.util.Map;

public class ATMoperation implements ATMOPinterface {
    ATM a=new ATM();
    Map<Double,String>ms=new HashMap<>();
    @Override
    public void balance() {
        System.out.println("Available Balance: " +a.getBalance());
    }

    @Override
    public void deposit(double deposit) {
        ms.put(deposit," Amount Deposited: ");
        System.out.println(deposit+"\tDeposited Successfully!!");
        a.setBalance(a.getBalance()+deposit);
        balance();
    }

    @Override
    public void withdraw(double withdraw) {
       if (withdraw<=a.getBalance()){
           ms.put(withdraw," Amount Withdrawn: ");
           System.out.println("Collect the Cash! " +withdraw);
           a.setBalance(a.getBalance()-withdraw);
           balance();
       }
       else {
           System.out.println("Insufficient Balance!!!!");
       }

    }

    @Override
    public void ministatement() {
        for (Map.Entry<Double,String>m: ms.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}
