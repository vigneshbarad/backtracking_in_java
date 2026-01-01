public class find_subsets {
    //abc = a,b,c,ab,ac,bc,abc,' ' 2^3=8 total 2^n subsets
    public static void subsets(String str, String ans,int i){
        if(i == str.length()){               //basr case
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        subsets(str, ans+str.charAt(i), i+1);    //for yes choice
        subsets(str, ans, i+1);                  //for no choice
    }


    public static void main(String []args){
        String str = "abc";
        subsets(str, "", 0);          //time complexity O(2^n*n) & space O(n)
    }
}
