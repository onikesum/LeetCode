class Solution {
    public int findCenter(int[][] edges) {
        // 첫 번째 간선의 두 노드를 가져옵니다.
        int node1 = edges[0][0];
        int node2 = edges[0][1];

        // 두 번째 간선에서 공통 노드를 찾습니다.
        if (edges[1][0] == node1 || edges[1][1] == node1) {
            return node1;
        } else {
            return node2;
        }
}
}