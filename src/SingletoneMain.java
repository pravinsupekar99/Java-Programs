
class Singletone
{
    public static Singletone instanceobj = null;

    public String name ;
    public int age ;
    public String gender ;

    private Singletone()
    {
        name  = "Pravin";
        age   = 25;
        gender = "Male";
    }

    public static synchronized Singletone getInstance()
    {
        if(instanceobj==null)
            instanceobj = new Singletone();

        return instanceobj;
    }
}


public class SingletoneMain {

    public static void main(String args[])
    {
        Singletone x= Singletone.getInstance();
        System.out.println("Name is: " + x.name);
        System.out.println("The x object memory location is " + x.hashCode());

        Singletone y= Singletone.getInstance();
        System.out.println("Age is: " + y.age);
        System.out.println("The y object memory location is " + y.hashCode());

        Singletone z= Singletone.getInstance();
        System.out.println("Gender is: " + z.gender);
        System.out.println("The z object memory location is " + z.hashCode());

    }
}
