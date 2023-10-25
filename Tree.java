class Tree {
   int minValue(Node node) {
        if(node != null) {
            int min = node.data;
            if(node.left != null) {
                return minValue(node.left);
            }
            return min;
        }
        return -1;

}
}