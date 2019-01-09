public class Main {

    public static void main(String args[]){

        Account timsAccount = new Account("tim ",
                                          "tim@mail.com",
                                          "012346");


        System.out.println(timsAccount.getNumber() + " name "+ timsAccount.getCustomerName() );
        System.out.println("Current balance is  "+ timsAccount.getBalance());
        timsAccount.withdrawal(timsAccount.getBalance());

    }

}
