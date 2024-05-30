/* Link - https://www.interviewbit.com/problems/even-reverse/ */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
ListNode* Solution::solve(ListNode* A) {
if(A==NULL || A->next==NULL || A->next->next==NULL)
    return A;
   
    ListNode * p = A;
    ListNode * odd=A, * temp;
    ListNode * even = NULL;
   
    int count=1;
    while(odd!=NULL && odd->next!=NULL)
    {
        temp=odd->next;
        odd->next=temp->next;
        temp->next=even;
        even=temp;
        odd=odd->next;
    }
    odd=A;
   
    while(even!=NULL)
    {
        temp=even->next;
        even->next=odd->next;
        odd->next=even;
        odd=odd->next->next;
        even=temp;
    }
    return A;
}
