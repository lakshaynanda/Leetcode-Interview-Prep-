class Twitter {
    class Node{
        int userId;
        int tweetId;
        Node next;
        
        Node(){}
        
        Node(int userId, int tweetId){
            this.userId = userId;
            this.tweetId = tweetId;
        }
        
        Node(int userId, int tweetId, Node next){
            this.userId = userId;
            this.tweetId = tweetId;
            this.next = next;
        }
    }
    
    HashMap<Integer, HashSet<Integer>> connections;
    
    Node head;
    
    /** Initialize your data structure here. */
    public Twitter() {
        connections = new HashMap<>();
        head = new Node(0,0);
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        insert(new Node(userId, tweetId));
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        connections.putIfAbsent(userId, new HashSet<>());
        
        List<Integer> l = new ArrayList<>();
        
        Node curr = head.next;
        
        while(curr != null && l.size() < 10){
            if(connections.get(userId).contains(curr.userId) || userId == curr.userId)
                l.add(curr.tweetId);
            
            curr = curr.next;
        }
        
        return l;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        connections.putIfAbsent(followerId, new HashSet<>());
        
        connections.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        connections.putIfAbsent(followerId, new HashSet<>());
        
        if(connections.get(followerId).contains(followeeId))
            connections.get(followerId).remove(followeeId);
    }
    
    public void insert(Node node){
        node.next = head.next;
        head.next = node;
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */