import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 请根据 Node 的数据结构，
// 为其增加先序遍历方法(即先打印父节点内容，包括 id,text， 再从左到右打印子节点内容)，
// 代码直接写在下方的方框中即可
public class Node {
    public String id;
    public String text;
    public String parentId;
    private List<Node> children = new ArrayList();

    // 先序遍历方法
    public static void prePrint(Node n){
        String nodeInfo = String.format("id %s, text %s", n.id, n.text);
        System.out.println(nodeInfo);

        int childrenSize = n.children.size();

        if(childrenSize == 0){
            return;
        }else {
            for (Node child : n.children) {
                if(child.parentId != null && n.id != null && child.parentId.equals(n.id)) {
                   prePrint(child);
                }
            }
        }
    }


    public static void main(String[] args) {
        Node n31 = new Node();
        n31.id = "31";
        n31.text = "31";
        n31.parentId = "21";

        Node n32 = new Node();
        n32.id = "32";
        n32.text = "32";
        n32.parentId = "22";


        Node n21 = new Node();
        n21.id = "21";
        n21.text = "21";
        n21.parentId = "11";
        n21.children = Arrays.asList(n31);

        Node n22 = new Node();
        n22.id = "22";
        n22.text = "22";
        n22.parentId = "11";
        n22.children = Arrays.asList(n32);

        Node n11 = new Node();
        n11.id = "11";
        n11.text = "11";
        n11.children = Arrays.asList(n21, n22);


        prePrint(n11);
    }
}
