/* Link - https://www.interviewbit.com/problems/remove-nth-node-from-list-end/ */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
ListNode* Solution::removeNthFromEnd(ListNode* A, int B) {
    ListNode* head=A;
    ListNode* slow=A,*fast=A;
    B++;
    while(B && fast!=NULL){
        fast=fast->next;
        B--;
    }
    if(B) return head->next;
    while(fast!=NULL){
        fast=fast->next;
        slow=slow->next;
    }
    slow->next=slow->next->next;
    return head;
}
