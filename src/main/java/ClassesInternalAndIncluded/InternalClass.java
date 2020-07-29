package ClassesInternalAndIncluded;

import sun.nio.cs.Surrogate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InternalClass {
    private static Integer idCount = 0;
    public Integer membersCount = 0;
    public List<Internal> members = new ArrayList<>();

    public class Internal {
        //      FIELDS
        private Integer id;

        //      STANDARD METHODS
        public Internal() {
            this.id = idCount + 1;
            membersCount++;
            idCount++;
            members.add(this);
        }

        public Integer getId() {
            return id;
        }


        //      SPECIAL METHODS
        public boolean belongTo(InternalClass var) {
            return InternalClass.this == var;
        }
    }   //      END OF CLASS INTERNAL

    public Internal adder() {
        return new Internal();
    }

    @Override
    public String toString() {
        return "InternalClass{" +
                "membersCount = " + membersCount + "\n" +
                ", members = " + Arrays.toString(members.stream().map(Internal::getId).toArray()) +
                '}';
    }

    public void adder(Integer value) {
        for (int i = 0; i < value; i++) {
            new Internal();
        }


    }

}
