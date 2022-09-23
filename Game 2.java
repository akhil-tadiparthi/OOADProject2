import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;


public class Game {
    public static void main(String[] args) { //Main function to initialize the Adventure Class with all the character.
        //obj.checkAdjacency("1-0-0"); 
        Adventurer adventurer = new Adventurer(); //Initialize Adventure class
        adventurer.Brawler(); // Create Brawler
    }
}

class Adventurer{
    String currBrawler = "1-0-0";
    String currSneaker = "1-0-0";
    String currRunner = "1-0-0";
    String currThief = "1-0-0";

    public void Brawler() {
        Graph obj = new Graph(); //Initialize the Graph class
        obj.createGraph(currBrawler); //Create the graph with all the connections . This can be an exmaple of polymorphism since we are creating an instance of this graph as obj wiht a set properties. Later on in teh code, we create another instance of Graph class claeed graph with different requirements.
        //obj.checkAdjacency(currBrawler); //Checking adjacency list for adjacent vertices to the one passed in
         // this is the method that creates the room to use in the rest of the program
       //adj.checkAdjacency(currBrawler);
       //System.out.print(obj.s1); 
       
    }

    public void Sneaker() {


    }

    public void Runner() {


    }

    public void Thief() {


    }


}


class Graph {
    ArrayList<Object> vertices = new ArrayList<>();

    HashMap<Object, LinkedList<Object>> adjList = new HashMap(); //Hash map for adj list
    HashMap<Object, Integer>  indexes = new HashMap<>(); // indexes for location of the rooms
    int index = -1;

    public Graph(){}; // Graph constrctuor

    public Graph(ArrayList<Object> vertices) { // The graph function for looping through the vertices 
        for (int i = 0; i <vertices.size() ; i++) {
            Object vertex = vertices.get(i);
            LinkedList<Object> list = new LinkedList<>();
            adjList.put(vertex, list);
            indexes.put(vertex, ++index);
        }
    }

    public void addEdge(Object source, Object destination) { //Function to add an edge
        //add forward edge
        LinkedList<Object> list;
        list = adjList.get(source);
        list.addFirst(destination);
        adjList.put(source, list);
    }

