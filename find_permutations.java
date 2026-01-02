public class find_permutations {
    //abc = abc,acb,bac,bca,cab,cba   n!(factorial) 3!=3*2*1=6
    public static void permutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);   //which removes the ith element
            permutations(newstr, ans+curr);
        }
    }
    public static void main(String []args){
        String str = "abc";
        permutations(str, "");       //time complexity O(n*n!) & space O(n)
         
    }
}
