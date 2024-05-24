/* Link - https://www.interviewbit.com/problems/partition-list/ */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
ListNode* Solution::partition(ListNode* A, int B) {
    ListNode* temp1 = A;
    ListNode* temp2 = A;
    vector<int>C;
    while(temp2 && temp1){
        // temp2 to traverse list first time
        if(temp2->val<B){
            temp1->val=temp2->val;
            temp1=temp1->next;
        }
        else C.push_back(temp2->val);
        temp2=temp2->next;
    }
    int i = 0;
    while(temp1 && i < C.size()){
        temp1->val = C[i++];
        temp1=temp1->next;
    }
    return A;
}
