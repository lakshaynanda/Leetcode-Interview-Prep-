class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int[] topological = new int[numCourses];
        int[] indegree = new int[numCourses];
        
        for(int i = 0; i < prerequisites.length; i++) {
            int src = prerequisites[i][1];
            int dest = prerequisites[i][0];
            
            List<Integer> list = adjList.getOrDefault(src, new ArrayList<>());
            list.add(dest);
            adjList.put(src, list);
            indegree[dest]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        
        int i = 0;
        while (!q.isEmpty()) {
            int node = q.remove();
            topological[i++] = node;
            
            if (adjList.containsKey(node)) {
                for(Integer neighbour: adjList.get(node)) {
                    indegree[neighbour]--;
                    if(indegree[neighbour] == 0) {
                        q.add(neighbour);
                    }
                }
                
            }
        }
        if (i == numCourses) {
            return true;
        }
        return false;
    }
}