import java.util.*;

class DynamicListTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DynamicList<Character> characterlist = new DynamicList<Character>(1);
    DynamicList<String> stringlist = new DynamicList<String>(1);
    DynamicList<Integer> integerlist = new DynamicList<Integer>(1);;
    DynamicList<Float> floatlist = new DynamicList<Float>(1);
    String type = sc.nextLine();
    String command = "";
    command = sc.nextLine();
    while (!(command.equals("end"))) {
      if (type.equals("I")) {
        StringTokenizer st = new StringTokenizer(command, " ");
        while(st.hasMoreTokens()) {
          String command1 = st.nextToken();
          if (command1.equals("add")) {
            integerlist.add(Integer.parseInt(st.nextToken()));
          }
          if (command1.equals("removeIndex")) {
            integerlist.remove(Integer.parseInt(st.nextToken()));  
          } if (command1.equals("removeElement")) {
            integerlist.removeElement(Integer.parseInt(st.nextToken()));
          }
          if (command1.equals("read")) {
            integerlist.read(Integer.parseInt(st.nextToken()));
          }
          if (command1.equals("modifyIndex")) {
            integerlist.modifyIndex(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));  
          } 
          if (command1.equals("modifyElement")) {
            integerlist.modifyElement(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
          }
          if (command1.equals("print")) {
            integerlist.print();
          }
        }
      }
      if (type.equals("C")) {
        StringTokenizer st = new StringTokenizer(command, " ");
        while(st.hasMoreTokens()) {
          String command1 = st.nextToken();
          if (command1.equals("add")) {
            characterlist.add(st.nextToken().charAt(0));
          }
          if (command1.equals("removeIndex")) {
            characterlist.remove(Integer.parseInt(st.nextToken()));  
          } 
          if (command1.equals("removeElement")) {
            characterlist.removeElement(st.nextToken().charAt(0));
          }
          if (command1.equals("read")) {
            characterlist.read(Integer.parseInt(st.nextToken()));
          }
          if (command1.equals("modifyIndex")) {
            characterlist.modifyIndex(Integer.parseInt(st.nextToken()), st.nextToken().charAt(0));  
          } 
          if(command1.equals("modifyElement")) {
            characterlist.modifyElement(st.nextToken().charAt(0), st.nextToken().charAt(0));
          }
          if (command1.equals("print")) {
            characterlist.print();
          }
        }
      }
      if (type.equals("S")) {
        StringTokenizer st = new StringTokenizer(command, " ");
        while(st.hasMoreTokens()) {
          String command1 = st.nextToken();
          if (command1.equals("add")) {
            stringlist.add(st.nextToken());
          }
          if (command1.equals("removeIndex")) {
            stringlist.remove(Integer.parseInt(st.nextToken()));  
          } 
          if (command1.equals("removeElement")) {
            stringlist.removeElement(st.nextToken());
          }
          if (command1.equals("read")) {
            stringlist.read(Integer.parseInt(st.nextToken()));
          }
          if (command1.equals("modifyIndex")) {
            stringlist.modifyIndex(Integer.parseInt(st.nextToken()), st.nextToken());  
          } 
          if(command1.equals("modifyElement")) {
              stringlist.modifyElement(st.nextToken(), st.nextToken());
          }
          if (command1.equals("print")) {
            stringlist.print();
          }
        } 
      }
      if (type.equals("F")) {
        StringTokenizer st = new StringTokenizer(command, " ");
        while(st.hasMoreTokens()) {
          String command1 = st.nextToken();
          if (command1.equals("add")) {
            floatlist.add(Float.valueOf(st.nextToken()));
          }
          if (command1.equals("removeIndex")) {
          floatlist.remove(Integer.parseInt(st.nextToken()));  
          } 
          if (command1.equals("removeElement")) {
            floatlist.removeElement(Float.valueOf(st.nextToken()));
          }
          if (command1.equals("read")) {
            floatlist.read(Integer.parseInt(st.nextToken()));
          }
          if (command1.equals("modifyIndex")) {
            floatlist.modifyIndex(Integer.parseInt(st.nextToken()), Float.valueOf(st.nextToken()));  
          } if (command1.equals("modifyElement")) {
            floatlist.modifyElement(Float.valueOf(st.nextToken()), Float.valueOf(st.nextToken()));
          }
          if (command1.equals("print")) {
            floatlist.print();
          }
        } 
      }
      command = sc.nextLine();
    }
  }
}