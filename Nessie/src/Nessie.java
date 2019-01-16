public class Nessie {
    public static boolean isLockNessMonster(String s){
        //FIND THE LOCH NESS MONSTER. SAVE YOUR TREE FIDDY
        s = s.toLowerCase();
        return s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty");
    }
}