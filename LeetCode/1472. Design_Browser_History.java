/* Link - https://leetcode.com/problems/design-browser-history */

class BrowserHistory {
    String[] history;
    int currentPage;
    int maxPage;
    public BrowserHistory(String homepage) {
        currentPage=0;
        maxPage = 0;
        history = new String[101];
        history[currentPage] = homepage;
    }

    public void visit(String url) {
        currentPage++;
        history[currentPage] =url;
        maxPage = currentPage;
    }

    public String back(int steps) {
        currentPage = Math.max(0, currentPage - steps);
        return history[currentPage];
    }

    public String forward(int steps) {
        currentPage = Math.min(maxPage, currentPage + steps);
        return history[currentPage];
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

