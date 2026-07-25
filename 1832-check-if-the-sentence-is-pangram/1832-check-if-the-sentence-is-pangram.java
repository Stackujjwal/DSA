class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet= new boolean[26];
        for(int i =0;i<sentence.length();i++){
            char c = sentence.charAt(i);
            alphabet[c-'a']=true;
        } 
        for(int i =0;i<alphabet.length;i++){
            if(alphabet[i]==false){
                return false;
            }
           
        }
        return true;
    }
}