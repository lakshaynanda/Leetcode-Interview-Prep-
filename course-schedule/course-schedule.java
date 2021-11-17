class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < numCourses; i++) {
            List<Integer> adjacencyList = new ArrayList<>();
            graph.put(i, adjacencyList);
        }
        for(int[] prereq: prerequisites) {
            graph.get(prereq[1]).add(prereq[0]);
        }
        boolean []hasbeenprocessed = new boolean[numCourses];
        boolean []isPath = new boolean[numCourses];
        
        for(int i = 0; i < numCourses; i++) {
            if(isCyclic(i, hasbeenprocessed, isPath, graph)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isCyclic(int node, boolean[] hasbeenprocessed, boolean[] isPath, Map<Integer, List<Integer>> graph) {
        if(hasbeenprocessed[node]) {
            return false;
        }
        if(isPath[node]) {
            return true;
        } else {
            isPath[node] = true;
            for(int neighbour : graph.get(node)) {
                if(isCyclic(neighbour, hasbeenprocessed, isPath, graph)) {
                    return true;
                }
            }
            isPath[node] = false;
            hasbeenprocessed[node] = true;
            return false;
        }
    }
}