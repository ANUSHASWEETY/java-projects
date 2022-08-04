package test;

import java.util.*;
public class User {
    private int userno;
    private String  user_name;
    private int salary;
    public int List(int userno,String user_name,int salary){
        this.userno=userno;
        this.user_name=user_name;
        this.salary=salary;
    } public int hashcode()
    {
        return (userno+user_name+salary).hashcode();
    }
    public boolean equals(object other_){
        User other=(User)other_;
        return (userno==null||userno.equals(other.userno))&&
                (user_name==null||user_name.equals(other.user_name))&&
                (salary==null||salary.equals(other.salary))
    }

    public int getUserno() {
        return userno;
    }

    public string getUser_name() {
        return user_name;
    }

    public int getSalary() {
        return salary;
    }
    public String toString(){
        return userno+" "+user_name+" "+salary;
    }
}
class Demo {
    public static void main(String[] args) {
        List<User> c = new ArrayList<User>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.insert");
            System.out.println("2.dispaly");
            System.out.println("3.search");
            System.out.println("4.delete");
            System.out.println("5.exit");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("enter userno: ");
                    int uid = s.nextInt();
                    System.out.print("enter username: ");
                    int uname = s.nextInt();
                    System.out.print("enter salary: ");
                    int salary = s.nextInt();
                    c.add(new User(uid, uname, salary));
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    Iterator<User> i = c.Iterator();
                    while (i.hasNext()) {
                        User u = i.next();
                        System.out.println(u);
                    }
                    System.out.println("------------------------------");
                    break;
                case 3:
                    boolen found = false;
                    System.out.println("enter userno to search");
                    userno = s.nextInt();
                    System.out.println("--------------------------------");
                    Iterator<User> i = c.Iterator();
                    while (i.hasNext()) {
                        User u = i.next();
                        if (e.getuserno() == userno)
                            System.out.println(u);
                        found = true;
                    }
            }
            if (!found) {
                System.out.println("record not found");
            }

            System.out.println("------------------------------");
            break;
            case 4:
                found = false;
                System.out.println("enter userno to delete");
                userno = s.nextInt();
                System.out.println("--------------------------------");
                Iterator<User> i = c.Iterator();
                while (i.hasNext()) {
                    User u = i.next();
                    if (e.getuserno() == userno)
                        i.remove();
                    found = true;
                }
        }
        if (!found) {
            System.out.println("record not found");
        } else {
            System.out.println("record is deleted");
        }

        System.out.println("------------------------------");
        break;

        case 5:
        System.out.println("exiting")
    }
            while(ch!=0);


}
        }









