public class Account { // classe 
    private String name;
    private double balance;
    //construtor
    public Account(String name, double balance)
    {
        this.name = name; // atribuiu a variavel de instancia a name

        if(balance>0.0){ 
            this.balance = balance; // atribui variavel de instancia ao balance 
        }
    }
    public void setName(String name) //metodo
    {
        this.name = name; //variavel de instacia
    }
    public String getName() //metodo
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double depoisitAmount){
        if(depoisitAmount > 0.0){
            balance = balance + depoisitAmount;
        }
    }
}
