/* Link - https://www.interviewbit.com/problems/reverse-alternate-k-nodes/ */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
ListNode* Solution::solve(ListNode* A, int B) {
    int ind=0;
    if(B==1) return A;
    ListNode* last=NULL,*first=NULL,*temp=A;
    while(temp!=NULL){
        if(ind%2==0){
            ListNode* temp1=temp;
            ListNode* ch=NULL;
            ListNode* first=temp;
            int k=B;
            while(k--){
                temp1=temp->next;
                temp->next=ch;
                ch=temp;
                temp=temp1;
            }
            first->next=temp1;
            if(ind==0) A=ch;
            else{
                last->next=ch;
            }
        }
        else{
            int k=B;
            k--;
            while(k--){
                temp=temp->next;
            }
            last=temp;
            temp=temp->next;
        }
        ind++;
    }
    return A;
}
