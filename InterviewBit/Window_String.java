/* Link - https://www.interviewbit.com/problems/window-string/ */

string Solution::minWindow(string s, string p) {
 
    int hash_s[256]={0};
       int hash_p[256]={0};
       if(s.length()<p.length())return "";
       
       for(int i=0;i<p.length();i++)
       hash_p[p[i]]++;
       
       int start=0;
       int min_len=INT_MAX; 
       int start_index=-1;
       int count=0;
       
       for(int i=0;i<s.length();i++){
           hash_s[s[i]]++;
           
           if(hash_s[s[i]]<=hash_p[s[i]])
           count++;
           
        
        if(count==p.length()){   
            while(hash_s[s[start]]>hash_p[s[start]] || hash_p[s[start]]==0){
               if(hash_s[s[start]]>hash_p[s[start]])
               hash_s[s[start]]--;
               
               start++;
           }
          int len=i-start+1;
          if(min_len>len){
          min_len=len;
          start_index=start;}
       
} 
}

    if(start_index==-1)
    return "";
    else
    return s.substr(start_index,min_len);
}
