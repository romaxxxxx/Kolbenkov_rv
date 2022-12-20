package HomeWorkOPP;

    public class Employee {
        private String FNP;
        private String post;
        private String email;
        private String phone;
        private Integer salary;
        private Integer age;

        public Employee(String FNP, String post, String email, String phone, Integer salary, Integer age) {
            this.FNP = FNP;
            this.post = post;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        void view() {
            System.out.println(this.FNP + " " + this.post + " " + this.email + " " + this.phone + " " + this.salary + " " + this.age);
        }

        public String getFNP() {
            return this.FNP;
        }

        public String getPost() {
            return this.post;
        }

        public String getEmail() {
            return this.email;
        }

        public String getPhone() {
            return this.phone;
        }

        public Integer getSalary() {
            return this.salary;
        }

        public Integer getAge() {
            return this.age;
        }
    }
