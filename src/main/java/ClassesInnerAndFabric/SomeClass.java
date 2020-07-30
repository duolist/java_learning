package ClassesInnerAndFabric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomeClass {
    private static Integer idCount = 0;
    public Integer membersCount = 0;
    public List<InternalClass> members = new ArrayList<>();

    public class InternalClass {
        //      FIELDS
        private Integer id;

        //      STANDARD METHODS
        public InternalClass() {
            this.id = idCount + 1;
            membersCount++;
            idCount++;
            members.add(this);
        }

        public Integer getId() {
            return id;
        }


        //      SPECIAL METHODS

        /**
         * Проверяет, принадлежит ли текущий объект к передаваемому экземпляру внешнего класса
         *
         * @param var эксземпляр внешнего класса
         * @return boolean
         */
        public boolean belongTo(SomeClass var) {
            return SomeClass.this == var;
        }
    }   //      END OF CLASS INTERNAL

    public InternalClass adder() {
        return new InternalClass();
    }

    @Override
    public String toString() {
        return "InternalClass{" +
                "membersCount = " + membersCount + "\n" +
                ", members = " + Arrays.toString(members.stream().map(InternalClass::getId).toArray()) +
                '}';
    }

    public void adder(Integer value) {
        for (int i = 0; i < value; i++) {
            new InternalClass();
        }


    }

}
