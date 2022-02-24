class Solution {
    List<List<Integer>> ans;
	int count = 1;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ans = new ArrayList<>();
        List<List<Integer>> edge = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			edge.add(new ArrayList<>());
		}
		for(int i = 0; i < connections.size(); i++){
			int u = connections.get(i).get(0);
			int v = connections.get(i).get(1);
			edge.get(u).add(v);
			edge.get(v).add(u);
		}
        
        int[] par = new int[n]; // par = parent
		par[0] = -1;
		int[] disc = new int[n]; //disc = discovery rank
		int[] low = new int[n]; //min rank
		
		boolean[] vis = new boolean[n];
		dfs(0, edge, vis, par, disc, low);
        
        return ans;
    }
    
    public void dfs(int n, List<List<Integer>> edge, boolean[] vis, int[] par, int[] disc, int[] low) {
		vis[n] = true;
		disc[n] = count;
		low[n] = count;
		count++;
		
		for(int nbr : edge.get(n)) {
			if(par[n] == nbr)
				continue;
			else if(vis[nbr] == true)
				low[n] = Math.min(low[n], disc[nbr]);
			else {
				par[nbr] = n;
				dfs(nbr, edge, vis, par, disc, low);
				low[n] = Math.min(low[n], low[nbr]);
				if(low[nbr] > disc[n]) {
                    List<Integer> toadd = new ArrayList<>();
                    toadd.add(n);
                    toadd.add(nbr);
                    ans.add(toadd);
				}
			}
		}
	}
}