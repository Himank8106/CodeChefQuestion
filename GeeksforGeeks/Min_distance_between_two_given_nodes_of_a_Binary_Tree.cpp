class Solution{
    public:
    unordered_map<int,vector<int>>adj;
    
    void inorder(Node *r){
        if(!r)return;
        if(r->left){
            adj[r->data].push_back(r->left->data);
            adj[r->left->data].push_back(r->data);
            inorder(r->left);
        }
        if(r->right){
            adj[r->data].push_back(r->right->data);
            adj[r->right->data].push_back(r->data);
            inorder(r->right);
        }
    }
    
    int findDist(Node* root, int a, int b) {
        inorder(root);
        queue<int>q;                    q.push(a);
        unordered_map<int,bool>vis;     vis[a]=true;
        int level=1;
        
        while(!q.empty()){
            int si=q.size();
            while(si--){
                int node=q.front();     q.pop();
                for(auto c:adj[node]){
                    if(!vis.count(c)){
                        if(c==b)return level;
                        q.push(c);
                        vis[c]=true;
                    }
                }
            }
            level++;
        }
        
        return 0;
    }
};
