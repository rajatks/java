public final class Manager extends Emp
{


public Manager(){


super("Manager");
 this.setdegi("Manager");
 this.setsalary(80000);
}


public void incsalary()
{
setsalary(getsalary()+10000);
}

}