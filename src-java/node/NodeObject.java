package node;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Array;
import java.util.Arrays;

public class NodeObject {
     private final long handle;

     public NodeObject(long handle) {
          this.handle = handle;
     }
     
     public long getHandle() {
          return this.handle;
     }
}
