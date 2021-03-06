package TEST;

import COMMAND.FindCommand;
import LOGIC.DataStatic;
import LOGIC.StartLogic;
import STRUCT.MyPoint;
import STRUCT.Situation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String []args){
        //测试寻找地图
        List<Integer> pathValues=new ArrayList<>(50);
        new FindCommand().findPath(new StartLogic().findMap(4),pathValues);
        //测试排序
       /* ArrayList<MyPoint> boxPoints=new ArrayList<>(50);
        boxPoints.add(new MyPoint(1,2));
        boxPoints.add(new MyPoint(2,3));
        boxPoints.add(new MyPoint(5,4));
        boxPoints.add(new MyPoint(7,6));
        boxPoints.add(new MyPoint(1,3));
        boxPoints.add(new MyPoint(4,2));
        boxPoints.add(new MyPoint(3,5));
        Collections.sort(boxPoints);//将箱子节点排序
        for(MyPoint myPoint:boxPoints){//遍历箱子节点
            System.out.println("("+myPoint.x+","+myPoint.y+")");
        }*/
       //测试比较几个不同或者相同的Situation
        /*DataStatic.chang=6;
        DataStatic.kuan=6;
        DataStatic.boxNum=2;
        char map1[][]={{'#','#','#','#','#','#'},
                {'#','.','-','-','-','#'},
                {'#','-','-','$','-','#'},
                {'#','-','$','@','-','#'},
                {'#','-','-','-','.','#'},
                {'#','#','#','#','#','#'}};
        char map2[][]={{'#','#','#','#','#','#'},
                {'#','.','-','-','-','#'},
                {'#','-','-','-','-','#'},
                {'#','$','$','@','-','#'},
                {'#','-','-','-','.','#'},
                {'#','#','#','#','#','#'}};
        char map3[][]={{'#','#','#','#','#','#'},
                {'#','.','-','-','@','#'},
                {'#','-','-','$','-','#'},
                {'#','-','$','-','-','#'},
                {'#','-','-','-','.','#'},
                {'#','#','#','#','#','#'}};
        Situation si1=new Situation(map1,null);
        Situation si2=new Situation(map2,null);
        Situation si3=new Situation(map3,null);
        System.out.println(si1.equals(si2));
        System.out.println(si1.equals(si3));*/
        //测试可以到达地方的填充
        /*char map[][]=new StartLogic().findMap(1);
        Situation nowSitu=new Situation(map,null);
        new BoundaryFilling().fill(map,nowSitu.getFillPoint(),nowSitu.getPeoplePoint());
        for(MyPoint myPoint:nowSitu.getFillPoint()){//遍历箱子节点
            System.out.println("("+myPoint.x+","+myPoint.y+")");
        }*/
    }
}
