package ClassesInternalAndIncluded;

public class IncludedClass {

    private static class Included {
        final String name;
        Integer power;
        final Integer id;

        public Included(String name, Integer amount, Integer id) {
            this.name = name;
            this.power = amount;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public Integer getAmount() {
            return power;
        }

        public void setAmount(Integer amount) {
            this.power = amount;
        }

        public Integer getId() {
            return id;
        }
    } //    END OF INCLUDED CLASS
}
