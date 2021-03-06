输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。

假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

示例 1:
```
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

**解法1**

***先序遍历：***  
定义：先访问节点，然后先序遍历其左子树，再先序遍历其右子树。  
遍历结果特点：
- 第一个节点为树的根节点，其后的节点从前到后依次是根节点的左子树和右子树。
  ```
  [根, 左子树, 右子树]
  ```

***中序遍历：***    
定义：先中序遍历节点左子树，然后访问节点，再中序遍历节点右子树。  
遍历结果特点：
- 如果某个节点为根，则该节点左子孙节点位于其左侧，该节点右子孙节点位于其右侧。
  ```
  [左子树, 根, 右子树]
  ```

思路：
1. 通过先序遍历结果得到树的根节点
2. 在中序遍历结果中找到根节点的位置，根节点所有左子孙节点，根节点所有右子孙节点
3. 得到根节点左右子树的先序遍历结果和中序遍历结果
4. 递归

时间复杂度：递归访问每个节点，因此时间复杂度为O(n)。  
空间复杂度：需要用一个空间O(n)的map保存每个节点在中序遍历结果中的位置，递归占用的栈空间为O(h)，h表示树的深度，h < n，因此空间复杂度为O(n)。  