    public void createGraph(String currr){ // Function that creates a graph
        //////////3D /////////////////
        String[][][] myArray = { { { "1-0-0", "1-0-1", "1-0-2" }, { "1-1-0", "1-1-1", "1-1-2" } , { "1-2-0", "1-2-1", "1-2-2" }}, { { "2-0-0", "2-0-1", "2-0-2" }, { "2-1-0", "2-1-1", "2-1-2" } , { "2-2-0", "2-2-1", "2-2-2" }}, { { "3-0-0", "3-0-1", "3-0-2" }, { "3-1-0", "3-1-1", "3-1-2" } , { "3-2-0", "3-2-1", "3-2-2" }}, { { "4-0-0", "4-0-1", "4-0-2" }, { "4-1-0", "4-1-1", "4-1-2" } , { "4-2-0", "4-2-1", "4-2-2" }}}; 
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 3; j++) { 
                for (int k = 0; k < 3; k++) { 
                    System.out.print(myArray[i][j][k]  + ": - : - " + "\t"); 
                }    
                System.out.println(); 
            } 
            System.out.println(); 
        } 

        /////////////-------------/////////////////All Variables 
        String t100; 
        t100 = myArray[0][0][0]; 
        vertices.add(t100);
        //System.out.println(t110);

        String t101; 
        t101 = myArray[0][0][1]; 
        vertices.add(t101);
        //System.out.println(t101);

        String t102; 
        t102 = myArray[0][0][2]; 
        vertices.add(t102);
        //System.out.println(t102);

        String t110; 
        t110 = myArray[0][1][0]; 
        vertices.add(t110);
        //System.out.println(t110);

        String Center_t111; 
        Center_t111 = myArray[0][1][1]; 
        vertices.add(Center_t111);
        //System.out.println(Center_t111);

        String t112; 
        t112 = myArray[0][1][2]; 
        vertices.add(t112);
        //System.out.println(t112);

        String t120; 
        t120 = myArray[0][2][0]; 
        vertices.add(t120);
        //System.out.println(t120);

        String t121; 
        t121 = myArray[0][2][1]; 
        vertices.add(t121);
        //System.out.println(t121);

        String t122; 
        t122 = myArray[0][2][2]; 
        vertices.add(t122);
        //System.out.println(t122);

        String t200; 
        t200 = myArray[1][0][0]; 
        vertices.add(t200);
        //System.out.println(t200);

        String t201; 
        t201 = myArray[1][0][1];
        vertices.add(t201); 
        //System.out.println(t201);

        String t202; 
        t202 = myArray[1][0][2]; 
        vertices.add(t202);
        //System.out.println(t202);

        String t210; 
        t210 = myArray[1][1][0];
        vertices.add(t210); 
       //System.out.println(t210);

        String Center_t211; 
        Center_t211 = myArray[1][1][1];
        vertices.add(Center_t211);
        //System.out.println(Center_t211);

        String t212; 
        t212 = myArray[1][1][2]; 
        vertices.add(t212);
        //System.out.println(t212);

        String t220; 
        t220 = myArray[1][2][0]; 
        vertices.add(t220);
        //System.out.println(t220);

        String t221; 
        t221 = myArray[1][2][1];
        vertices.add(t221); 
        //System.out.println(t221);

        String t222; 
        t222 = myArray[1][2][2];
        vertices.add(t222); 
        //System.out.println(t222);

        String t300; 
        t300 = myArray[2][0][0]; 
        vertices.add(t300);
        //System.out.println(t300);

        String t301; 
        t301 = myArray[2][0][1]; 
        vertices.add(t301);
        //System.out.println(t301);

        String t302; 
        t302 = myArray[2][0][2]; 
        vertices.add(t302);
        //System.out.println(t302);

        String t310; 
        t310 = myArray[2][1][0]; 
        vertices.add(t310);
        //System.out.println(t310);

        String Center_t311; 
        Center_t311 = myArray[2][1][1];
        vertices.add(Center_t311); 
        //System.out.println(Center_t311);

        String t312; 
        t312 = myArray[2][1][2];
        vertices.add(t312); 
        //System.out.println(t312);

        String t320; 
        t320 = myArray[2][2][0]; 
        vertices.add(t320);
        //System.out.println(t320);

        String t321; 
        t321 = myArray[2][2][1]; 
        vertices.add(t321);
        //System.out.println(t321);

        String t322; 
        t322 = myArray[2][2][2]; 
        vertices.add(t322);
        //System.out.println(t322);

        String t400; 
        t400 = myArray[3][0][0]; 
        vertices.add(t400);
        //System.out.println(t400);

        String t401; 
        t401 = myArray[3][0][1];
        vertices.add(t401); 
        //System.out.println(t401);

        String t402; 
        t402 = myArray[3][0][2]; 
        vertices.add(t402);
        //System.out.println(t402);

        String t410; 
        t410 = myArray[3][1][0];
        vertices.add(t410); 
        //System.out.println(t410);

        String Center_t411; 
        Center_t411 = myArray[3][1][1]; 
        vertices.add(Center_t411);
        //System.out.println(Center_t411);

        String t412; 
        t412 = myArray[3][1][2]; 
        vertices.add(t412);
        //System.out.println(t412);

        String t420; 
        t420 = myArray[3][2][0];
        vertices.add(t420); 
        //System.out.println(t420);

        String t421; 
        t421 = myArray[3][2][1]; 
        vertices.add(t421);
        //System.out.println(t421);

        String t422; 
        t422 = myArray[3][2][2]; 
        vertices.add(t422);
        //System.out.println(t422);

        Graph graph = new Graph(vertices);

        //level 1
        ////////////----------------/////////// Checks if it is connected 
        graph.addEdge(t100, t101);
        graph.addEdge(t100, t110);

        graph.addEdge(t101, t102);
        graph.addEdge(t101, t100);
        graph.addEdge(t101, Center_t111);

        graph.addEdge(t102, t112);
        graph.addEdge(t102, t101);

        graph.addEdge(t110, t120);
        graph.addEdge(t110, Center_t111);
        graph.addEdge(t110, t100);

        graph.addEdge(Center_t111, t101);
        graph.addEdge(Center_t111, t110);
        graph.addEdge(Center_t111, t121);
        graph.addEdge(Center_t111, t112);

        graph.addEdge(t112, t102);
        graph.addEdge(t112, Center_t111);
        graph.addEdge(t112, t122);

        graph.addEdge(t120, t110);
        graph.addEdge(t120, t121);
        
        graph.addEdge(t121, t120);
        graph.addEdge(t121, Center_t111);
        graph.addEdge(t121, t122);

        graph.addEdge(t122, t112);
        graph.addEdge(t122, t121);


        //////////level 2
        graph.addEdge(t200, t201);
        graph.addEdge(t200, t210);

        graph.addEdge(t201, t202);
        graph.addEdge(t201, t200);
        graph.addEdge(t201, Center_t211);

        graph.addEdge(t202, t212);
        graph.addEdge(t202, t201);

        graph.addEdge(t210, t220);
        graph.addEdge(t210, Center_t211);
        graph.addEdge(t210, t200);

        graph.addEdge(Center_t211, t201);
        graph.addEdge(Center_t211, t210);
        graph.addEdge(Center_t211, t221);
        graph.addEdge(Center_t211, t212);

        graph.addEdge(t212, t202);
        graph.addEdge(t212, Center_t211);
        graph.addEdge(t212, t222);

        graph.addEdge(t220, t210);
        graph.addEdge(t220, t221);

        graph.addEdge(t221, t220);
        graph.addEdge(t221, Center_t211);
        graph.addEdge(t221, t222);

        graph.addEdge(t222, t212);
        graph.addEdge(t222, t221);


        //////////////level 3
        graph.addEdge(t300, t301);
        graph.addEdge(t300, t310);

        graph.addEdge(t301, t302);
        graph.addEdge(t301, t300);
        graph.addEdge(t301, Center_t311);

        graph.addEdge(t302, t312);
        graph.addEdge(t302, t301);

        graph.addEdge(t310, t320);
        graph.addEdge(t310, Center_t311);
        graph.addEdge(t310, t300);

        graph.addEdge(Center_t311, t301);
        graph.addEdge(Center_t311, t310);
        graph.addEdge(Center_t311, t321);
        graph.addEdge(Center_t311, t312);

        graph.addEdge(t312, t302);
        graph.addEdge(t312, Center_t311);
        graph.addEdge(t312, t222);

        graph.addEdge(t320, t310);
        graph.addEdge(t320, t321);
        
        graph.addEdge(t321, t320);
        graph.addEdge(t321, Center_t311);
        graph.addEdge(t321, t322);

        graph.addEdge(t322, t312);
        graph.addEdge(t322, t321);


        //level 4
        graph.addEdge(t400, t401);
        graph.addEdge(t400, t410);

        graph.addEdge(t401, t402);
        graph.addEdge(t401, t400);
        graph.addEdge(t401, Center_t411);

        graph.addEdge(t402, t412);
        graph.addEdge(t402, t401);

        graph.addEdge(t410, t420);
        graph.addEdge(t410, Center_t411);
        graph.addEdge(t410, t400);

        graph.addEdge(Center_t411, t401);
        graph.addEdge(Center_t411, t410);
        graph.addEdge(Center_t411, t421);
        graph.addEdge(Center_t411, t412);

        graph.addEdge(t412, t402);
        graph.addEdge(t412, Center_t411);
        graph.addEdge(t412, t422);

        graph.addEdge(t420, t410);
        graph.addEdge(t420, t421);

        graph.addEdge(t421, t420);
        graph.addEdge(t421, Center_t411);
        graph.addEdge(t421, t422);

        graph.addEdge(t422, t412);
        graph.addEdge(t422, t421);

        graph.checkAdjacency(currr);
    }


    Object firstAdjacent;
    Object secondAdjacent;
    Object thirdAdjacent;
    Object fourthAdjacent;
    String s1;
    String s2;
    String s3;
    String s4;


    public void printGraph() { //Funciton that goes through the graph and prints it
            String vertex1 = "1-1-1";
            System.out.print("Vertex " + vertex1 + " is connected to: ");
            LinkedList<Object> list = adjList.get(vertex1);
            for (int i = 0; i <list.size() ; i++) {
                if(i == 0){
                    firstAdjacent = list.get(i);
                    System.out.print("First Adjacency" + firstAdjacent);
                }else if(i == 1){
                    secondAdjacent = list.get(i);
                    System.out.print("Second Adjacency" + secondAdjacent);
                }else if(i == 2){
                    thirdAdjacent = list.get(i);
                    System.out.print("Third Adjacency" + thirdAdjacent);
                }else if(i == 3){
                    fourthAdjacent = list.get(i);
                    System.out.print("Fourth Adjacency" + fourthAdjacent);
                }
            }
            System.out.println();
    }

    public void checkAdjacency(String curr) { // Function to check the adjacent vertices 
        String vertex1 = curr;
        //System.out.print("Vertex " + vertex1 + " is connected to: ");
        LinkedList<Object> list = adjList.get(vertex1);
        for (int i = 0; i <list.size() ; i++) {
            if(i == 0){
                firstAdjacent = list.get(i);
                System.out.print("First Adjacency" + firstAdjacent); // Saves the first adjacent to a variable
                s1 = firstAdjacent.toString();
            }else if(i == 1){
                secondAdjacent = list.get(i);
                System.out.print("Second Adjacency" + secondAdjacent); // Saves the second adjacent to a variable 
                s2 = secondAdjacent.toString();
            }else if(i == 2){
                thirdAdjacent = list.get(i);
                System.out.print("Third Adjacency" + thirdAdjacent); // Saves the third adjacent to a variable 
                s3 = thirdAdjacent.toString();
            }else if(i == 3){
                fourthAdjacent = list.get(i);
                System.out.print("Fourth Adjacency" + fourthAdjacent); // Saves the fourth adjacent to a variable 
                s4 = fourthAdjacent.toString();
            }
        }
   }  
}


class Board{
    ArrayList<String> test4 = new ArrayList<String>();
    public void display3(ArrayList<String> adventurers_location){
        test4 = adventurers_location; 
        test4.add("123");
        System.out.println(test4);
    }
}




