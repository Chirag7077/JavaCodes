/*
Create solution class Implement Static method "associates forGivenTechnology" in solution class.
This method will take a string parameter as array of associate objects.

The method will return array of Associates where string parameter appears in technology
attribute(with case insensitive search) and experienceInyears should be multiple of 5.

Create class Associate with below attributes:
associate id- string
associate name- string
Technology- string
experienceInYears-int

Write getters,setters and parameterized constructor.
Create class solution with the main method.
Implement Static method - associateForgiventechnology in solution class.
This method will take a string parameter named technology along with the other parameter 
as array of objects.
The method will return array of associate where the string parameter appears in the technology
attribute (with case insensitive search) and the experienceInyears should be multiples of 5.
This method should be called from main method and display the id of returned objects in ascending order.

Before calling this method (associateForgiventechnology) in the main method use scanner object to read 
values for five associate objects referring the attributes in above sequence then read value for search parameter.
Next call the method associateForgiventechnology,write the logic to print the ID's (in main method) And display result.

Input
Alex
101
Java
15
Albert
102
Unix
20
Alferd
103
Testing
13
Alfa
104
Java
15
Almas
105
Java
29

Output
101
104
*/

import java.util.*;

public class TCSXploreQ5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Associate asArray[] = new Associate[5];
        for(int i=0;i<5;i++){
            String name = sc.next();
            int id = sc.nextInt();
            String tech = sc.next();
            int expYears = sc.nextInt();

            asArray[i] = new Associate(id, name, expYears, tech);
        }
        System.out.println("\nEnter the required technology: ");
        String reqdTech = sc.next();
        ArrayList result = getTechDetails(asArray, reqdTech);
        Collections.sort(result);
        for(Object x : result){
            System.out.println(x.toString());
        }
    }
    public static ArrayList<Integer> getTechDetails(Associate[] asArray, String reqdTech){
        ArrayList result = new ArrayList();
        for(Associate a : asArray){
            if(a.getTech().equals(reqdTech) && a.getExpYears()%5==0){
                result.add(a.getID());
            }
        }
        return result;
    }
}

class Associate{
    private int id;
    private String name;
    private int expYears;
    private String tech;

    Associate(int id, String name, int expYears, String tech){
        this.id = id;
        this.name = name;
        this.expYears = expYears;
        this.tech = tech;
    }

    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getExpYears(){
        return this.expYears;
    }
    public void setExpYears(int expYears){
        this.expYears = expYears;
    }

    public String getTech(){
        return this.tech;
    }
    public void setTech(String tech){
        this.tech = tech;
    }
}
