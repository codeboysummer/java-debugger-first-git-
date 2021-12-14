package debugger;

import java.util.Scanner;

public class checkif {
    Scanner s = new Scanner(System.in);

    String name;

    String listofnames []={"rachneet","piyush","abdul","haryan","christian","phil"};
    public boolean isin (){
        boolean in=false;
for(int i=0;i< listofnames.length;i++) {
    if (listofnames[i].equals(name)) {
        return in = true;

    }
}
return false;
    }
    public void output(boolean a){
        if (a==true){
            System.out.println("your name "+ name + " is in the list");
        }
        else {
            System.out.println("your name is not in the list");
        }
    }




    public void getinput(){

        System.out.println("enter a name and it will be checked in our data base");

        System.out.println("hint :it could be your name !");

       name=s.nextLine();

    }
    public String name()
    {
        return name;

    }


}



