深度优先
	首先访问一个相邻顶点，继续访问相邻顶点的一个相邻顶点，重复执行直到不存在相邻顶点。
	DFS代码模板
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if(root==null){
            return allResults;
        }
        travel(root,0,allResults);
        return allResults;
    }


    private void travel(TreeNode root,int level,List<List<Integer>> results){
        if(results.size()==level){//每一层开辟新空间存储
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if(root.left!=null){
            travel(root.left,level+1,results);
        }
        if(root.right!=null){
            travel(root.right,level+1,results);
        }
    }
广度优先
	广度优先遍历的方式为，一次性访问当前顶点的所有未访问状态相邻顶点，并依次对每个相邻顶点执行同样处理。
	BFS代码模板
//Java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if (root == null) {
        return allResults;
    }
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
        int size = nodes.size();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = nodes.poll();
            results.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        allResults.add(results);
    }
    return allResults;
}

DFS BFS
遍历顺序

二分查找
前提条件：
	1、目标函数单调性，按顺序排列（单调增或减）
	2、存在上下界
	3、能够索引访问
代码模板
public int binarySearch(int[] array, int target) {
    int left = 0, right = array.length - 1, mid;
    while (left <= right) {
        mid = (right - left) / 2 + left;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return -1;
}

查找33过程
	第一步：Mid=31 target=33
	第二步：33>31 Mid = 35
	第三步：35<33 Mid = 33 return

贪心算法
	贪心是一种在每一步选择中都采取在当前状态下最好或最优的选择，从而希望导致结构是全局最好或者最优的算法。
与动态规划区别：
	贪心：每个子问题的解决方案都做出选择不能回退。
	动态规划：动态规划会保存以前的运算结构，并根据以前的结果对当前进行选择，有回退功能。
适用场景：
	贪心可以解决一些最优化问题：最新生成树、哈夫曼编码
	可以用作辅助算法或者解决结果不是特别精确的问题。（处处最优并非最终最优）
