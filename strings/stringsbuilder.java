package strings;

import java.net.SocketPermission;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class stringsbuilder {
public static void main(String args[]) {
StringBuilder sb= new StringBuilder("tony");
sb.setCharAt(0, 'p');
System.out.println(sb);
}   
}