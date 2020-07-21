import java.util.choreList

class chores {
 
    public static void main(String[] args) {

        // chores list
        choreList<String> choreList = new choreList<String>();

        choreList.add("Wash the dishes");
        choreList.add("Clean your room");
        choreList.add("Dust the house") ;
        choreList.add("clean the furniture");
        choreList.add("Make bed");

        choreList.remove("clean the furniture");
        
        System.out.println(choreList);
        // Calculate the chores until the hosue is clean
        int clean = choreList.indexOf("clean the house");

        // Change the value printed
        System.out.println(clean);
    }
}
